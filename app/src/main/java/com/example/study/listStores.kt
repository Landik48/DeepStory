package com.example.study

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class listStores : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_stores)

        val w = window
        w.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        val btn1: Button = findViewById(R.id.button1)
        val btn2: Button = findViewById(R.id.button2)
        val btn3: Button = findViewById(R.id.button3)
        val btn4: Button = findViewById(R.id.button4)
        val btn5: Button = findViewById(R.id.button5)
        val btn6: Button = findViewById(R.id.button6)
        val btn7: Button = findViewById(R.id.button7)
        val btn8: Button = findViewById(R.id.button8)
        val btn9: Button = findViewById(R.id.button9)
        val btn10: Button = findViewById(R.id.button10)
        val btn11: Button = findViewById(R.id.button11)
        val btn12: Button = findViewById(R.id.button12)
        val btn13: Button = findViewById(R.id.button13)
        val btn14: Button = findViewById(R.id.button14)
        val btn15: Button = findViewById(R.id.button15)

        btn1.setOnClickListener {
            val intent = Intent(this@listStores, StoryOnly::class.java)
            intent.putExtra("i", 1)
            startActivity(intent)
        }
        btn2.setOnClickListener {
            val intent = Intent(this@listStores, StoryOnly::class.java)
            intent.putExtra("i", 2)
            startActivity(intent)
        }
        btn3.setOnClickListener {
            val intent = Intent(this@listStores, StoryOnly::class.java)
            intent.putExtra("i", 3)
            startActivity(intent)
        }
        btn4.setOnClickListener {
            val intent = Intent(this@listStores, StoryOnly::class.java)
            intent.putExtra("i", 4)
            startActivity(intent)
        }
        btn5.setOnClickListener {
           val intent = Intent(this@listStores, StoryOnly::class.java)
            intent.putExtra("i", 5)
            startActivity(intent)
        }
        btn6.setOnClickListener {
            val intent = Intent(this@listStores, StoryOnly::class.java)
            intent.putExtra("i", 6)
            startActivity(intent)
        }
        btn7.setOnClickListener {
           val intent = Intent(this@listStores, StoryOnly::class.java)
            intent.putExtra("i", 7)
            startActivity(intent)
        }
        btn8.setOnClickListener {
           val intent = Intent(this@listStores, StoryOnly::class.java)
            intent.putExtra("i", 8)
            startActivity(intent)
        }
        btn9.setOnClickListener {
           val intent = Intent(this@listStores, StoryOnly::class.java)
            intent.putExtra("i", 9)
            startActivity(intent)
        }
        btn10.setOnClickListener {
         val intent = Intent(this@listStores, StoryOnly::class.java)
            intent.putExtra("i", 10)
            startActivity(intent)
        }
        btn11.setOnClickListener {
         val intent = Intent(this@listStores, StoryOnly::class.java)
            intent.putExtra("i", 11)
            startActivity(intent)
        }
        btn12.setOnClickListener {
         val intent = Intent(this@listStores, StoryOnly::class.java)
            intent.putExtra("i", 12)
            startActivity(intent)
        }
        btn13.setOnClickListener {
         val intent = Intent(this@listStores, StoryOnly::class.java)
            intent.putExtra("i", 13)
            startActivity(intent)
        }
        btn14.setOnClickListener {
         val intent = Intent(this@listStores, StoryOnly::class.java)
            intent.putExtra("i", 14)
            startActivity(intent)
        }
        btn15.setOnClickListener {
         val intent = Intent(this@listStores, StoryOnly::class.java)
            intent.putExtra("i", 15)
            startActivity(intent)
        }

    }
    override fun onBackPressed() {
        val intent = Intent(this@listStores, MainActivityNext::class.java)
        startActivity(intent)
    }

}