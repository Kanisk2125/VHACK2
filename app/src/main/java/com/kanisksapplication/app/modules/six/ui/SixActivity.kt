package com.kanisksapplication.app.modules.six.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kanisksapplication.app.R
import com.kanisksapplication.app.appcomponents.base.BaseActivity
import com.kanisksapplication.app.databinding.ActivitySixBinding
import com.kanisksapplication.app.modules.eight.ui.EightActivity
import com.kanisksapplication.app.modules.five.ui.FiveActivity
import com.kanisksapplication.app.modules.seven.ui.SevenActivity
import com.kanisksapplication.app.modules.six.`data`.viewmodel.SixVM
import kotlin.String
import kotlin.Unit

class SixActivity : BaseActivity<ActivitySixBinding>(R.layout.activity_six) {
  private val viewModel: SixVM by viewModels<SixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.sixVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.viewRectangleFortyTwo.setOnClickListener {
      val destIntent = SevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.toolbarToolbar.setOnClickListener {
      val destIntent = EightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.viewRectangleSixteen.setOnClickListener {
      val destIntent = FiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SIX_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SixActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
