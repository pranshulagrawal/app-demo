package com.application.app.modules.addcard.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.addcard.`data`.model.AddCardModel

public class AddCardVM : ViewModel() {
  public val addCardModel: MutableLiveData<AddCardModel> = MutableLiveData(AddCardModel())
}
