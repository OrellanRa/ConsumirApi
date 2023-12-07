package com.example.consumirapi

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.consumirapi.Usuarios.ClientUsuariosFactory
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val service =  ClientUsuariosFactory.makeClienteUsuarios()

        lifecycleScope.launch {
            val consultaUser=service.listUsuarios(1)
            println(consultaUser)
        }



    }
}