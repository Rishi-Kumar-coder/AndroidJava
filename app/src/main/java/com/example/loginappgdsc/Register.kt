package com.example.loginappgdsc

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class Register : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var btn_Register:Button = findViewById(R.id.id_btn_Register)
        var tx_Name:EditText = findViewById(R.id.id_tx_Name)
        var tx_Email:EditText = findViewById(R.id.id_tx_Email)

        var tx_Pass:EditText = findViewById(R.id.id_tx_Password)
        var tx_Phone:EditText = findViewById(R.id.id_tx_Phone)

        var tx_ToLogin:TextView = findViewById(R.id.id_tx_toLogin)

        btn_Register.setOnClickListener {
             if(tx_Name.text.toString()=="" || tx_Email.text.toString()=="" || tx_Pass.text.toString()==""||tx_Phone.text.toString()=="") {
                Toast.makeText(this, "Please Fill All Fields", Toast.LENGTH_SHORT).show()

            }
            else{
                Toast.makeText(this, "Registered!!!", Toast.LENGTH_SHORT).show()

            }
        }

        tx_ToLogin.setOnClickListener{
            startActivity(Intent(this@Register,MainActivity::class.java))
        }


    }
}