package com.example.nerworkout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.HandlerCompat.postDelayed
import java.util.logging.Handler


class FrontActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_front)
        supportActionBar?.hide()
        android.os.Handler().postDelayed({
            val intent = Intent(this@FrontActivity,MainActivity::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}