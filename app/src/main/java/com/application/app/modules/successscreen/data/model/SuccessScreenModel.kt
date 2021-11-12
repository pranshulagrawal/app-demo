package com.application.app.modules.successscreen.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class SuccessScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSuccess: String? = MyApp.getInstance().resources.getString(R.string.lbl_success)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtThankYouForS: String? =
      MyApp.getInstance().resources.getString(R.string.msg_thank_you_for_s)

)
