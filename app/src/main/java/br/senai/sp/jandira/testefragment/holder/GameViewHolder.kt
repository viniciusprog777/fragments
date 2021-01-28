package br.senai.sp.jandira.testefragment.holder

import android.graphics.drawable.Drawable
import android.view.ContextThemeWrapper
import android.view.View
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.senai.sp.jandira.testefragment.R
import br.senai.sp.jandira.testefragment.model.Game
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import kotlinx.android.synthetic.main.holder_game_recycler_view.view.*

class GameViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)  {

    val textGameName = itemView.findViewById<TextView>(R.id.text_view_game)
    val textGameDescription = itemView.findViewById<TextView>(R.id.text_view_descricao_game)
    val imageGame = itemView.findViewById<ImageView>(R.id.image_game)
    val consoleGame = itemView.findViewById<ChipGroup>(R.id.chip_group_consoles)
    val ratingBarGame = itemView.findViewById<RatingBar>(R.id.rating_bar_game)

    fun bind(game: Game){
        textGameName.text = game.gameName
        textGameDescription.text = game.gameDescription
        ratingBarGame.rating = game.gameRating
        imageGame.setImageDrawable(game.gameImage)

        for (console in game.consoles) {
            val chip = Chip(ContextThemeWrapper(itemView.context, R.style.ChipTextAppearance), null, 0)

            chip.text = console.consoleName
            consoleGame.addView(chip)
        }

    }
}