package com.kanisksapplication.app.modules.five.`data`.model

import com.kanisksapplication.app.R
import com.kanisksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FiveModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBookanAppoint: String? =
      MyApp.getInstance().resources.getString(R.string.msg_book_an_appoint)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFillinthedet: String? =
      MyApp.getInstance().resources.getString(R.string.msg_fill_in_the_det)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_select_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_time)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTen: String? = MyApp.getInstance().resources.getString(R.string.lbl_am_pm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVenue: String? = MyApp.getInstance().resources.getString(R.string.lbl_venue)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContactNo: String? = MyApp.getInstance().resources.getString(R.string.lbl_contact_no)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClickandChoos: String? =
      MyApp.getInstance().resources.getString(R.string.msg_click_and_choos)

)
