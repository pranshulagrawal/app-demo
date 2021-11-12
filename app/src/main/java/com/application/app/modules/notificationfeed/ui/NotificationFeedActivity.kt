package com.application.app.modules.notificationfeed.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityNotificationFeedBinding
import com.application.app.modules.notificationfeed.`data`.model.NotificationFeed1RowModel
import com.application.app.modules.notificationfeed.`data`.viewmodel.NotificationFeedVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class NotificationFeedActivity :
    BaseActivity<ActivityNotificationFeedBinding>(R.layout.activity_notification_feed) {
  private val viewModel: NotificationFeedVM by viewModels<NotificationFeedVM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerList(
    view: View,
    position: Int,
    item: NotificationFeed1RowModel
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
            NotificationFeed1RowModel)
                {
                            onClickRecyclerList(view, position, item)
                        }
                    }
                    )
    viewModel.recyclerListList.observe(this) {
                        recyclerListAdapter.updateData(it)
                    }
    binding.notificationFeedVM = viewModel
  }

  public companion object {
    public const val TAG: String = "NOTIFICATION_FEED_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationFeedActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
