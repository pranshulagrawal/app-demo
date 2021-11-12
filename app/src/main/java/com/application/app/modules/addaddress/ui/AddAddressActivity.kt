package com.application.app.modules.addaddress.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAddAddressBinding
import com.application.app.modules.addaddress.`data`.viewmodel.AddAddressVM
import kotlin.String
import kotlin.Unit

public class AddAddressActivity :
    BaseActivity<ActivityAddAddressBinding>(R.layout.activity_add_address) {
  private val viewModel: AddAddressVM by viewModels<AddAddressVM>()

  public override fun setUpClicks(): Unit {
  }

  public override fun onInitialized(): Unit {
    binding.addAddressVM = viewModel
  }

  public companion object {
    public const val TAG: String = "ADD_ADDRESS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddAddressActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
