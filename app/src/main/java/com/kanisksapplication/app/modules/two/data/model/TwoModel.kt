package com.kanisksapplication.app.modules.two.`data`.model

import com.kanisksapplication.app.R
import com.kanisksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHelptheenviro: String? =
      MyApp.getInstance().resources.getString(R.string.msg_help_the_enviro)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJointhemoveme: String? =
      MyApp.getInstance().resources.getString(R.string.msg_join_the_moveme)

)
