package com.dam.mvvm

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.dam.mvvm.ui.theme.MvvmTheme
import com.dam.mvvm.ui.theme.MyViewModel
import com.dam.mvvm.ui.theme.UsuarioLoVe

val miViewModel: MyViewModel = MyViewModel()
class MainActivity : ComponentActivity() {
    private val TAG_LOG: String = "Mensaje Main"

    fun OnCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // creo el objeto miViewModel

        //entorno gráfico -> necesario siempre en el onCreate
        setContent { //recibe una función como parámetros
            MvvmTheme { //lo mismo que antes
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = Color(255,100,150)) { //lo mismo

                }
                UsuarioLoVe(miViewModel)//si lo creas fuera de la clase no tienes que llamarla a traves de objeto

            }
        }
        //mensaje de estado (solo lo puedo mirar el Logcat de la terminal de android)
        Log.d(TAG_LOG,"Estoy en onCreate")
    }

}