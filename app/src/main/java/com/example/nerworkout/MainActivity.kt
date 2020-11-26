package com.example.nerworkout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.nerworkout.diet.BMI
import com.example.nerworkout.diet.OverWeight
import com.example.nerworkout.diet.UnderWeight
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.contain_main.*


class MainActivity : AppCompatActivity() , NavigationView.OnNavigationItemSelectedListener{


    //val navigationview : NavigationView = findViewById(R.id.navigation_view)
    lateinit var  toolbar : Toolbar
    lateinit var drawerlayout : DrawerLayout
    lateinit var navview : NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        drawerlayout = findViewById(R.id.drawer)
        navview = findViewById(R.id.navigation_view)


        val drawerToggle = ActionBarDrawerToggle(this, drawerlayout, toolbar,0, 0)
        drawerlayout.addDrawerListener(drawerToggle)
        drawerToggle.syncState()
        navview.setNavigationItemSelectedListener(this)


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

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_home -> {
                //Toast.makeText(this, "home clicked", Toast.LENGTH_SHORT).show()
                val intent= Intent(this, MainActivity ::class.java)
                startActivity(intent)


            }
            R.id.nav_tool -> {
               // Toast.makeText(this, "home clicked", Toast.LENGTH_SHORT).show()
                val intent= Intent(this, BMI ::class.java)
                startActivity(intent)

            }
            R.id.nav_gallery -> {
              //  Toast.makeText(this, "home clicked", Toast.LENGTH_SHORT).show()
                val intent= Intent(this, UnderWeight ::class.java)
                startActivity(intent)

            }
            R.id.nav_slideshow -> {
                //Toast.makeText(this, "home clicked", Toast.LENGTH_SHORT).show()
                val intent= Intent(this, OverWeight ::class.java)
                startActivity(intent)

            }
        }
        drawerlayout.closeDrawer(GravityCompat.START)
        return true
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




