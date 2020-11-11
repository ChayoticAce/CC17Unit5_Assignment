package com.chayoticace.cc17unit5_assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class FinalAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        //Null checks and setting the textview with the string that came from act 1 for the following
        //act3_name,act3_email,act3_age

        //Name
        val act3_name = intent.getStringExtra("name")
        findViewById<TextView>(R.id.act3_name).text = act3_name

        //Email
        val act3_email = intent.getStringExtra("email")
        findViewById<TextView>(R.id.act3_email).text = act3_email

        val act3_age = intent.getIntExtra("age", 69)
        findViewById<TextView>(R.id.act3_age).text = act3_age.toString()


        //DOB(CalenderView)
        val act3dob = intent.getStringExtra("calender")
        findViewById<TextView>(R.id.act3_DOB).text = act3dob

        Log.i("Act3","$act3_name, $act3_email, $act3_age, $act3dob")

    }
}