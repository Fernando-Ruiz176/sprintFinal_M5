package cl.fernando.sprintfinal_m5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import cl.fernando.sprintfinal_m5.databinding.ProductoDetalleBinding
import coil.load



class Productodetalle: Fragment() {

    // Declarar los elementos del layout (nombre, imagen, precio)
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = ProductoDetalleBinding.inflate(inflater,container, false)


        // Obtener los datos del producto seleccionado desde los argumentos
        //val producto = arguments?.getParcelable<Zapato>("producto_seleccionado")

        /* Verificar si producto no es nulo y actualizar los elementos del layout con los datos del producto
        product?.let {
            binding.tvNombreDetalle.text = it.nombre
            binding.imgDetalle.load(it.imgUrl)
            binding.tvPrecioDetalle.text = it.precio.toString()

        }*/

        return binding.root
    }
}