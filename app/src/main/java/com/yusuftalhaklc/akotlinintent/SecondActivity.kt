package com.yusuftalhaklc.akotlinintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var textview:TextView = findViewById(R.id.textView)

        val intent = intent
        val name = intent.getStringExtra("name")
        val username = intent.getStringExtra("username")
        val mail = intent.getStringExtra("mail")


        textview.text = "Merhaba $name \n Kullanıcı adın : $username \n Mailin : $mail"
    }
}