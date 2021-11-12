package com.application.app.modules.notificationoffer.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.notificationoffer.`data`.model.NotificationOffer1RowModel
import com.application.app.modules.notificationoffer.`data`.model.NotificationOfferModel
import kotlin.collections.MutableList

public class NotificationOfferVM : ViewModel() {
  public val notificationOfferModel: MutableLiveData<NotificationOfferModel> =
      MutableLiveData(NotificationOfferModel())

  public val recyclerListList: MutableLiveData<MutableList<NotificationOffer1RowModel>> =
      MutableLiveData(mutableListOf())
}
