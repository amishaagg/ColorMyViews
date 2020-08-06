package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        box_one.setOnClickListener {
            box_one.setBackgroundColor(Color.BLACK)
        }
        box_two_text.setOnClickListener {
            box_two_text.setBackgroundColor(Color.MAGENTA)
        }
        //box_three_text.setOnClickListener {
            box_three_text.setBackgroundColor(Color.DKGRAY)
        //}
        //box_four_text.setOnClickListener {
            box_four_text.setBackgroundColor(Color.LTGRAY)
        //}
        //box_five_text.setOnClickListener {
            //box_five_text.setBackgroundColor(Color.CYAN)
        //}
        clay.setBackgroundColor(Color.WHITE)
        clay.setOnClickListener{
            clay.setBackgroundColor(Color.CYAN)
        }
        buttonred.setOnClickListener {
            box_three_text.setBackgroundColor(Color.RED)
        }
        buttongreen.setOnClickListener {
            box_five_text.setBackgroundColor(Color.GREEN)
        }
        buttonyellow.setOnClickListener {
            box_four_text.setBackgroundColor(Color.YELLOW)
        }
    }
}