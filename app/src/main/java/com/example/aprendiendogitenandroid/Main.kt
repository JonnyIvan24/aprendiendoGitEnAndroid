package com.example.aprendiendogitenandroid

fun main() {
    println("Hola")
    listadoDeUsuarios()
    login("email@test.com", "hola1234")
    listadoDeProductos()
    buscarUsuario(1)
}

fun buscarUsuario(id: Int) {
    // return un usuario
}

fun listadoDeUsuarios() {
    // return Usuarios[]
}

fun login(email: String, password: String) {
    // petición de API para hacer login
}

fun listadoDeProductos() {
    // return Productos[]
}