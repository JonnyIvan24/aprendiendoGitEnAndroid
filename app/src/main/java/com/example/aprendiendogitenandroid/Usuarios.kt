package com.example.aprendiendogitenandroid

class Usuarios constructor(val nombre: String, val apellido: String, val constrasena: String) {
    fun saludar() {
        println("Hola soy ${this.nombre}")
    }
}