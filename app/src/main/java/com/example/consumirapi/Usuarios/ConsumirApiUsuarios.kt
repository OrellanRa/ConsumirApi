package com.example.consumirapi.Usuarios

import com.example.consumirapi.Usuarios.Model.RemoteResultUsuarios
import retrofit2.http.GET
import retrofit2.http.Query

interface ConsumirApiUsuarios {
    @GET("Usuarios/")
    suspend fun  listUsuarios(@Query("Id_Usuarios") Id_Usuario: Int)
    :RemoteResultUsuarios

}