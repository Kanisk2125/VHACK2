package com.kanisksapplication.app.modules.seven.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.kanisksapplication.app.R
import com.kanisksapplication.app.appcomponents.base.BaseActivity
import com.kanisksapplication.app.databinding.ActivitySevenBinding
import com.kanisksapplication.app.modules.seven.`data`.model.SevenRowModel
import com.kanisksapplication.app.modules.seven.`data`.viewmodel.SevenVM
import com.kanisksapplication.app.modules.six.ui.SixActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SevenActivity : BaseActivity<ActivitySevenBinding>(R.layout.activity_seven) {
  private val viewModel: SevenVM by viewModels<SevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val sevenAdapter = SevenAdapter(viewModel.sevenList.value?:mutableListOf())
    binding.recyclerSeven.adapter = sevenAdapter
    sevenAdapter.setOnItemClickListener(
    object : SevenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SevenRowModel) {
        onClickRecyclerSeven(view, position, item)
      }
    }
    )
    viewModel.sevenList.observe(this) {
      sevenAdapter.updateData(it)
    }
    binding.sevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnConfirm.setOnClickListener {
      val destIntent = SixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerSeven(
    view: View,
    position: Int,
    item: SevenRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SEVEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SevenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
