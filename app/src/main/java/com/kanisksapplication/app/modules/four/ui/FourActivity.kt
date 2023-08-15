package com.kanisksapplication.app.modules.four.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kanisksapplication.app.R
import com.kanisksapplication.app.appcomponents.base.BaseActivity
import com.kanisksapplication.app.databinding.ActivityFourBinding
import com.kanisksapplication.app.modules.five.ui.FiveActivity
import com.kanisksapplication.app.modules.four.`data`.viewmodel.FourVM
import kotlin.String
import kotlin.Unit

class FourActivity : BaseActivity<ActivityFourBinding>(R.layout.activity_four) {
  private val viewModel: FourVM by viewModels<FourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.fourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleOne.setOnClickListener {
      val destIntent = FiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
