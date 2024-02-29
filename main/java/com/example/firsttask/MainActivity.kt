package com.example.firsttask

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun StartBtn(view: View){
        val temp = Intent( this, MainActivity2::class.java)
        startActivity(temp)
    }


}