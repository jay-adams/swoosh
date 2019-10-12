package com.tspcoders.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.tspcoders.swoosh.R
import com.tspcoders.swoosh.Utilities.EXTRA_PLAYER
import com.tspcoders.swoosh.model.Player
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("", "")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        if(player.league != "mens") {
            player.league  = "mens"
        } else {
            player.league  = ""
        }
    }

    fun onWomensClicked(view: View) {
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        if(player.league  != "womens") {
            player.league  = "womens"
        } else {
            player.league  = ""
        }
    }

    fun onCoedClicked(view: View) {
        womensLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false

        if(player.league  != "co-ed") {
            player.league  = "co-ed"
        } else {
            player.league  = ""
        }
    }

    fun leagueNextClicked(view: View) {
        if(player.league  != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }
    }
}
