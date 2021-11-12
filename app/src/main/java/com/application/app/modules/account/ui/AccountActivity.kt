package com.application.app.modules.account.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAccountBinding
import com.application.app.modules.account.`data`.model.Account1RowModel
import com.application.app.modules.account.`data`.viewmodel.AccountVM
import com.application.app.modules.addpayment.ui.AddPaymentActivity
import com.application.app.modules.notification.ui.NotificationActivity
import com.application.app.modules.profile.ui.ProfileActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class AccountActivity : BaseActivity<ActivityAccountBinding>(R.layout.activity_account) {
  private val viewModel: AccountVM by viewModels<AccountVM>()

  public override fun setUpClicks(): Unit {
    binding.image.setOnClickListener {

      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public fun onClickRecyclerList(
    view: View,
    position: Int,
    item: Account1RowModel
  ): Unit {
    when(view.id) {
    R.id.linear ->  {
      onClickRecyclerListLinear(view, position, item)
    }


    }
  }

  public override fun onInitialized(): Unit {
    val recyclerListAdapter =
                            RecyclerListAdapter(viewModel.recyclerListList.value?:mutableListOf())
    binding.recyclerList.adapter = recyclerListAdapter
    recyclerListAdapter.setOnItemClickListener(
                    object : RecyclerListAdapter.OnItemClickListener {
                        override fun onItemClick(view:View, position:Int, item : Account1RowModel) {
                            onClickRecyclerList(view, position, item)
                        }
                    }
                    )
    viewModel.recyclerListList.observe(this) {
                        recyclerListAdapter.updateData(it)
                    }
    binding.accountVM = viewModel
  }

  public fun onClickRecyclerListLinear(
    view: View,
    position: Int,
    item: Account1RowModel
  ): Unit {
    when(0) {
    0 ->  {
      val destIntent = AddPaymentActivity.getIntent(this, null)
      startActivity(destIntent)
    }


    1 ->  {
    }
    2 ->  {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    }
  }

  public companion object {
    public const val TAG: String = "ACCOUNT_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AccountActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
