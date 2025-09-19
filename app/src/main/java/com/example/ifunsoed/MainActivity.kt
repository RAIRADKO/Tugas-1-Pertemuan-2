package com.example.ifunsoed

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

private val Any.root: Any
private val Any.btnToPage2: Any
private val MainActivity.binding: Any

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initNavigation()
    }

    private fun initNavigation(){
        binding.btnToPage2.setOnClickListener {
            startActivity(Intent(this, Halaman2Activity::class.java))
        }
    }
}