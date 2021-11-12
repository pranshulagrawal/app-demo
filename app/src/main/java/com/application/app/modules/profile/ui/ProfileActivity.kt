package com.application.app.modules.profile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityProfileBinding
import com.application.app.modules.changepassword.ui.ChangePasswordActivity
import com.application.app.modules.profile.`data`.model.Profile1RowModel
import com.application.app.modules.profile.`data`.viewmodel.ProfileVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ProfileActivity : BaseActivity<ActivityProfileBinding>(R.layout.activity_profile) {
  private val viewModel: ProfileVM by viewModels<ProfileVM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerList(
    view: View,
    position: Int,
    item: Profile1RowModel
  ): Unit {
    when(view.id) {
        R.id.linear ->  {
          val destIntent = ChangePasswordActivity.getIntent(this, null)
          startActivity(destIntent)
        }


        }
  }

  public override fun onInitialized(): Unit {
    val recyclerListAdapter =
                            RecyclerListAdapter(viewModel.recyclerListList.value?:mutableListOf())
    binding.recyclerList.adapter = recyclerListAdapter
    recyclerListAdapter.setOnItemClickListener(
                    object : RecyclerListAdapter.OnItemClickListener {
                        override fun onItemClick(view:View, position:Int, item : Profile1RowModel) {
                            onClickRecyclerList(view, position, item)
                        }
                    }
                    )
    viewModel.recyclerListList.observe(this) {
                        recyclerListAdapter.updateData(it)
                    }
    binding.profileVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
