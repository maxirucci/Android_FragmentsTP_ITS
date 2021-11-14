package com.maxirucci.fragmentstp_its.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.maxirucci.fragmentstp_its.R
import com.maxirucci.fragmentstp_its.data.DataModel

class ContactosAdapter(
    private val context: Context,
    private val listaContactos: List<DataModel>,
    private val itemClickListener: OnContactosClickListener
) : RecyclerView.Adapter<BaseViewHolder<*>>(){

    interface OnContactosClickListener{
        fun onItemClick(
            nombre: String?,
            apellido: String?,
            direccion: String?,
            numeroTelefono: Long?,
            urlFotoPerfil: String?
        )
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        return ContactosViewHolder(
            LayoutInflater.from(context).inflate(R.layout.rv_contactos, parent, false)
        )
    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        when(holder){
            is ContactosViewHolder -> holder.bind(listaContactos[position], position)
            else -> throw IllegalAccessException("No hay viewHolder para el bind")
        }
    }

    override fun getItemCount(): Int {
        return listaContactos.size
    }

    inner class ContactosViewHolder(itemView: View) : BaseViewHolder<DataModel>(itemView) {
        @SuppressLint("SetTextI18n")
        override fun bind(item: DataModel, position: Int) {
            val txtNombreCompleto = itemView.findViewById<TextView>(R.id.txtNombreCompleto)
            val txtNumeroTelefono = itemView.findViewById<TextView>(R.id.txtNumeroTelefono)
            val imgFotoContacto = itemView.findViewById<ImageView>(R.id.imgFotoPerfil)

            txtNombreCompleto.text = "${item.apellido}, ${item.nombre}"
            txtNumeroTelefono.text = item.numeroTelefono.toString()
            Glide.with(context).load(item.urlFotoPerfil.toString()).into(imgFotoContacto)

            //Click
            itemView.setOnClickListener {
                itemClickListener.onItemClick(item.nombre, item.apellido, item.direccion, item.numeroTelefono, item.urlFotoPerfil)
            }
        }
    }
}

/* ES OTRA MANERA DE HACERLO. NO SUPE COMO ESCUCHAR EL CLICK, POR ESO USE LA OTRA. */
//class ContactosAdapter(
//    private val context: Context,
//    private val listaContactos: List<DataModel>
//) : RecyclerView.Adapter<ContactosAdapter.ContactosViewHolder>() {
//
//    interface OnContactosClickListener{
//        fun onItemClick(
//            nombre: String?,
//            apellido: String?,
//            direccion: String?,
//            numeroTelefono: Long?,
//            urlFotoPerfil: String?
//        )
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactosAdapter.ContactosViewHolder {
//        return ContactosViewHolder(
//            LayoutInflater.from(context).inflate(R.layout.rv_contactos, parent, false)
//        )
//    }
//
//    override fun onBindViewHolder(holder: ContactosAdapter.ContactosViewHolder, position: Int) {
//        val currentItem = listaContactos[position]
//
//        holder.txtNombreCompleto.text = "${currentItem.apellido}, ${currentItem.nombre}"
//        holder.txtNumeroTelefono.text = currentItem.numeroTelefono.toString()
//
//        Glide.with(context).load(currentItem.urlFotoPerfil.toString()).into(holder.imgFotoContacto)
//
//        //Falta capturar el click
//
//    }
//
//    override fun getItemCount(): Int {
//        return listaContactos.size
//    }
//
//    inner class ContactosViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
//        val txtNombreCompleto = itemView.findViewById<TextView>(R.id.txtNombreCompleto)
//        val txtNumeroTelefono = itemView.findViewById<TextView>(R.id.txtNumeroTelefono)
//        val imgFotoContacto = itemView.findViewById<ImageView>(R.id.imgFotoPerfil)
//    }
//}