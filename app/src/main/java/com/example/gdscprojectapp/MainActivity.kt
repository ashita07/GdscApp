package com.example.gdscprojectapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object{
        const val KEY="com.example.gdscprojectapp.MainActivity.KEY"
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val submit=findViewById<Button>(R.id.button)
        submit.setOnClickListener{
            val information =text1.text.toString() + ". " + text2.text.toString()+". " +
                    text3.text.toString()

         val    intent=Intent(this,Screen2nd::class.java)
            intent.putExtra(KEY,information)
            startActivity(intent)
        }
    }
}