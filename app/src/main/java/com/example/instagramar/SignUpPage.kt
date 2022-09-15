package com.example.instagramar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager.LayoutParams.*
import com.example.instagramar.databinding.ActivitySignUpPageBinding

class SignUpPage : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding =  ActivitySignUpPageBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        window.setFlags(
            FLAG_FULLSCREEN,
            FLAG_FULLSCREEN
        )

        supportActionBar?.hide()


        binding.logIn.setOnClickListener{
            startActivity(Intent(this,LogintoAccount::class.java))
        }
    }
}