package com.example.assist.kotlinhello

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hello.text = getString(R.string.first_text)
        second.text = getString(R.string.second_text)
//        btn_press.setOnClickListener {
//            hello.text = ("changed")
//            Toast.makeText(this, "Button 1",
//                    Toast.LENGTH_LONG).show()
//        }
       change()
       // forecast_list.
    }


    fun change() {
        btn_press.setOnClickListener {
            hello.text = ("changed")
            Toast.makeText(this, "Button 1",
                    Toast.LENGTH_LONG).show()
        }
    }
    class MyActivity : Activity()
    fun MyActivity.a() {
       second.text=getString(R.string.second_text_function)
    }
    fun Activity.b() {
        second.text="something else"
    }
}
