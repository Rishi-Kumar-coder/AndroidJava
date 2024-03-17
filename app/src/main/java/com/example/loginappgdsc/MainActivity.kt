package com.example.loginappgdsc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn_Login: Button;
        var et_Username:EditText
        var et_Password:EditText
        var tx_Register: TextView

        et_Username=findViewById(R.id.id_Text_Username)
        et_Password=findViewById(R.id.id_Text_Password)
        btn_Login=findViewById(R.id.id_btn_Login)
        tx_Register=findViewById(R.id.id_tx_Register)
        btn_Login.setOnClickListener {
            var UserName: String = et_Username.text.toString()
            var password: String = et_Password.text.toString()

            if (UserName.length==0 ){
                Toast.makeText(this,"Enter User Name...",Toast.LENGTH_SHORT).show()
            }
            else if(password.length<6){
                Toast.makeText(this,"Password Too Small",Toast.LENGTH_SHORT).show()
            }
            else if(UserName.equals("admin") && password.equals("123456")){
                Toast.makeText(this,"Logged In",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"Incorrect Credentials",Toast.LENGTH_SHORT).show()

            }


        }

        tx_Register.setOnClickListener(){

            startActivity(Intent(this@MainActivity,Register::class.java))
        }


    }
}