package com.application.app.modules.lailyfafebrinacard.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityLailyfaFebrinaCardBinding
import com.application.app.modules.creditcardanddebit.ui.CreditCardAndDebitActivity
import com.application.app.modules.lailyfafebrinacard.`data`.viewmodel.LailyfaFebrinaCardVM
import kotlin.String
import kotlin.Unit

public class LailyfaFebrinaCardActivity :
    BaseActivity<ActivityLailyfaFebrinaCardBinding>(R.layout.activity_lailyfa_febrina_card) {
  private val viewModel: LailyfaFebrinaCardVM by viewModels<LailyfaFebrinaCardVM>()

  public override fun setUpClicks(): Unit {
    binding.btnSave.setOnClickListener {

      val destIntent = CreditCardAndDebitActivity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public override fun onInitialized(): Unit {
    binding.lailyfaFebrinaCardVM = viewModel
  }

  public companion object {
    public const val TAG: String = "LAILYFA_FEBRINA_CARD_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LailyfaFebrinaCardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
