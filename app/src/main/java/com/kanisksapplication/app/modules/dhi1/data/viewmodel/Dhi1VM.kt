package com.kanisksapplication.app.modules.dhi1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kanisksapplication.app.modules.dhi1.`data`.model.Dhi1Model
import org.koin.core.KoinComponent

class Dhi1VM : ViewModel(), KoinComponent {
  val dhi1Model: MutableLiveData<Dhi1Model> = MutableLiveData(Dhi1Model())

  var navArguments: Bundle? = null
}
