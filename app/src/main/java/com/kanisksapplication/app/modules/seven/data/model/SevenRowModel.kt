package com.kanisksapplication.app.modules.seven.`data`.model

import com.kanisksapplication.app.R
import com.kanisksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SevenRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNewspapers: String? = MyApp.getInstance().resources.getString(R.string.lbl_news_papers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_9_12)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKg: String? = MyApp.getInstance().resources.getString(R.string.lbl_kg)

)
