package cl.fernando.sprintfinal_m5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cl.fernando.sprintfinal_m5.databinding.ActivityMainBinding

// A. Primera Pantalla (Activitys)
// [ x ] Crea una pantalla de inicio que muestre una lista de zapatos y zapatillas disponibles para la venta.
// [ x ] Utiliza un RecyclerView para mostrar los productos en forma de lista. Cada elemento de la lista debe incluir la imagen y el precio del zapato correspondiente.
// [ x ] Implementa la funcionalidad de carga de imágenes utilizando la biblioteca Glide (opcional). Esto te permitirá cargar las imágenes de los zapatos desde una URL y mostrarlas en la lista.
// [ x ] Puedes implementar esta pantalla utilizando un fragmento en Android Studio. El fragmento se encargará de mostrar la lista de productos en la pantalla de inicio.
// [ x ] Recuerda que los productos deben ser una lista estática local, lo que significa que los datos de los zapatos y sus imágenes se encuentran predefinidos en el código de la aplicación. Puedes crear una clase de datos o utilizar una lista de objetos para almacenar la información de los zapatos.
// [ x ] En resumen, la pantalla de inicio de la aplicación "Shoes Tap" mostrará una lista de zapatos y zapatillas disponibles para la venta utilizando un RecyclerView. Los datos de los productos, como el precio y la imagen, se almacenarán en una lista estática local. Puedes implementar esta pantalla utilizando un fragmento y, opcionalmente, la biblioteca Glide para cargar y mostrar las imágenes de los zapatos.




class MainActivity : AppCompatActivity(), ZapatoCallback {

    private lateinit var binding: ActivityMainBinding
    private lateinit var zapatos:MutableList<Zapato>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initAdapter()
    }

    private fun initAdapter() {
        val adapter = Adapter()
        val zapatosList = CatalogoZapatos().returnShoeList()
        adapter.setData(zapatosList)
        adapter.callback = this
        binding.rcLista.adapter = adapter




    }

    override fun showZapato(s: String) {
        binding.tvTituloInicial.text = s
    }


}