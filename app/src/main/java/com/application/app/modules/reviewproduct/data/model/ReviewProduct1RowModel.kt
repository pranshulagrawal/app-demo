package com.application.app.modules.reviewproduct.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class ReviewProduct1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtJamesLawson: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_james_lawson)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAirMaxAreAlw: String? =
      MyApp.getInstance().resources.getString(R.string.msg_air_max_are_alw)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDecember1020: String? =
      MyApp.getInstance().resources.getString(R.string.msg_december_10_20)

)
