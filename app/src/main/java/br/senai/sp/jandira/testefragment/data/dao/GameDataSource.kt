package br.senai.sp.jandira.testefragment.data.dao

import android.content.Context
import br.senai.sp.jandira.testefragment.R
import br.senai.sp.jandira.testefragment.model.Console
import br.senai.sp.jandira.testefragment.model.Game

class GameDataSource {

    companion object{
        fun getGames(context: Context) : ArrayList<Game>{

            var games = ArrayList<Game>()

            games.add(Game(
                1,
                "Donkey Kong",
                context.getDrawable(R.drawable.donkey_kong)!!,
            "Donkey Kong Country: Tropical Freeze é um jogo eletrônico de plataforma side-scrolling desenvolvido pela Retro Studios que foi publicado pela Nintendo para o Wii U em 21 de fevereiro de 2014 nos Estados Unidos.",
            4.5,
            listOf(Console(1, "Wii U", "Nintendo", "2012-11-01"),Console(2, "Switch", "Nintendo", "2017-03-03"))))

            games.add(Game(
                1,
                "Sunset Riders",
                context.getDrawable(R.drawable.sunsetriders)!!,
                "Sunset Riders é um jogo de faroeste, no estilo plataforma 2D, desenvolvido pela Konami em 1991 para arcade. Posteriormente em 1992 e 1993 foi portado para os consoles Mega Drive e Super Nintendo, respectivamente.",
                4.0,
                listOf(Console(1, "SNES", "Nintendo", "2012-11-01"),Console(2, "Mega Drive", "Sega", "2017-03-03"))))

            games.add(Game(
                1,
                "Bonanza Bros",
                context.getDrawable(R.drawable.bonanzabrothers)!!,
                "Bonanza Bros. é um jogo de fliperama da Sega que posteriormente foi produzido para outros videogames.",
                4.0,
                listOf(Console(1, "Mega Drive", "Sega", "2017-03-03"))))

            return games
        }
    }
}