package com.application.app.modules.notification.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.notification.`data`.model.Notification1RowModel
import com.application.app.modules.notification.`data`.model.NotificationModel
import kotlin.collections.MutableList

public class NotificationVM : ViewModel() {
  public val notificationModel: MutableLiveData<NotificationModel> =
      MutableLiveData(NotificationModel())

  public val recyclerListList: MutableLiveData<MutableList<Notification1RowModel>> =
      MutableLiveData(mutableListOf())
}
