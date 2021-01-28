package br.senai.sp.jandira.testefragment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.senai.sp.jandira.testefragment.R
import br.senai.sp.jandira.testefragment.holder.GameViewHolder
import br.senai.sp.jandira.testefragment.model.Game

class GameAdapter: RecyclerView.Adapter<GameViewHolder>() {

    private var gameList = listOf<Game>()

    fun updateGameList(list: List<Game>){
        gameList = list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.holder_game_recycler_view, parent, false)

        return GameViewHolder(view)
    }

    override fun getItemCount(): Int {
        return gameList.size
    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        holder.bind(gameList[position])
    }

}