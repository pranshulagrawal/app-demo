package com.application.app.modules.orderdetails.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class OrderDetails1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtNikeAirZoomP: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_zoom_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt29943: String? = MyApp.getInstance().resources.getString(R.string.lbl_299_43)

)
