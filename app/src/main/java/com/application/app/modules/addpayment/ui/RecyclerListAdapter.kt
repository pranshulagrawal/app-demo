package com.application.app.modules.addpayment.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowAddPayment1Binding
import com.application.app.modules.addpayment.`data`.model.AddPayment1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerListAdapter(
  public var list: List<AddPayment1RowModel>
) : RecyclerView.Adapter<RecyclerListAdapter.RowAddPayment1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<AddPayment1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowAddPayment1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_add_payment1,parent,false)
    return RowAddPayment1VH(view)
  }

  public override fun onBindViewHolder(holder: RowAddPayment1VH, position: Int): Unit {
    val addPayment1RowModel = AddPayment1RowModel()
    // TODO uncomment following line after integration with data source
    // val addPayment1RowModel = list[position]
    holder.binding.addPayment1RowModel = addPayment1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: AddPayment1RowModel
    ): Unit {
    }
  }

  public inner class RowAddPayment1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowAddPayment1Binding = RowAddPayment1Binding.bind(itemView)
    init {
      binding.linear.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, AddPayment1RowModel())
      }
    }
  }
}
