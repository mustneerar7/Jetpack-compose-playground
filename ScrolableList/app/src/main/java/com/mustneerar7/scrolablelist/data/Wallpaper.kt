package com.mustneerar7.scrolablelist.data

import androidx.annotation.DrawableRes
import com.mustneerar7.scrolablelist.R

data class Wallpaper(
  @DrawableRes val imageResource: Int
)

// Returns a list of wallpapers.
fun getWallpapers(): List<Wallpaper> {
  return listOf<Wallpaper>(
    Wallpaper(R.drawable.milad_fakurian_e8ufcyxz514_unsplash),
    Wallpaper(R.drawable.b___purple),
    Wallpaper(R.drawable.milad_fakurian_e8ufcyxz514_unsplash)
  )
}
