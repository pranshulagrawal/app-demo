package com.application.app.modules.notificationoffer.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class NotificationOfferModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtNotification: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notification)

)
