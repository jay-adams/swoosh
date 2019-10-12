package com.tspcoders.swoosh.controller

import android.os.Bundle
import android.view.View
import com.tspcoders.swoosh.Utilities.EXTRA_LEAGUE
import com.tspcoders.swoosh.Utilities.EXTRA_SKILL
import com.tspcoders.swoosh.R
import android.content.Intent
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var selectedLevel = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onBeginnerClicked(view: View) {
        ballerSkillBtn.isChecked = false

        if(selectedLevel != "beginner") {
            selectedLevel = "beginner"
        } else {
            selectedLevel = ""
        }
    }

    fun onBallerClicked(view: View) {
        beginnerSkillBtn.isChecked = false

        if (selectedLevel != "baller") {
            selectedLevel = "baller"
        }else {
            selectedLevel = ""
        }
    }

    fun onSkillFinishClicked(view: View) {
        if (selectedLevel != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_SKILL, selectedLevel)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }

}
