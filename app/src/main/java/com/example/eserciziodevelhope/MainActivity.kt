package com.example.eserciziodevelhope

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttn : Button = findViewById(R.id.button)
        buttn.setOnClickListener {
            val toast = Toast.makeText(this, R.string.toast_first_fragment, Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 550)
            toast.show()
        }

    }
}