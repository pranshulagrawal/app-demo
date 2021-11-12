package com.application.app.modules.paymentmethod.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowPaymentMethod1Binding
import com.application.app.modules.paymentmethod.`data`.model.PaymentMethod1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerPaymentListAdapter(
  public var list: List<PaymentMethod1RowModel>
) : RecyclerView.Adapter<RecyclerPaymentListAdapter.RowPaymentMethod1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<PaymentMethod1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPaymentMethod1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_payment_method1,parent,false)
    return RowPaymentMethod1VH(view)
  }

  public override fun onBindViewHolder(holder: RowPaymentMethod1VH, position: Int): Unit {
    val paymentMethod1RowModel = PaymentMethod1RowModel()
    // TODO uncomment following line after integration with data source
    // val paymentMethod1RowModel = list[position]
    holder.binding.paymentMethod1RowModel = paymentMethod1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: PaymentMethod1RowModel
    ): Unit {
    }
  }

  public inner class RowPaymentMethod1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowPaymentMethod1Binding = RowPaymentMethod1Binding.bind(itemView)
    init {
      binding.linear.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, PaymentMethod1RowModel())
      }
    }
  }
}
