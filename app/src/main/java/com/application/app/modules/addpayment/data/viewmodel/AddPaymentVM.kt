package com.application.app.modules.addpayment.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.addpayment.`data`.model.AddPayment1RowModel
import com.application.app.modules.addpayment.`data`.model.AddPaymentModel
import kotlin.collections.MutableList

public class AddPaymentVM : ViewModel() {
  public val addPaymentModel: MutableLiveData<AddPaymentModel> = MutableLiveData(AddPaymentModel())

  public val recyclerListList: MutableLiveData<MutableList<AddPayment1RowModel>> =
      MutableLiveData(mutableListOf())
}
