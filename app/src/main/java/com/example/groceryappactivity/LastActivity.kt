package com.example.groceryappactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.groceryappactivity.databinding.ActivityOrderBinding

class LastActivity : AppCompatActivity() {
lateinit var binding: ActivityOrderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent= Intent(this,OrderActivity::class.java)
        startActivity(intent)
        finish()
    }
}