package com.application.app.modules.searchresult2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySearchResult2Binding
import com.application.app.modules.searchresult2.`data`.viewmodel.SearchResult2VM
import kotlin.String
import kotlin.Unit

public class SearchResult2Activity :
    BaseActivity<ActivitySearchResult2Binding>(R.layout.activity_search_result2) {
  private val viewModel: SearchResult2VM by viewModels<SearchResult2VM>()

  public override fun setUpClicks(): Unit {
  }

  public override fun onInitialized(): Unit {
    binding.searchResult2VM = viewModel
  }

  public companion object {
    public const val TAG: String = "SEARCH_RESULT2ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SearchResult2Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
