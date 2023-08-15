package com.kanisksapplication.app.modules.three.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kanisksapplication.app.R
import com.kanisksapplication.app.appcomponents.base.BaseActivity
import com.kanisksapplication.app.databinding.ActivityThreeBinding
import com.kanisksapplication.app.modules.four.ui.FourActivity
import com.kanisksapplication.app.modules.three.`data`.viewmodel.ThreeVM
import kotlin.String
import kotlin.Unit

class ThreeActivity : BaseActivity<ActivityThreeBinding>(R.layout.activity_three) {
  private val viewModel: ThreeVM by viewModels<ThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.threeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageNarrowremoveb.setOnClickListener {
      val destIntent = FourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
