package com.application.app.modules.choosecreditordebitcard.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.choosecreditordebitcard.`data`.model.ChooseCreditOrDebitCardModel

public class ChooseCreditOrDebitCardVM : ViewModel() {
  public val chooseCreditOrDebitCardModel: MutableLiveData<ChooseCreditOrDebitCardModel> =
      MutableLiveData(ChooseCreditOrDebitCardModel())
}
