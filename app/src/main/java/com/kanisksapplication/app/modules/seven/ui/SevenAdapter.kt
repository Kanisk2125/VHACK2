package com.kanisksapplication.app.modules.seven.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kanisksapplication.app.R
import com.kanisksapplication.app.databinding.RowSevenBinding
import com.kanisksapplication.app.modules.seven.`data`.model.SevenRowModel
import kotlin.Int
import kotlin.collections.List

class SevenAdapter(
  var list: List<SevenRowModel>
) : RecyclerView.Adapter<SevenAdapter.RowSevenVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSevenVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_seven,parent,false)
    return RowSevenVH(view)
  }

  override fun onBindViewHolder(holder: RowSevenVH, position: Int) {
    val sevenRowModel = SevenRowModel()
    // TODO uncomment following line after integration with data source
    // val sevenRowModel = list[position]
    holder.binding.sevenRowModel = sevenRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SevenRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: SevenRowModel
    ) {
    }
  }

  inner class RowSevenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSevenBinding = RowSevenBinding.bind(itemView)
  }
}
