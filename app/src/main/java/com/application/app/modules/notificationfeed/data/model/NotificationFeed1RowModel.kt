package com.application.app.modules.notificationfeed.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class NotificationFeed1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtNewProduct: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_new_product)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNikeAirZoomP2: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_zoom_p2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtJune320155: String? =
      MyApp.getInstance().resources.getString(R.string.msg_june_3_2015_5)

)
