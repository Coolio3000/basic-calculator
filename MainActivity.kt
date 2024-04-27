package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onBtnClick(view: View){
        val btnId:Int = view.id
        val button:Button = findViewById(btnId)
        val x:TextView = findViewById(R.id.centerTxt)
        val joe: String =  button.text.toString()
        val xNew: String = (x.text.toString() + joe)
        x.text = xNew
    }
    fun addition(view: View){
        val x:TextView = findViewById(R.id.centerTxt)
        val y:TextView = findViewById(R.id.placeholderTxt)
        if (x.text != "") {
            y.text = (x.text.toString().toInt() + y.text.toString().toInt()).toString()
            x.text = ""
        }
    }
    fun clearAll(view: View){
        val x:TextView = findViewById(R.id.centerTxt)
        val y:TextView = findViewById(R.id.placeholderTxt)
        x.text = ""
        y.text = "0"
    }
    fun equals(view: View){
        val x:TextView = findViewById(R.id.centerTxt)
        val y:TextView = findViewById(R.id.placeholderTxt)
        if (y.text != "" && x.text != "") {
            x.text = (x.text.toString().toInt() + y.text.toString().toInt()).toString()
        } else if(x.text == "" ){
            x.text = y.text
        }
        y.text = "0"
    }
    fun subtract(view: View){

        val x:TextView = findViewById(R.id.centerTxt)
        val y:TextView = findViewById(R.id.placeholderTxt)
        if (x.text != "") {
            y.text = (y.text.toString().toInt() - x.text.toString().toInt()).toString()
            x.text = ""
        } else{
            x.text = "-"
        }
    }
}

