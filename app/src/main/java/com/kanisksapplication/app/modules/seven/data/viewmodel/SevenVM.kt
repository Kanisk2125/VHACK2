package com.kanisksapplication.app.modules.seven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kanisksapplication.app.modules.seven.`data`.model.SevenModel
import com.kanisksapplication.app.modules.seven.`data`.model.SevenRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SevenVM : ViewModel(), KoinComponent {
  val sevenModel: MutableLiveData<SevenModel> = MutableLiveData(SevenModel())

  var navArguments: Bundle? = null

  val sevenList: MutableLiveData<MutableList<SevenRowModel>> = MutableLiveData(mutableListOf())
}
