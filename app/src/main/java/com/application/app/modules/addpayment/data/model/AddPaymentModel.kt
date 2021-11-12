package com.application.app.modules.addpayment.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class AddPaymentModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPayment: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment)

)
