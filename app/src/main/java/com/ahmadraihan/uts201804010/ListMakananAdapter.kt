package com.ahmadraihan.uts201804010

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListMakananAdapter(private val listMakanan: ArrayList<Makanan>) : RecyclerView.Adapter<ListMakananAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvKode: TextView = itemView.findViewById(R.id.tv_kode)
        var tvNama: TextView = itemView.findViewById(R.id.tv_nama)
        var tvAsal: TextView = itemView.findViewById(R.id.tv_harga)
        var ivLogo: ImageView = itemView.findViewById(R.id.civ_makanan)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_makanan, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listMakanan.size
    }

    override fun onBindViewHolder(holder: ListMakananAdapter.ListViewHolder, position: Int) {
        val makanan = listMakanan[position]

        Glide.with(holder.itemView.context)
            .load(makanan.logo)
            .apply(RequestOptions().override(80, 80))
            .into(holder.ivLogo)
        holder.tvKode.text = makanan.kode
        holder.tvNama.text = makanan.nama
        holder.tvAsal.text = makanan.harga
    }
}