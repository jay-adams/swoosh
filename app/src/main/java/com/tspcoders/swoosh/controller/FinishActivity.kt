package com.tspcoders.swoosh.controller

import android.os.Bundle
import com.tspcoders.swoosh.Utilities.EXTRA_PLAYER
import com.tspcoders.swoosh.R
import com.tspcoders.swoosh.model.Player
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        player = intent.getParcelableExtra(EXTRA_PLAYER)

        searchLeaguesText.text = "Looking for ${player.league} ${player.skill} league near you..."
    }

}
