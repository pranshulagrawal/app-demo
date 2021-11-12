package com.application.app.modules.notification.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityNotificationBinding
import com.application.app.modules.notification.`data`.model.Notification1RowModel
import com.application.app.modules.notification.`data`.viewmodel.NotificationVM
import com.application.app.modules.notification2.ui.Notification2Activity
import com.application.app.modules.notificationfeed.ui.NotificationFeedActivity
import com.application.app.modules.notificationoffer.ui.NotificationOfferActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class NotificationActivity :
    BaseActivity<ActivityNotificationBinding>(R.layout.activity_notification) {
  private val viewModel: NotificationVM by viewModels<NotificationVM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerList(
    view: View,
    position: Int,
    item: Notification1RowModel
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
                                        override fun onItemClick(view:View, position:Int, item :
                        Notification1RowModel)
                            {
                                            onClickRecyclerList(view, position, item)
                                        }
                                    }
                                    )
    viewModel.recyclerListList.observe(this) {
                                        recyclerListAdapter.updateData(it)
                                    }
    binding.notificationVM = viewModel
  }

  public fun onClickRecyclerListLinear(
    view: View,
    position: Int,
    item: Notification1RowModel
  ): Unit {
    when(0) {
                            0 ->  {
                              val destIntent = Notification2Activity.getIntent(this, null)
                              startActivity(destIntent)
                            }


                            1 ->  {
                              val destIntent = NotificationFeedActivity.getIntent(this, null)
                              startActivity(destIntent)
                            }
                            2 ->  {
                              val destIntent = NotificationOfferActivity.getIntent(this, null)
                              startActivity(destIntent)
                            }
                            }
  }

  public companion object {
    public const val TAG: String = "NOTIFICATION_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
