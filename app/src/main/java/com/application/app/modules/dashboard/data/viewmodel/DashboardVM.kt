package com.application.app.modules.dashboard.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.dashboard.`data`.model.Dashboard1RowModel
import com.application.app.modules.dashboard.`data`.model.Dashboard2RowModel
import com.application.app.modules.dashboard.`data`.model.Dashboard3RowModel
import com.application.app.modules.dashboard.`data`.model.Dashboard4RowModel
import com.application.app.modules.dashboard.`data`.model.DashboardModel
import kotlin.collections.MutableList

public class DashboardVM : ViewModel() {
  public val dashboardModel: MutableLiveData<DashboardModel> = MutableLiveData(DashboardModel())

  public val recyclerCategoriesList: MutableLiveData<MutableList<Dashboard1RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerFlashSaleProductList: MutableLiveData<MutableList<Dashboard2RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerMegaSaleProductList: MutableLiveData<MutableList<Dashboard3RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerViewList: MutableLiveData<MutableList<Dashboard4RowModel>> =
      MutableLiveData(mutableListOf())
}
