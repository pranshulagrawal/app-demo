package com.application.app.modules.dashboard.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityDashboardBinding
import com.application.app.modules.dashboard.`data`.model.Dashboard1RowModel
import com.application.app.modules.dashboard.`data`.model.Dashboard2RowModel
import com.application.app.modules.dashboard.`data`.model.Dashboard3RowModel
import com.application.app.modules.dashboard.`data`.model.Dashboard4RowModel
import com.application.app.modules.dashboard.`data`.viewmodel.DashboardVM
import com.application.app.modules.favoriteproduct.ui.FavoriteProductActivity
import com.application.app.modules.listcategory.ui.ListCategoryActivity
import com.application.app.modules.notification.ui.NotificationActivity
import com.application.app.modules.productdetail.ui.ProductDetailActivity
import com.application.app.modules.search.ui.SearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class DashboardActivity : BaseActivity<ActivityDashboardBinding>(R.layout.activity_dashboard)
    {
  private val viewModel: DashboardVM by viewModels<DashboardVM>()

  public override fun setUpClicks(): Unit {
    binding.image2.setOnClickListener {

          val destIntent = NotificationActivity.getIntent(this, null)
          startActivity(destIntent)

        }
    binding.txtSearchProduct.setOnClickListener {

          val destIntent = SearchActivity.getIntent(this, null)
          startActivity(destIntent)

        }
    binding.image1.setOnClickListener {

          val destIntent = FavoriteProductActivity.getIntent(this, null)
          startActivity(destIntent)

        }
    binding.txtMoreCategory.setOnClickListener {

          val destIntent = ListCategoryActivity.getIntent(this, null)
          startActivity(destIntent)

        }
  }

  public fun onClickRecyclerCategories(
    view: View,
    position: Int,
    item: Dashboard1RowModel
  ): Unit {
    when(view.id) {


        }
  }

  public fun onClickRecyclerFlashSaleProduct(
    view: View,
    position: Int,
    item: Dashboard2RowModel
  ): Unit {
    when(view.id) {
        R.id.linear1 ->  {
          val destIntent = ProductDetailActivity.getIntent(this, null)
          startActivity(destIntent)
        }


        }
  }

  public fun onClickRecyclerMegaSaleProduct(
    view: View,
    position: Int,
    item: Dashboard3RowModel
  ): Unit {
    when(view.id) {


        }
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: Dashboard4RowModel
  ): Unit {
    when(view.id) {


        }
  }

  public override fun onInitialized(): Unit {
    val recyclerCategoriesAdapter =
                               
                   
        RecyclerCategoriesAdapter(viewModel.recyclerCategoriesList.value?:mutableListOf())
    binding.recyclerCategories.adapter = recyclerCategoriesAdapter
    recyclerCategoriesAdapter.setOnItemClickListener(
                        object : RecyclerCategoriesAdapter.OnItemClickListener {
                            override fun onItemClick(view:View, position:Int, item :
        Dashboard1RowModel)
            {
                                onClickRecyclerCategories(view, position, item)
                            }
                        }
                        )
    viewModel.recyclerCategoriesList.observe(this) {
                            recyclerCategoriesAdapter.updateData(it)
                        }
    val recyclerFlashSaleProductAdapter =
                               
                   
               
           
        RecyclerFlashSaleProductAdapter(viewModel.recyclerFlashSaleProductList.value?:mutableListOf())
    binding.recyclerFlashSaleProduct.adapter = recyclerFlashSaleProductAdapter
    recyclerFlashSaleProductAdapter.setOnItemClickListener(
                        object : RecyclerFlashSaleProductAdapter.OnItemClickListener {
                            override fun onItemClick(view:View, position:Int, item :
        Dashboard2RowModel)
            {
                                onClickRecyclerFlashSaleProduct(view, position, item)
                            }
                        }
                        )
    viewModel.recyclerFlashSaleProductList.observe(this) {
                            recyclerFlashSaleProductAdapter.updateData(it)
                        }
    val recyclerMegaSaleProductAdapter =
                               
                   
               
           
        RecyclerMegaSaleProductAdapter(viewModel.recyclerMegaSaleProductList.value?:mutableListOf())
    binding.recyclerMegaSaleProduct.adapter = recyclerMegaSaleProductAdapter
    recyclerMegaSaleProductAdapter.setOnItemClickListener(
                        object : RecyclerMegaSaleProductAdapter.OnItemClickListener {
                            override fun onItemClick(view:View, position:Int, item :
        Dashboard3RowModel)
            {
                                onClickRecyclerMegaSaleProduct(view, position, item)
                            }
                        }
                        )
    viewModel.recyclerMegaSaleProductList.observe(this) {
                            recyclerMegaSaleProductAdapter.updateData(it)
                        }
    val recyclerViewAdapter =
                               
        RecyclerViewAdapter(viewModel.recyclerViewList.value?:mutableListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
                        object : RecyclerViewAdapter.OnItemClickListener {
                            override fun onItemClick(view:View, position:Int, item :
        Dashboard4RowModel)
            {
                                onClickRecyclerView(view, position, item)
                            }
                        }
                        )
    viewModel.recyclerViewList.observe(this) {
                            recyclerViewAdapter.updateData(it)
                        }
    binding.dashboardVM = viewModel
  }

  public companion object {
    public const val TAG: String = "DASHBOARD_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DashboardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
