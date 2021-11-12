package com.application.app.modules.dashboard.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class DashboardModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSearchProduct: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_search_product)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSuperFlashSal: String? =
      MyApp.getInstance().resources.getString(R.string.msg_super_flash_sal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLbl: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLbl1: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCategory: String? = MyApp.getInstance().resources.getString(R.string.lbl_category)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMoreCategory: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_more_category)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFlashSale: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_flash_sale)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSeeMore: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMegaSale: String? = MyApp.getInstance().resources.getString(R.string.lbl_mega_sale)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSeeMore1: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtExplore: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCart: String? = MyApp.getInstance().resources.getString(R.string.lbl_cart)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOffer: String? = MyApp.getInstance().resources.getString(R.string.lbl_offer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAccount: String? = MyApp.getInstance().resources.getString(R.string.lbl_account)

)
