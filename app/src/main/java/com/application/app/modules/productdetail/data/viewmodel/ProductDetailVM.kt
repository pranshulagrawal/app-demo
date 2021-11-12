package com.application.app.modules.productdetail.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.productdetail.`data`.model.ProductDetail1RowModel
import com.application.app.modules.productdetail.`data`.model.ProductDetailModel
import kotlin.collections.MutableList

public class ProductDetailVM : ViewModel() {
  public val productDetailModel: MutableLiveData<ProductDetailModel> =
      MutableLiveData(ProductDetailModel())

  public val recyclerRecomendedList: MutableLiveData<MutableList<ProductDetail1RowModel>> =
      MutableLiveData(mutableListOf())
}
