package com.application.app.modules.productdetail.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityProductDetailBinding
import com.application.app.modules.cart.ui.CartActivity
import com.application.app.modules.productdetail.`data`.model.ProductDetail1RowModel
import com.application.app.modules.productdetail.`data`.viewmodel.ProductDetailVM
import com.application.app.modules.reviewproduct.ui.ReviewProductActivity
import com.application.app.modules.search.ui.SearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ProductDetailActivity :
    BaseActivity<ActivityProductDetailBinding>(R.layout.activity_product_detail) {
  private val viewModel: ProductDetailVM by viewModels<ProductDetailVM>()

  public override fun setUpClicks(): Unit {
    binding.txtSeeMore.setOnClickListener {

              val destIntent = ReviewProductActivity.getIntent(this, null)
              startActivity(destIntent)

            }
    binding.btnAddToCart.setOnClickListener {

              val destIntent = CartActivity.getIntent(this, null)
              startActivity(destIntent)

            }
    binding.image1.setOnClickListener {

              val destIntent = SearchActivity.getIntent(this, null)
              startActivity(destIntent)

            }
  }

  public fun onClickRecyclerRecomended(
    view: View,
    position: Int,
    item: ProductDetail1RowModel
  ): Unit {
    when(view.id) {


            }
  }

  public override fun onInitialized(): Unit {
    val recyclerRecomendedAdapter =
                                   
                       
            RecyclerRecomendedAdapter(viewModel.recyclerRecomendedList.value?:mutableListOf())
    binding.recyclerRecomended.adapter = recyclerRecomendedAdapter
    recyclerRecomendedAdapter.setOnItemClickListener(
                            object : RecyclerRecomendedAdapter.OnItemClickListener {
                                override fun onItemClick(view:View, position:Int, item :
                ProductDetail1RowModel)
                    {
                                    onClickRecyclerRecomended(view, position, item)
                                }
                            }
                            )
    viewModel.recyclerRecomendedList.observe(this) {
                                recyclerRecomendedAdapter.updateData(it)
                            }
    binding.productDetailVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PRODUCT_DETAIL_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProductDetailActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
