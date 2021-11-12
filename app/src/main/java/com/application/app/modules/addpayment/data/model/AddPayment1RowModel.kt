package com.application.app.modules.addpayment.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class AddPayment1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtCreditCardOr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_credit_card_or)

)
