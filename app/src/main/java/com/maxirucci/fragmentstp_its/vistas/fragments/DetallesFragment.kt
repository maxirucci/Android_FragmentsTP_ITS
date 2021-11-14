package com.maxirucci.fragmentstp_its.vistas.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ScrollView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.maxirucci.fragmentstp_its.R

class DetallesFragment : Fragment() {
    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_detalles, container, false)
        val view = inflater.inflate(R.layout.fragment_detalles, container, false)

        val txtNombreCompleto = view.findViewById<TextView>(R.id.txtNombreCompletoDetalle)
        val imgFotoPerfil = view.findViewById<ImageView>(R.id.imgFotoPerfilDetalles)
        val txtTelefono = view.findViewById<TextView>(R.id.txtNumeroTelefonoDetalles)
        val txtDireccion = view.findViewById<TextView>(R.id.txtDireccionDetalles)
        val fondo = view.findViewById<ScrollView>(R.id.lyFondo)

        txtNombreCompleto?.text = "${arguments?.getString(getString(R.string.key_apellido))}, ${arguments?.getString(getString(R.string.key_nombre))}"
        txtTelefono?.text = arguments?.getString(getString(R.string.key_numeroTelefono))
        txtDireccion?.text = arguments?.getString(getString(R.string.key_direccion))
        Glide.with(this).load(arguments?.getString(getString(R.string.key_urlFoto))).into(imgFotoPerfil!!)

        fondo.setOnClickListener {
            Toast.makeText(it.context, "TEST", Toast.LENGTH_SHORT).show()
        }

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)



    }
}