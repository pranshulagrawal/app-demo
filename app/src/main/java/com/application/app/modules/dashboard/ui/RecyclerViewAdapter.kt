package com.application.app.modules.dashboard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowDashboard4Binding
import com.application.app.modules.dashboard.`data`.model.Dashboard4RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<Dashboard4RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowDashboard4VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Dashboard4RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDashboard4VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_dashboard4,parent,false)
    return RowDashboard4VH(view)
  }

  public override fun onBindViewHolder(holder: RowDashboard4VH, position: Int): Unit {
    val dashboard4RowModel = Dashboard4RowModel()
    // TODO uncomment following line after integration with data source
    // val dashboard4RowModel = list[position]
    holder.binding.dashboard4RowModel = dashboard4RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Dashboard4RowModel
    ): Unit {
    }
  }

  public inner class RowDashboard4VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowDashboard4Binding = RowDashboard4Binding.bind(itemView)
  }
}
