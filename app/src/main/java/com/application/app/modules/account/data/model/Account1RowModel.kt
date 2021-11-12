package com.application.app.modules.account.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Account1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
