package com.yusuftalhaklc.akotlinintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun okClicked(view: View){
        val intent = Intent(applicationContext, SecondActivity::class.java)

        intent.putExtra("name", findViewById<EditText>(R.id.nameText).text.toString())
        intent.putExtra("username", findViewById<EditText>(R.id.usernameText).text.toString())
        intent.putExtra("mail", findViewById<EditText>(R.id.mailText).text.toString())

        startActivity(intent)
    }
}