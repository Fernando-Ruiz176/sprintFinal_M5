package cl.fernando.sprintfinal_m5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.fernando.sprintfinal_m5.databinding.ItemLayoutBinding
import coil.load

class Adapter: RecyclerView.Adapter <Adapter.ViewHolder>() {
    var zapatos = mutableListOf<Zapato>()
    var callback : ZapatoCallback? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        var binding =ItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent , false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val item = zapatos[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return zapatos.size
    }

    fun setData(listaZapatos: List<Zapato>){
        zapatos.clear()
        zapatos.addAll(listaZapatos)
    }
    inner class ViewHolder (val binding: ItemLayoutBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(item:Zapato){

            val texto = "Calzado:${item.nombre} Precio:${item.precio}"
            //binding.nombre
            binding.tvNombre.text = item.nombre
            //binding.abreviatura
            binding.tvPrecio.text = item.precio.toString()
            //binding.bandera.load(item.imgUrl)
            binding.ivImagen.load(item.imgUrl)

            //binding.tvPrecio.text = item.precio.toString()
            binding.cvInicial.setOnClickListener(View.OnClickListener {
                callback?.showZapato(texto)
            })
        }

    }
}


interface ZapatoCallback {
    fun showZapato(s:String)
}