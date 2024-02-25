package com.example.firsttask

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    private var newpc = pc("DEXP Aquilon O298" , " Intel Pentium Gold G6405",
        2, "Intel UHD Graphics 610", 8, 256)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
}