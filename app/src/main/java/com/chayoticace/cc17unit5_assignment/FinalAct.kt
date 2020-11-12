package com.chayoticace.cc17unit5_assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class FinalAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        //Name
        val act3_name = intent.getStringExtra("name")
        findViewById<TextView>(R.id.act3_name).text = act3_name

        //Email
        val act3_email = intent.getStringExtra("email")
        findViewById<TextView>(R.id.act3_email).text = act3_email

        //Age
        val act3_age = intent.getIntExtra("age", 69)
        findViewById<TextView>(R.id.act3_age).text = act3_age.toString()


        //DOB(CalenderView)
        val act3dob = intent.getStringExtra("calender")
        findViewById<TextView>(R.id.act3_DOB).text = act3dob

        //Phone
        val act3phone = intent.getStringExtra("phone")
        findViewById<TextView>(R.id.act3_phone).text = act3phone

        Log.i("Act3","$act3_name, $act3_email, $act3_age, $act3dob")

    }

}