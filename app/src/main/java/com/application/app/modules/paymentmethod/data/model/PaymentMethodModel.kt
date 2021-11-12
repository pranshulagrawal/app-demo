package com.application.app.modules.paymentmethod.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class PaymentMethodModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPayment: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment)

)
