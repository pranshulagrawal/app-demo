package com.application.app.modules.registerform.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityRegisterFormBinding
import com.application.app.modules.dashboard.ui.DashboardActivity
import com.application.app.modules.registerform.`data`.viewmodel.RegisterFormVM
import kotlin.String
import kotlin.Unit

public class RegisterFormActivity :
    BaseActivity<ActivityRegisterFormBinding>(R.layout.activity_register_form) {
  private val viewModel: RegisterFormVM by viewModels<RegisterFormVM>()

  public override fun setUpClicks(): Unit {
    binding.btnSignUp.setOnClickListener {

                  val destIntent = DashboardActivity.getIntent(this, null)
                  startActivity(destIntent)

                }
  }

  public override fun onInitialized(): Unit {
    binding.registerFormVM = viewModel
  }

  public companion object {
    public const val TAG: String = "REGISTER_FORM_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RegisterFormActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
