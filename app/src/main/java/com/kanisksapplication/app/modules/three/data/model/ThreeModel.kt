package com.kanisksapplication.app.modules.three.`data`.model

import com.kanisksapplication.app.R
import com.kanisksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtReecle: String? = MyApp.getInstance().resources.getString(R.string.lbl_reecle)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecyclingmade: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recycling_made)

)
