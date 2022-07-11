package com.example.groceryappactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.groceryappactivity.databinding.ActivityHomeBinding
import com.example.groceryappactivity.databinding.ActivityMainBinding

class splashActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent=Intent(this,HomeActivity::class.java)
        startActivity(intent)
        finish()



    }

}