package com.application.app.modules.filter.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class FilterModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtFilterSearch: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_filter_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPriceRange: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_price_range)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1245: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_245)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt9344: String? = MyApp.getInstance().resources.getString(R.string.lbl_9_344)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCondition: String? = MyApp.getInstance().resources.getString(R.string.lbl_condition)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBuyingFormat: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_buying_format)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtItemLocation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_item_location)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtShowOnly: String? = MyApp.getInstance().resources.getString(R.string.lbl_show_only)

)
