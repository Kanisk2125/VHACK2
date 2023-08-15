package com.kanisksapplication.app.modules.seven.`data`.model

import com.kanisksapplication.app.R
import com.kanisksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SevenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_scrap_item)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelecttheitem: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_the_ite)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPapers: String? = MyApp.getInstance().resources.getString(R.string.lbl_papers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUploadScrapim: String? =
      MyApp.getInstance().resources.getString(R.string.msg_upload_scrap_im)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPricesmaygou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_prices_may_go_u)

)
