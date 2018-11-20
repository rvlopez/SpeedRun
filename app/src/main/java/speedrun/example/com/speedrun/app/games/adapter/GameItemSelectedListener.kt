package speedrun.example.com.speedrun.app.games.adapter

import speedrun.example.com.speedrun.entity.SpeedRunGameEntity

interface GameItemSelectedListener {

    fun onGameItemSelected(speedRunGameItem: SpeedRunGameEntity)
}