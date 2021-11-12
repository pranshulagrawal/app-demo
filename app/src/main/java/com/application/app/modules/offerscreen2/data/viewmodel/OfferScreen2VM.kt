package com.application.app.modules.offerscreen2.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.offerscreen2.`data`.model.OfferScreen2Model

public class OfferScreen2VM : ViewModel() {
  public val offerScreen2Model: MutableLiveData<OfferScreen2Model> =
      MutableLiveData(OfferScreen2Model())
}
