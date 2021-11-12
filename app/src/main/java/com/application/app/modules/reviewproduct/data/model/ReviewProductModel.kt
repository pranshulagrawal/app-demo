package com.application.app.modules.reviewproduct.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class ReviewProductModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txt5Review2: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_review2)

)
