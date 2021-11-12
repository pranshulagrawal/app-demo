package com.application.app.modules.paymentmethod.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityPaymentMethodBinding
import com.application.app.modules.choosecreditordebitcard.ui.ChooseCreditOrDebitCardActivity
import com.application.app.modules.paymentmethod.`data`.model.PaymentMethod1RowModel
import com.application.app.modules.paymentmethod.`data`.viewmodel.PaymentMethodVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class PaymentMethodActivity :
    BaseActivity<ActivityPaymentMethodBinding>(R.layout.activity_payment_method) {
  private val viewModel: PaymentMethodVM by viewModels<PaymentMethodVM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerPaymentList(
    view: View,
    position: Int,
    item: PaymentMethod1RowModel
  ): Unit {
    when(view.id) {
        R.id.linear ->  {
          val destIntent = ChooseCreditOrDebitCardActivity.getIntent(this, null)
          startActivity(destIntent)
        }


        }
  }

  public override fun onInitialized(): Unit {
    val recyclerPaymentListAdapter =
                           
                RecyclerPaymentListAdapter(viewModel.recyclerPaymentListList.value?:mutableListOf())
    binding.recyclerPaymentList.adapter = recyclerPaymentListAdapter
    recyclerPaymentListAdapter.setOnItemClickListener(
                    object : RecyclerPaymentListAdapter.OnItemClickListener {
                        override fun onItemClick(view:View, position:Int, item :
        PaymentMethod1RowModel)
            {
                            onClickRecyclerPaymentList(view, position, item)
                        }
                    }
                    )
    viewModel.recyclerPaymentListList.observe(this) {
                        recyclerPaymentListAdapter.updateData(it)
                    }
    binding.paymentMethodVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PAYMENT_METHOD_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PaymentMethodActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
