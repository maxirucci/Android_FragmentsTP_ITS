package com.maxirucci.fragmentstp_its.vistas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.maxirucci.fragmentstp_its.R
import com.maxirucci.fragmentstp_its.vistas.fragments.ContactosFragment

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.title = "Agenda telefónica"

//        val frTransaction = supportFragmentManager.beginTransaction();
//        frTransaction.replace(R.id.frViewDetalles, ContactosFragment())
//        frTransaction.addToBackStack(null)
//        frTransaction.commit()
    }

}