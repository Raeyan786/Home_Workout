package com.example.nerworkout.diet

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

import com.example.nerworkout.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bmi.*

class BMI : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bmi)



        btnUnderWt.setOnClickListener() {
            val intent = Intent(this, UnderWeight::class.java)
            startActivity(intent)
        }

        btnOverWt.setOnClickListener() {
            val intent = Intent(this, OverWeight::class.java)
            startActivity(intent)
        }


        btn.setOnClickListener {
            val h = (height.text).toString().toFloat() / 100
            val w = weight.text.toString().toFloat()
            val res = w / (h * h)
            result.text = "%.2f".format(res)

            if (res < 18.5) {
                ans.text = "You are Underweight"
                btnUnderWt.visibility = View.VISIBLE
                btnOverWt.visibility = View.INVISIBLE
            } else if (res > 18.5 && res < 24.9) {
                ans.text = "You are Normal"
            } else {
                ans.text = "You are Overweight"
                btnOverWt.visibility = View.VISIBLE
                btnUnderWt.visibility = View.INVISIBLE
            }
        }
    }
}