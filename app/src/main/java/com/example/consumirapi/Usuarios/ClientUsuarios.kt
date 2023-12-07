package com.example.consumirapi.Usuarios

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object ClientUsuariosFactory {
    fun makeClienteUsuarios():ConsumirApiUsuarios{
        return Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3000/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiUsuarios::class.java)
    }
}