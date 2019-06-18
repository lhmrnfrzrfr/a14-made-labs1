package com.dicoding.picodiploma.myintentapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MoveWithObjectActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_object)

        val tvObject: TextView = findViewById(R.id.tv_object_received)

        /*
        Object parcelable bisa kita dapatkan dengan memanggil getParcelableExtra
         */
        val person = intent.getParcelableExtra<Person>(EXTRA_PERSON)

        val text = "Name : " + person.name + ",\nEmail : " + person.email + ",\nAge : " + person.age + ",\nLocation : " + person.city
        tvObject.text = text
    }

    companion object {
        val EXTRA_PERSON = "extra_person"
    }
}
