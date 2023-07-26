package cl.fernando.sprintfinal_m5

data class Zapato(val nombre: String, val precio: Int, val imgUrl: String)

class CatalogoZapatos{
    companion object{
        val zapatos = mutableListOf<Zapato>().apply {
            add(Zapato("zapato casual", 78000, "https://www.panamajackchile.cl/111391-home_default/zapato-casual-panama-jack.jpg"))
            add(Zapato("Zapato tipo london", 62500, "https://www.educima.com/dibujo-para-colorear-zapato-dl27155.jpg"))
            add(Zapato("Zapato gamuza", 48200, "https://png.pngtree.com/png-clipart/20201223/ourlarge/pngtree-leather-shoes-shoes-foreign-trade-clothing-first-layer-leather-cartoon-vector-png-image_2612497.jpg"))
            add(Zapato("zapato stadium", 63250, "https://www.calzadooxig.com/1467-tm_thickbox_default/zapato-ca-1036.jpg"))
            add(Zapato("Botin deportivo", 34800, "https://us.123rf.com/450wm/garistipis/garistipis2211/garistipis221100015/197214247-venta-de-tema-en-blanco-y-negro.jpg"))
            add(Zapato("Botin de variedad", 75200, "https://us.123rf.com/450wm/simva/simva1609/simva160901101/62145169-icono-del-zapato.jpg"))
            add(Zapato("Botin de primavera", 94300, "https://st3.depositphotos.com/6778576/14708/v/600/depositphotos_147084741-stock-illustration-running-shoe-icon.jpg"))
            add(Zapato("Botin runing", 48950, "https://st2.depositphotos.com/6778576/12189/v/950/depositphotos_121899666-stock-illustration-running-shoe-flat-icon.jpg"))
            add(Zapato("Botin todo terreno", 67500, "https://cdn.xxl.thumbs.canstockphoto.es/una-zapatilla-de-dibujos-animados-ilustraci%C3%B3n_csp20478426.jpg"))
            add(Zapato("Botin boble suela", 88500, "https://cdn.xxl.thumbs.canstockphoto.es/icono-de-zapatillas-rosas-estilo-plano-imagen_csp40259576.jpg"))
            add(Zapato("Botin caminata", 74200, "https://static.vecteezy.com/system/resources/previews/003/176/144/non_2x/joggers-and-sneakers-shoes-vector.jpg"))
            add(Zapato("Botin treking", 67800, "https://static.vecteezy.com/system/resources/previews/014/182/543/non_2x/green-shoe-icon-flat-style-vector.jpg"))

        }
    }
}
