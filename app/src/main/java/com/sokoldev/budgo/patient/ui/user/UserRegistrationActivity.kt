package com.sokoldev.budgo.patient.ui.user

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.sokoldev.budgo.common.ui.TermActivity
import com.sokoldev.budgo.common.ui.user.LoginActivity
import com.sokoldev.budgo.databinding.ActivityUserRegistrationBinding

class UserRegistrationActivity : AppCompatActivity() {
    private lateinit var binding:ActivityUserRegistrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityUserRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.back.setOnClickListener { finish() }
        binding.login.setOnClickListener {
            val intent = Intent(this@UserRegistrationActivity, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.continueButton.setOnClickListener {
            val intent = Intent(this@UserRegistrationActivity, TermActivity::class.java)
            startActivity(intent)
        }
    }
}