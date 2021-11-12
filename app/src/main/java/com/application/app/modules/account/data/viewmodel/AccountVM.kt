package com.application.app.modules.account.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.account.`data`.model.Account1RowModel
import com.application.app.modules.account.`data`.model.AccountModel
import kotlin.collections.MutableList

public class AccountVM : ViewModel() {
  public val accountModel: MutableLiveData<AccountModel> = MutableLiveData(AccountModel())

  public val recyclerListList: MutableLiveData<MutableList<Account1RowModel>> =
      MutableLiveData(mutableListOf())
}
