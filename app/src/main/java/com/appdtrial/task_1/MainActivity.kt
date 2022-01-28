package com.appdtrial.task_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val btn:Button=findViewById(R.id.btn_submit)
        val user:EditText=findViewById(R.id.name)
        btn.setOnClickListener(View.OnClickListener {

            if (user!!.text.toString().length == 0  ) {
                Toast.makeText(this, "Please Enter Your Name", Toast.LENGTH_SHORT).show();
            }


            else
                Toast.makeText(this, "Welcome, ${user.text.toString()}", Toast.LENGTH_SHORT).show()
        })

    }
}