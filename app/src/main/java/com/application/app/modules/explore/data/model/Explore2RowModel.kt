package com.application.app.modules.explore.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Explore2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtDress: String? = MyApp.getInstance().resources.getString(R.string.lbl_dress)

)
