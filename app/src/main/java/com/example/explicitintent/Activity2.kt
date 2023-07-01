package com.example.explicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        //Receive data from first activity
        val value:Bundle? = intent.extras
        val msg = value?.getString("message")
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()

    }
}