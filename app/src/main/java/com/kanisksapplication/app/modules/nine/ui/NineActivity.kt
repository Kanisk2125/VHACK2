package com.kanisksapplication.app.modules.nine.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kanisksapplication.app.R
import com.kanisksapplication.app.appcomponents.base.BaseActivity
import com.kanisksapplication.app.databinding.ActivityNineBinding
import com.kanisksapplication.app.modules.nine.`data`.viewmodel.NineVM
import com.kanisksapplication.app.modules.six.ui.SixActivity
import kotlin.String
import kotlin.Unit

class NineActivity : BaseActivity<ActivityNineBinding>(R.layout.activity_nine) {
  private val viewModel: NineVM by viewModels<NineVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.nineVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.toolbarToolbar.setOnClickListener {
      val destIntent = SixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "NINE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NineActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
