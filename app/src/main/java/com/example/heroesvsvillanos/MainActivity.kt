package com.example.heroesvsvillanos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun siguienteheroe(view: View){
        val intent=Intent(this,spiderman::class.java).apply {}
        startActivity(intent)
    }
}