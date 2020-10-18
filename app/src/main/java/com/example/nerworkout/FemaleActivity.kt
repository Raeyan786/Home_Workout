package com.example.nerworkout

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class FemaleActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_female)
    }
    fun start1Workout(v: View)
    {
        val selectedWorkout = v.tag.toString()
        println(selectedWorkout)

        val serviceIntent = Intent(this@FemaleActivity, OnAppKillService::class.java)
        this@FemaleActivity.startService(serviceIntent)

        //Launch workout activity with selected workout
        val intent = Intent(this@FemaleActivity, Workout1Activity::class.java)
        intent.putExtra("Workout", selectedWorkout)
        startActivity(intent)
    }
}