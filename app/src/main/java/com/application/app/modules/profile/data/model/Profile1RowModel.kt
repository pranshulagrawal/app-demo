package com.application.app.modules.profile.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Profile1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtGender: String? = MyApp.getInstance().resources.getString(R.string.lbl_gender)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMale: String? = MyApp.getInstance().resources.getString(R.string.lbl_male)

)
