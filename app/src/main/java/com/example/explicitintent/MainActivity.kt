package com.example.explicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener(){
            val intent:Intent = Intent(this,Activity2::class.java)
            //Send data to second activity
            intent.putExtra("message","Hi, how r u?")
            startActivity(intent)
        }

    }
}