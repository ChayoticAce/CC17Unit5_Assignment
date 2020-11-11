package com.chayoticace.cc17unit5_assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.mainact_button).setOnClickListener { foo() }

        //This part deals with the seekbar
        //This is for the seekbar, and the min max values are set in the layout file incase of curiosity.
        val seek = findViewById<SeekBar>(R.id.mainact_seekBar)
        seek?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(seek: SeekBar, progress: Int, fromUser: Boolean) {
                val ageDisplay: TextView = findViewById(R.id.mainact_age)
                ageDisplay.text = "Age: ${seek.progress}"
            }

            override fun onStartTrackingTouch(seek: SeekBar) {
                // write custom code for progress is started

            }
            override fun onStopTrackingTouch(seek: SeekBar) {
                // write custom code for progress is stopped
                Toast.makeText(this@MainActivity, "Age: " + seek.progress + "", Toast.LENGTH_SHORT).show()

            }
        })


    }

    //DO NOT TOUCH
    private fun foo(){
        //This intent is functioning and sending the data to its destination.
        val intent = Intent(this, MainActivity2::class.java)
        val name:String = findViewById<EditText>(R.id.mainact_name).text.toString()
        val email:String = findViewById<EditText>(R.id.mainact_email).text.toString()
        val seekValue:Int = findViewById<SeekBar>(R.id.mainact_seekBar).progress

        intent.putExtra("name", name)
        intent.putExtra("email", email)
        intent.putExtra("seekbar", seekValue)

        startActivity(intent)

    }

}