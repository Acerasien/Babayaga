package com.example.cobaproyek

import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), OnClickListener {


    private lateinit var button0: Button
    private lateinit var button1: Button
    private lateinit var texxresult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        button0 = findViewById(R.id.button0)
        button1 = findViewById(R.id.button1)
        texxresult = findViewById(R.id.displayTextView)

        button0.setOnClickListener(this)
        button1.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        Log.d("aa", "data:${v?.id}" )
        when(v?.id){
            R.id.button0 -> {
                texxresult.text = texxresult.text.toString() + button0.text.toString()
            }
            R.id.button1 -> {
                texxresult.text = texxresult.text.toString() + button1.text.toString()
            }
            R.id.button2 -> {

            }
            R.id.button3 -> {

            }
            R.id.button4 -> {

            }
            R.id.button5 -> {

            }
            R.id.button5 -> {

            }
            R.id.button6 -> {

            }
            R.id.button7 -> {

            }
            R.id.button8 -> {

            }
            R.id.button9 -> {

            }
            R.id.buttonkali -> {

            }
            R.id.buttonbagi -> {

            }
            R.id.buttonplus -> {

            }
            R.id.buttonminus -> {

            }
            R.id.buttonsama -> {

            }
            else -> Unit
        }
    }
}