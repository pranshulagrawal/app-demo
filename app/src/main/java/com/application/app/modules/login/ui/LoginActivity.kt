package com.application.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityLoginBinding
import com.application.app.modules.dashboard.ui.DashboardActivity
import com.application.app.modules.login.`data`.viewmodel.LoginVM
import com.application.app.modules.registerform.ui.RegisterFormActivity
import kotlin.String
import kotlin.Unit

public class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  public override fun setUpClicks(): Unit {
    binding.txtDonTHaveAnA.setOnClickListener {

          val destIntent = RegisterFormActivity.getIntent(this, null)
          startActivity(destIntent)

        }
    binding.txtDonTHaveAnA.setOnClickListener {

          val destIntent = RegisterFormActivity.getIntent(this, null)
          startActivity(destIntent)

        }
    binding.btnSignIn.setOnClickListener {

          val destIntent = DashboardActivity.getIntent(this, null)
          startActivity(destIntent)

        }
  }

  public override fun onInitialized(): Unit {
    binding.loginVM = viewModel
  }

  public companion object {
    public const val TAG: String = "LOGIN_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
