package com.example.nerworkout

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MaleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_male)
    }
    fun startWorkout(v: View)
    {
        val selectedWorkout = v.tag.toString()
        println(selectedWorkout)

        val serviceIntent = Intent(this@MaleActivity, OnAppKillService::class.java)
        this@MaleActivity.startService(serviceIntent)

        //Launch workout activity with selected workout
        val intent = Intent(this@MaleActivity, WorkoutActivity::class.java)
        intent.putExtra("Workout", selectedWorkout)
        startActivity(intent)
    }
}