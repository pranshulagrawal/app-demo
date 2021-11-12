package com.application.app.modules.notificationoffer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityNotificationOfferBinding
import com.application.app.modules.notificationoffer.`data`.model.NotificationOffer1RowModel
import com.application.app.modules.notificationoffer.`data`.viewmodel.NotificationOfferVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class NotificationOfferActivity :
    BaseActivity<ActivityNotificationOfferBinding>(R.layout.activity_notification_offer) {
  private val viewModel: NotificationOfferVM by viewModels<NotificationOfferVM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerList(
    view: View,
    position: Int,
    item: NotificationOffer1RowModel
  ): Unit {
    when(view.id) {


    }
  }

  public override fun onInitialized(): Unit {
    val recyclerListAdapter =
                            RecyclerListAdapter(viewModel.recyclerListList.value?:mutableListOf())
    binding.recyclerList.adapter = recyclerListAdapter
    recyclerListAdapter.setOnItemClickListener(
                    object : RecyclerListAdapter.OnItemClickListener {
                        override fun onItemClick(view:View, position:Int, item :
            NotificationOffer1RowModel)
                {
                            onClickRecyclerList(view, position, item)
                        }
                    }
                    )
    viewModel.recyclerListList.observe(this) {
                        recyclerListAdapter.updateData(it)
                    }
    binding.notificationOfferVM = viewModel
  }

  public companion object {
    public const val TAG: String = "NOTIFICATION_OFFER_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationOfferActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
