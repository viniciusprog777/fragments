package br.senai.sp.jandira.testefragment.model

import android.graphics.drawable.Drawable

data class Console(
    var id: Long,
    var consoleName: String,
    var consoleMaker: Drawable,
    var consoleReleaseDate: String,
    var consoleImage: Drawable,
    var consoleSales: String
)