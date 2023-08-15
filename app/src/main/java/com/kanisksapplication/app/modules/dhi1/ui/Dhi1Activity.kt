package com.kanisksapplication.app.modules.dhi1.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.kanisksapplication.app.R
import com.kanisksapplication.app.appcomponents.base.BaseActivity
import com.kanisksapplication.app.databinding.ActivityDhi1Binding
import com.kanisksapplication.app.modules.dhi1.`data`.viewmodel.Dhi1VM
import com.kanisksapplication.app.modules.two.ui.TwoActivity
import kotlin.String
import kotlin.Unit

class Dhi1Activity : BaseActivity<ActivityDhi1Binding>(R.layout.activity_dhi_1) {
  private val viewModel: Dhi1VM by viewModels<Dhi1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.dhi1VM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = TwoActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.imagePremiumVector.setOnClickListener {
        val destIntent = TwoActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "DHI1ACTIVITY"

    }
  }
