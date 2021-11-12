package com.application.app.modules.orderdetails.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityOrderDetailsBinding
import com.application.app.modules.orderdetails.`data`.model.OrderDetails1RowModel
import com.application.app.modules.orderdetails.`data`.viewmodel.OrderDetailsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class OrderDetailsActivity :
    BaseActivity<ActivityOrderDetailsBinding>(R.layout.activity_order_details) {
  private val viewModel: OrderDetailsVM by viewModels<OrderDetailsVM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerProduct(
    view: View,
    position: Int,
    item: OrderDetails1RowModel
  ): Unit {
    when(view.id) {


        }
  }

  public override fun onInitialized(): Unit {
    val recyclerProductAdapter =
                           
        RecyclerProductAdapter(viewModel.recyclerProductList.value?:mutableListOf())
    binding.recyclerProduct.adapter = recyclerProductAdapter
    recyclerProductAdapter.setOnItemClickListener(
                    object : RecyclerProductAdapter.OnItemClickListener {
                        override fun onItemClick(view:View, position:Int, item :
        OrderDetails1RowModel)
            {
                            onClickRecyclerProduct(view, position, item)
                        }
                    }
                    )
    viewModel.recyclerProductList.observe(this) {
                        recyclerProductAdapter.updateData(it)
                    }
    binding.orderDetailsVM = viewModel
  }

  public companion object {
    public const val TAG: String = "ORDER_DETAILS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OrderDetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
