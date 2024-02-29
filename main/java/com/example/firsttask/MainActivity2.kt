package com.example.firsttask

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {
    var newpc = pc()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val tempmodel: TextView = findViewById(R.id.pcmodel)
        tempmodel.text = "Your pc model: ${newpc.model}"
        val tempprocessor: TextView = findViewById(R.id.pcprocessor)
        tempprocessor.text = "Your pc processor: ${newpc.procesor}"
        val tempnoc: TextView = findViewById(R.id.pcnoc)
        tempnoc.text = "Your pc count of cores: ${newpc.number_of_cores}"


    }


}