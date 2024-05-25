package com.asadbek.sharedpreferencecustom

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MySharedReference.init(this)


        var myTextView:TextView = findViewById(R.id.txt1)
        var myEditText:EditText = findViewById(R.id.edtText)
        var btn:Button = findViewById(R.id.btnSave)
        myTextView.text = MySharedReference.name

        btn.setOnClickListener {
            MySharedReference.name = myEditText.text.toString()
            myTextView.text = myEditText.text.toString()
        }



    }
}