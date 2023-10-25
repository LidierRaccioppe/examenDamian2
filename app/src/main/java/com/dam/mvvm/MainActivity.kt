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

                /**
                 * La clase Data de Kotlin tiene por objetivo el permitir el mantener datos de
                 * distintos en el, asi como el poseer distintos metodos para un uso mas facil en el.
                 *
                 * Con esta clase se generara automaticamente los getters y setters.
                 *
                 * Asi como su metodo toString() pasara a bruto los distintos valores de lo que
                 * ingreses a un toString en redundante formato String
                 *
                 * El Metodo copy() copia los distintos valores del objeto, lo que hace es un return
                 * a lo bruto con todos sus valores, lo que puede ayudar al momento de hacer condi-
                 * ciones, o para pasar sus valores a otro objeto
                 *
                 * Y luego presenta las funciones clasicas de equals y hashcode
                 *
                 */

            }
        }
        //mensaje de estado (solo lo puedo mirar el Logcat de la terminal de android)
        Log.d(TAG_LOG,"Estoy en onCreate")
    }
}