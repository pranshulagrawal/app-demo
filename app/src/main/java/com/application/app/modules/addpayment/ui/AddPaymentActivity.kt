package com.application.app.modules.addpayment.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAddPaymentBinding
import com.application.app.modules.addpayment.`data`.model.AddPayment1RowModel
import com.application.app.modules.addpayment.`data`.viewmodel.AddPaymentVM
import com.application.app.modules.creditcardanddebit.ui.CreditCardAndDebitActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class AddPaymentActivity :
    BaseActivity<ActivityAddPaymentBinding>(R.layout.activity_add_payment) {
  private val viewModel: AddPaymentVM by viewModels<AddPaymentVM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerList(
    view: View,
    position: Int,
    item: AddPayment1RowModel
  ): Unit {
    when(view.id) {
        R.id.linear ->  {
          val destIntent = CreditCardAndDebitActivity.getIntent(this, null)
          startActivity(destIntent)
        }


        }
  }

  public override fun onInitialized(): Unit {
    val recyclerListAdapter =
                            RecyclerListAdapter(viewModel.recyclerListList.value?:mutableListOf())
    binding.recyclerList.adapter = recyclerListAdapter
    recyclerListAdapter.setOnItemClickListener(
                    object : RecyclerListAdapter.OnItemClickListener {
                        override fun onItemClick(view:View, position:Int, item :
        AddPayment1RowModel) {
                            onClickRecyclerList(view, position, item)
                        }
                    }
                    )
    viewModel.recyclerListList.observe(this) {
                        recyclerListAdapter.updateData(it)
                    }
    binding.addPaymentVM = viewModel
  }

  public companion object {
    public const val TAG: String = "ADD_PAYMENT_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddPaymentActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
