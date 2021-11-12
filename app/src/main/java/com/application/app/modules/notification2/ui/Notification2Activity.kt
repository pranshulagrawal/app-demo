package com.application.app.modules.notification2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityNotification2Binding
import com.application.app.modules.notification2.`data`.model.Notification3RowModel
import com.application.app.modules.notification2.`data`.viewmodel.Notification2VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class Notification2Activity :
    BaseActivity<ActivityNotification2Binding>(R.layout.activity_notification2) {
  private val viewModel: Notification2VM by viewModels<Notification2VM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerList(
    view: View,
    position: Int,
    item: Notification3RowModel
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
        Notification3RowModel)
            {
                            onClickRecyclerList(view, position, item)
                        }
                    }
                    )
    viewModel.recyclerListList.observe(this) {
                        recyclerListAdapter.updateData(it)
                    }
    binding.notification2VM = viewModel
  }

  public companion object {
    public const val TAG: String = "NOTIFICATION2ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Notification2Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
