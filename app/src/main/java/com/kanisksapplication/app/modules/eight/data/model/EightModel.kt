package com.kanisksapplication.app.modules.eight.`data`.model

import com.kanisksapplication.app.R
import com.kanisksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class EightModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBuyingOurRecy: String? =
      MyApp.getInstance().resources.getString(R.string.msg_buying_our_recy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_but_also_helps)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBuyHandmadeRe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_buy_handmade_re)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUsegentlyrec: String? =
      MyApp.getInstance().resources.getString(R.string.msg_use_gently_rec)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUsegentlyrecOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_use_gently_rec)

)
