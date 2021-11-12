package com.application.app.modules.orderdetails.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.orderdetails.`data`.model.OrderDetails1RowModel
import com.application.app.modules.orderdetails.`data`.model.OrderDetailsModel
import kotlin.collections.MutableList

public class OrderDetailsVM : ViewModel() {
  public val orderDetailsModel: MutableLiveData<OrderDetailsModel> =
      MutableLiveData(OrderDetailsModel())

  public val recyclerProductList: MutableLiveData<MutableList<OrderDetails1RowModel>> =
      MutableLiveData(mutableListOf())
}
