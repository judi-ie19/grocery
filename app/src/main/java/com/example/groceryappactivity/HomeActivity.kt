package com.example.groceryappactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class HomeActivity : AppCompatActivity() {
    lateinit var btnfruits:ImageButton
    lateinit var btnvegetables:ImageButton
    lateinit var btnmeat:ImageButton
    lateinit var btnnext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnfruits = findViewById(R.id.btnfruits)
        btnfruits.setOnClickListener {
            var intent = Intent(this, FruitsActivity::class.java)
            startActivity(intent)
            btnvegetables = findViewById(R.id.btnvegetables)
            btnvegetables.setOnClickListener {
                var intent = Intent(this, VegetablesActivity::class.java)
                startActivity(intent)

                btnmeat = findViewById(R.id.btnmeat)
                btnmeat.setOnClickListener {
                    var intent = Intent(this, LastActivity::class.java)
                    startActivity(intent)

                    btnnext=findViewById(R.id.btnnext)
                    btnnext.setOnClickListener {
                        var intent=Intent(this,OrderActivity::class.java)
                        startActivity(intent)


                    }



                }


            }
        }
    }
}