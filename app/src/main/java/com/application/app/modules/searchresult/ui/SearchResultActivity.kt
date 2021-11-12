package com.application.app.modules.searchresult.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySearchResultBinding
import com.application.app.modules.filter.ui.FilterActivity
import com.application.app.modules.searchresult.`data`.model.SearchResult1RowModel
import com.application.app.modules.searchresult.`data`.viewmodel.SearchResultVM
import com.application.app.modules.shortby.ui.ShortByActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class SearchResultActivity :
    BaseActivity<ActivitySearchResultBinding>(R.layout.activity_search_result) {
  private val viewModel: SearchResultVM by viewModels<SearchResultVM>()

  public override fun setUpClicks(): Unit {
    binding.image1.setOnClickListener {

              val destIntent = FilterActivity.getIntent(this, null)
              startActivity(destIntent)

            }
    binding.image.setOnClickListener {

              val destIntent = ShortByActivity.getIntent(this, null)
              startActivity(destIntent)

            }
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: SearchResult1RowModel
  ): Unit {
    when(view.id) {


            }
  }

  public override fun onInitialized(): Unit {
    val recyclerViewAdapter =
                               
        RecyclerViewAdapter(viewModel.recyclerViewList.value?:mutableListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
                        object : RecyclerViewAdapter.OnItemClickListener {
                            override fun onItemClick(view:View, position:Int, item :
            SearchResult1RowModel)
                {
                                onClickRecyclerView(view, position, item)
                            }
                        }
                        )
    viewModel.recyclerViewList.observe(this) {
                            recyclerViewAdapter.updateData(it)
                        }
    binding.searchResultVM = viewModel
  }

  public companion object {
    public const val TAG: String = "SEARCH_RESULT_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SearchResultActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
