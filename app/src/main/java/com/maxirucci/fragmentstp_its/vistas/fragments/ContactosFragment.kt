package com.maxirucci.fragmentstp_its.vistas.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.maxirucci.fragmentstp_its.R
import com.maxirucci.fragmentstp_its.adapters.ContactosAdapter
import com.maxirucci.fragmentstp_its.data.DataSource

class ContactosFragment : Fragment(), ContactosAdapter.OnContactosClickListener {

    var bundle = Bundle()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contactos, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val listaContactos = DataSource().getAgenda()

        val recyclerView = view?.findViewById<RecyclerView>(R.id.recyclerContactos)
        recyclerView!!.layoutManager = LinearLayoutManager(this.context)
        recyclerView.adapter = ContactosAdapter(this.requireContext(), listaContactos, this)
    }

    @SuppressLint("SetTextI18n")
    override fun onItemClick(nombre: String?, apellido: String?, direccion: String?, numeroTelefono: Long?, urlFotoPerfil: String?) {
        val bundle = Bundle()
        bundle.putString(getString(R.string.key_nombre), nombre)
        bundle.putString(getString(R.string.key_apellido), apellido)
        bundle.putString(getString(R.string.key_direccion), direccion)
        bundle.putString(getString(R.string.key_numeroTelefono), numeroTelefono.toString())
        bundle.putString(getString(R.string.key_urlFoto), urlFotoPerfil)

        val frDetalles = DetallesFragment()
        frDetalles.arguments = bundle

        val frTransaction = parentFragmentManager.beginTransaction()
        frTransaction.replace(R.id.frViewDetalles, frDetalles)
        frTransaction.addToBackStack(null)
        frTransaction.setReorderingAllowed(true)
        frTransaction.commit()
    }
}