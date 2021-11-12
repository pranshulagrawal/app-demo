package com.application.app.modules.order.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class OrderModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtOrder: String? = MyApp.getInstance().resources.getString(R.string.lbl_order)

)
