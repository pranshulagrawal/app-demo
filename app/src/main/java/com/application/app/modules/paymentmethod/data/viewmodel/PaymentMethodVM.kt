package com.application.app.modules.paymentmethod.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.paymentmethod.`data`.model.PaymentMethod1RowModel
import com.application.app.modules.paymentmethod.`data`.model.PaymentMethodModel
import kotlin.collections.MutableList

public class PaymentMethodVM : ViewModel() {
  public val paymentMethodModel: MutableLiveData<PaymentMethodModel> =
      MutableLiveData(PaymentMethodModel())

  public val recyclerPaymentListList: MutableLiveData<MutableList<PaymentMethod1RowModel>> =
      MutableLiveData(mutableListOf())
}
