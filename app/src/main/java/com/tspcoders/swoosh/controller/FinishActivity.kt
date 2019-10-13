package com.tspcoders.swoosh.controller

import android.os.Bundle
import android.util.Log
import android.view.View
import com.tspcoders.swoosh.Utilities.EXTRA_LEAGUE
import com.tspcoders.swoosh.Utilities.EXTRA_SKILL
import com.tspcoders.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        league = intent.getStringExtra(EXTRA_LEAGUE)
        skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.text = "Looking for $league $skill league near you..."
    }

}
