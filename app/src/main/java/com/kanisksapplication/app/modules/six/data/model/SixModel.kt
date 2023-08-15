package com.kanisksapplication.app.modules.six.`data`.model

import com.kanisksapplication.app.R
import com.kanisksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SixModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtReecle: String? = MyApp.getInstance().resources.getString(R.string.lbl_reecle)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDONATE: String? = MyApp.getInstance().resources.getString(R.string.lbl_donate)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelptheneedy: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_help_the_needy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_good_evening)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatwouldyou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_would_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPapers: String? = MyApp.getInstance().resources.getString(R.string.lbl_papers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewspapersCar: String? =
      MyApp.getInstance().resources.getString(R.string.msg_newspapers_car)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPlastic: String? = MyApp.getInstance().resources.getString(R.string.lbl_plastic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOilcontainers: String? =
      MyApp.getInstance().resources.getString(R.string.msg_oil_containers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMetals: String? = MyApp.getInstance().resources.getString(R.string.lbl_metals)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUtensilscooler: String? =
      MyApp.getInstance().resources.getString(R.string.msg_utensils_cooler)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEWaste: String? = MyApp.getInstance().resources.getString(R.string.lbl_e_waste)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDisksmagnets: String? = MyApp.getInstance().resources.getString(R.string.msg_disks_magnets)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOtheritems: String? = MyApp.getInstance().resources.getString(R.string.lbl_other_items)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBeerBottlesM: String? =
      MyApp.getInstance().resources.getString(R.string.msg_beer_bottles_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRaisePickupRe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_raise_pickup_re)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.msg_shop_with_us)

)
