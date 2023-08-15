package com.kanisksapplication.app.modules.eight.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kanisksapplication.app.R
import com.kanisksapplication.app.appcomponents.base.BaseActivity
import com.kanisksapplication.app.databinding.ActivityEightBinding
import com.kanisksapplication.app.modules.eight.`data`.viewmodel.EightVM
import com.kanisksapplication.app.modules.nine.ui.NineActivity
import kotlin.String
import kotlin.Unit

class EightActivity : BaseActivity<ActivityEightBinding>(R.layout.activity_eight) {
  private val viewModel: EightVM by viewModels<EightVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.eightVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtUsegentlyrec.setOnClickListener {
      val destIntent = NineActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "EIGHT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EightActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
