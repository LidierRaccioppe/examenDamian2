package com.dam.mvvm.ui.theme

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
class MyViewModel() : ViewModel() {

    // para que sea mas facil la etiqueta del Log
    private val TAG_LOG: String = "Mensaje de myViewModel"

    // este v a a ser nuestra lista para la secuencia random
    // usamos mutable, ya que la queremos modificar y que las detecte el observer
    var numeroCambiable = mutableStateOf(0)

    var nombreIdentificador = mutableStateOf("Lidier Máximo Soberano de las Sillas con ")
    val listaNumerosAleatorios = mutableStateListOf<Int>()


    /**
     * Cuando se cree un MyViewModel se lanzara el Log y permitira una mas facil rastreación
     */
    init {
        Log.d(TAG_LOG, "Ocurre el init de ViewModel")
    }

    /**
     * Creamos un entero aleatoria
     */
    fun crearRandom() : Int{
        numeroCambiable.value = (0..10).random()
        Log.d(TAG_LOG,"creamos enteros random ${numeroCambiable.value}")
        return numeroCambiable.value
    }

    /**
     * Devuelve el numero
     */
    fun getNumero():Int{
        return numeroCambiable.value
    }
    /**
     * Devuelve el nombre
     */
    fun getNombre(): String{
        return nombreIdentificador.value
    }
    /**
     * Crea una lista de int con valores aleatorios, los muestra en el log y los devuelve
     */
    fun crearListaRandom() : List <Int>{
        listaNumerosAleatorios.add((0..3).random())
        Log.d(TAG_LOG, "creamos random ${listaNumerosAleatorios}")
        return  listaNumerosAleatorios
    }

    /**
     * Devolver la lista creada con randoms
     */
    fun getLista():List<Int>{
        return listaNumerosAleatorios.toList()
    }
}