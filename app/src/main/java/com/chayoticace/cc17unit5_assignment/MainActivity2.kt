package com.chayoticace.cc17unit5_assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //button to go the Last act
        findViewById<Button>(R.id.act2_button).setOnClickListener { foo() }
    }

     fun foo() {
         //DO NOT TOUCH
         val intent1 = Intent(this, FinalAct::class.java)
         val act2calender:String = findViewById<CalendarView>(R.id.act2_calender).date.toString()
        //Calender is functioning, figure out the rest.

         //These values came from MainActivity.kt and are working
        //There is a reason why the values from mainactivity.kt come here with their values.
         // But become null when sent to the next activity.
         //hhhhhmmmmmmmmmmmmmmmmm
         //*Fixed*
        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val age = intent.getIntExtra("seekbar",69)
         val phone =intent.getStringExtra("phone")

        intent1.putExtra("name", name)
        intent1.putExtra("email", email)
        intent1.putExtra("age", age)
        intent1.putExtra("calender", act2calender)
         intent1.putExtra("phone",phone)


        Log.i("Act2","$name, $email, $age, $act2calender")

        startActivity(intent1)
     }


}









