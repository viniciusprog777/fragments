package br.senai.sp.jandira.testefragment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.senai.sp.jandira.testefragment.R
import br.senai.sp.jandira.testefragment.holder.ConsoleViewHolder
import br.senai.sp.jandira.testefragment.model.Console


class ConsoleAdapter: RecyclerView.Adapter<ConsoleViewHolder>() {

    private var consoleList = listOf<Console>()

    fun updateConsoleList(list: List<Console>){
        consoleList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConsoleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.holder_console_recycler_view, parent, false)

        return ConsoleViewHolder(view)
    }

    override fun getItemCount(): Int {
        return consoleList.size
    }

    override fun onBindViewHolder(holder: ConsoleViewHolder, position: Int) {
        holder.bind(consoleList[position])
    }


}