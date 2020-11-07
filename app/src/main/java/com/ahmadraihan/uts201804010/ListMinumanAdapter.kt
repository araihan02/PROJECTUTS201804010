package com.ahmadraihan.uts201804010

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListMinumanAdapter(private val listMinuman: ArrayList<Minuman>) : RecyclerView.Adapter<ListMinumanAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvKode: TextView = itemView.findViewById(R.id.tv_kode)
        var tvNama: TextView = itemView.findViewById(R.id.tv_nama)
        var tvAsal: TextView = itemView.findViewById(R.id.tv_harga)
        var ivLogo: ImageView = itemView.findViewById(R.id.civ_minuman)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_minuman, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listMinuman.size
    }

    override fun onBindViewHolder(holder: ListMinumanAdapter.ListViewHolder, position: Int) {
        val minuman = listMinuman[position]

        Glide.with(holder.itemView.context)
            .load(minuman.logo)
            .apply(RequestOptions().override(80, 80))
            .into(holder.ivLogo)
        holder.tvKode.text = minuman.kode
        holder.tvNama.text = minuman.nama
        holder.tvAsal.text = minuman.harga
    }
}