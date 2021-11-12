package com.application.app.modules.notificationfeed.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.notificationfeed.`data`.model.NotificationFeed1RowModel
import com.application.app.modules.notificationfeed.`data`.model.NotificationFeedModel
import kotlin.collections.MutableList

public class NotificationFeedVM : ViewModel() {
  public val notificationFeedModel: MutableLiveData<NotificationFeedModel> =
      MutableLiveData(NotificationFeedModel())

  public val recyclerListList: MutableLiveData<MutableList<NotificationFeed1RowModel>> =
      MutableLiveData(mutableListOf())
}
