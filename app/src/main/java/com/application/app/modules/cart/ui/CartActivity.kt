package com.application.app.modules.cart.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityCartBinding
import com.application.app.modules.cart.`data`.model.Cart1RowModel
import com.application.app.modules.cart.`data`.viewmodel.CartVM
import com.application.app.modules.notification.ui.NotificationActivity
import com.application.app.modules.shipto.ui.ShipToActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class CartActivity : BaseActivity<ActivityCartBinding>(R.layout.activity_cart) {
  private val viewModel: CartVM by viewModels<CartVM>()

  public override fun setUpClicks(): Unit {
    binding.btnCheckOut.setOnClickListener {

      val destIntent = ShipToActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.image.setOnClickListener {

      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public fun onClickRecyclerCartList(
    view: View,
    position: Int,
    item: Cart1RowModel
  ): Unit {
    when(view.id) {


    }
  }

  public override fun onInitialized(): Unit {
    val recyclerCartListAdapter =
                           
            RecyclerCartListAdapter(viewModel.recyclerCartListList.value?:mutableListOf())
    binding.recyclerCartList.adapter = recyclerCartListAdapter
    recyclerCartListAdapter.setOnItemClickListener(
                    object : RecyclerCartListAdapter.OnItemClickListener {
                        override fun onItemClick(view:View, position:Int, item : Cart1RowModel) {
                            onClickRecyclerCartList(view, position, item)
                        }
                    }
                    )
    viewModel.recyclerCartListList.observe(this) {
                        recyclerCartListAdapter.updateData(it)
                    }
    binding.cartVM = viewModel
  }

  public companion object {
    public const val TAG: String = "CART_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CartActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
