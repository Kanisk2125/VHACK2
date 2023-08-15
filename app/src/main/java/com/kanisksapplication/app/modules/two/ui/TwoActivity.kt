package com.kanisksapplication.app.modules.two.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kanisksapplication.app.R
import com.kanisksapplication.app.appcomponents.base.BaseActivity
import com.kanisksapplication.app.databinding.ActivityTwoBinding
import com.kanisksapplication.app.modules.three.ui.ThreeActivity
import com.kanisksapplication.app.modules.two.`data`.viewmodel.TwoVM
import kotlin.String
import kotlin.Unit

class TwoActivity : BaseActivity<ActivityTwoBinding>(R.layout.activity_two) {
  private val viewModel: TwoVM by viewModels<TwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.twoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageIlustraodoc.setOnClickListener {
      val destIntent = ThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
