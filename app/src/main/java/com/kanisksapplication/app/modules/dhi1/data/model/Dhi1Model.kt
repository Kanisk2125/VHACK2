package com.kanisksapplication.app.modules.dhi1.`data`.model

import com.kanisksapplication.app.R
import com.kanisksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Dhi1Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcometoReec: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_to_reec)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecleeisthes: String? =
      MyApp.getInstance().resources.getString(R.string.msg_reclee_is_the_s)

)
