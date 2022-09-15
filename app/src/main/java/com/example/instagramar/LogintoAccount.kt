package com.example.instagramar

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import com.example.instagramar.databinding.ActivityLogintoAccountBinding

class LogintoAccount : AppCompatActivity() {
    private lateinit var binding: ActivityLogintoAccountBinding
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLogintoAccountBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar?.hide()
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN


        binding.email.setOnClickListener {
            binding.email.background = resources.getDrawable(R.drawable.switch_trcks,null)
            binding.email.setTextColor(resources.getColor(R.color.black, null))
            binding.phone.background = null
            binding.emailLayout.visibility = View.VISIBLE
            binding.phonelayout.visibility = View.GONE
            binding.phone.setTextColor(resources.getColor(R.color.black, null))

            binding.view2.setOnClickListener {
                binding.view2.background = resources.getDrawable(R.drawable.switch_trcks,null)
//            binding.view2.setTextColor(resources.getColor(R.color.black, null))
                binding.view1.background = null
                binding.emailLayout.visibility = View.VISIBLE
                binding.phonelayout.visibility = View.GONE
//            binding.view1.setTextColor(resources.getColor(R.color.black, null))
            }
        }








        binding.phone.setOnClickListener {
            binding.email.background = null
            binding.email.setTextColor(resources.getColor(R.color.black, null))
            binding.phone.background = resources.getDrawable(R.drawable.switch_trcks,null)
            binding.emailLayout.visibility = View.GONE
            binding.phonelayout.visibility = View.VISIBLE
            binding.phone.setTextColor(resources.getColor(R.color.black, null))

            binding.view1.setOnClickListener {
                binding.view2.background = null
//            binding.view2.setTextColor(resources.getColor(R.color.purple_700, null))
                binding.view1.background = resources.getDrawable(R.drawable.switch_trcks,null)
                binding.emailLayout.visibility = View.GONE
                binding.phonelayout.visibility = View.VISIBLE
//            binding.view1.setTextColor(resources.getColor(R.color.black, null))
            }
        }

         binding.btnPhoneEmail.setOnClickListener{
             startActivity(Intent(this,Register::class.java))
         }



    }
}