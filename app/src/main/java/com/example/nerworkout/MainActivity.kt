package com.example.nerworkout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button : ImageButton = findViewById(R.id.button)
        button.setOnClickListener{
            val intent = Intent(this, MaleActivity::class.java)
            startActivity(intent)
        }
        val button1 : ImageButton = findViewById(R.id.button1)
        button1.setOnClickListener{
            val intent1 = Intent(this, FemaleActivity::class.java)
            startActivity(intent1)
        }
    }
  /*  fun startWorkout(v: View)
    {
        val selectedWorkout = v.tag.toString()
        println(selectedWorkout)

        val serviceIntent = Intent(this@MainActivity, OnAppKillService::class.java)
        this@MainActivity.startService(serviceIntent)

        //Launch workout activity with selected workout
        val intent = Intent(this@MainActivity, WorkoutActivity::class.java)
        intent.putExtra("Workout", selectedWorkout)
        startActivity(intent)
    }*/

}