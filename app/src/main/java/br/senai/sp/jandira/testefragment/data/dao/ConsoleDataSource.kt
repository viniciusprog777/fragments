package br.senai.sp.jandira.testefragment.data.dao

import android.content.Context
import br.senai.sp.jandira.testefragment.R
import br.senai.sp.jandira.testefragment.model.Console

class ConsoleDataSource {
    companion object{
        fun getConsoles(context: Context) : ArrayList<Console>{

            var consoles = ArrayList<Console>()

            consoles.add(Console(1, "PlayStation 4", context.getDrawable(R.drawable.sony)!!, "2013-11-15",context.getDrawable(R.drawable.ps4_formatado)!!,"10 unidades"))

            consoles.add(Console(2, "Xbox One", context.getDrawable(R.drawable.microsoft)!!, "2013-11-22",context.getDrawable(R.drawable.xbox)!!,"10 unidades"))

            consoles.add(Console(3, "Nintendo Switch",  context.getDrawable(R.drawable.sony)!!, "2017-03-03",context.getDrawable(R.drawable.donkey_kong)!!,"10 unidades"))

            return consoles
        }

    }

}