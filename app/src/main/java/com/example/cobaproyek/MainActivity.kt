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
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6: Button
    private lateinit var button7: Button
    private lateinit var button8: Button
    private lateinit var button9: Button
    private lateinit var buttonkali: Button
    private lateinit var buttonbagi: Button
    private lateinit var buttonplus: Button
    private lateinit var buttonminus: Button
    private lateinit var buttonsama: Button
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
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button7 = findViewById(R.id.button7)
        button8 = findViewById(R.id.button8)
        button9 = findViewById(R.id.button9)
        buttonkali = findViewById(R.id.buttonkali)
        buttonbagi = findViewById(R.id.buttonbagi)
        buttonplus = findViewById(R.id.buttonplus)
        buttonminus = findViewById(R.id.buttonminus)
        buttonsama = findViewById(R.id.buttonsama)
        texxresult = findViewById(R.id.displayTextView)

        button0.setOnClickListener(this)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)
        buttonkali.setOnClickListener(this)
        buttonbagi.setOnClickListener(this)
        buttonplus.setOnClickListener(this)
        buttonminus.setOnClickListener(this)
        buttonsama.setOnClickListener(this)
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
                texxresult.text = texxresult.text.toString() + button2.text.toString()
            }
            R.id.button3 -> {
                texxresult.text = texxresult.text.toString() + button3.text.toString()
            }
            R.id.button4 -> {
                texxresult.text = texxresult.text.toString() + button4.text.toString()
            }
            R.id.button5 -> {
                texxresult.text = texxresult.text.toString() + button5.text.toString()
            }
            R.id.button6 -> {
                texxresult.text = texxresult.text.toString() + button6.text.toString()
            }
            R.id.button7 -> {
                texxresult.text = texxresult.text.toString() + button7.text.toString()
            }
            R.id.button8 -> {
                texxresult.text = texxresult.text.toString() + button8.text.toString()
            }
            R.id.button9 -> {
                texxresult.text = texxresult.text.toString() + button9.text.toString()
            }
            R.id.buttonkali -> {
                texxresult.text = texxresult.text.toString() + buttonkali.text.toString()
            }
            R.id.buttonbagi -> {
                texxresult.text = texxresult.text.toString() + buttonbagi.text.toString()
            }
            R.id.buttonplus -> {
                texxresult.text = texxresult.text.toString() + buttonplus.text.toString()
            }
            R.id.buttonminus -> {
                texxresult.text = texxresult.text.toString() + buttonminus.text.toString()
            }
            R.id.buttonsama -> {
                texxresult.text = texxresult.text.toString() + buttonsama.text.toString()
            }
            else -> Unit
        }
    }
}