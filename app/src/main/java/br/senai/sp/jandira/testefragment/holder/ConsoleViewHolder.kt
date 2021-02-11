package br.senai.sp.jandira.testefragment.holder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.senai.sp.jandira.testefragment.R
import br.senai.sp.jandira.testefragment.model.Console
import kotlinx.android.synthetic.main.holder_console_recycler_view.view.*

class ConsoleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val textConsoleName = itemView.findViewById<TextView>(R.id.console_name)
    val imageConsoleMaker = itemView.findViewById<ImageView>(R.id.console_maker)
    val textConsoleDate = itemView.findViewById<TextView>(R.id.console_date)
    val textConsoleSales = itemView.findViewById<TextView>(R.id.console_sales)
    val imageConsole = itemView.findViewById<ImageView>(R.id.console_image)

    fun bind(console: Console){
        textConsoleName.text = console.consoleName
        textConsoleDate.text = console.consoleReleaseDate
        imageConsoleMaker.setImageDrawable(console.consoleMaker)
        textConsoleSales.text = console.consoleSales
        imageConsole.setImageDrawable(console.consoleImage)


    }

}