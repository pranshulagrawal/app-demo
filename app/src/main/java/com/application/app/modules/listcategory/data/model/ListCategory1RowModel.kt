package com.application.app.modules.listcategory.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class ListCategory1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtShirt: String? = MyApp.getInstance().resources.getString(R.string.lbl_shirt)

)
