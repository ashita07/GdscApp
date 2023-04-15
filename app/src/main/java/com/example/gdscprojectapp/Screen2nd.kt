package com.example.gdscprojectapp

import kotlinx.android.synthetic.main.activity_screen2nd.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Screen2nd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2nd)
     val INFO=  intent.getStringExtra(MainActivity.KEY)

    textView3.text= "Your info is\n\n\n "+ INFO.toString() }
}