package com.example.study

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivityNext: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_next)

        val w = window
        w.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        val buttonS: Button = findViewById(R.id.buttonS)
        val buttonStores: Button = findViewById(R.id.button_go)
        val btnI: Button = findViewById(R.id.buttonI)

        buttonStores.animate()
            .translationYBy(3000f)
            .setDuration(0)
            .withEndAction{
                buttonS.animate()
                    .translationYBy(3000f)
                    .setDuration(0)
                    .withEndAction{
                        btnI.animate()
                            .translationYBy(3000f)
                            .setDuration(0)
                    }
            }

        Handler().postDelayed({
            buttonStores.animate()
                .translationYBy(-3000f)
                .setDuration(500)
        }, 100)

        Handler().postDelayed({
            buttonS.animate()
                .translationYBy(-3000f)
                .setDuration(500)
        }, 600)

        Handler().postDelayed({
            btnI.animate()
                .translationYBy(-3000f)
                .setDuration(500)
        }, 1100)


        buttonS.setOnClickListener{
            val intent = Intent(this@MainActivityNext, listStores::class.java)
            startActivity(intent)
        }

        buttonStores.setOnClickListener {
            val intent = Intent(this@MainActivityNext, ActivityStory::class.java)
            startActivity(intent)
        }

        btnI.setOnClickListener{
            val intent = Intent(this@MainActivityNext, ActivityInfo::class.java)
            startActivity(intent)
        }

        }

        override fun onBackPressed() {
            val intent = Intent(this@MainActivityNext, MainActivity::class.java)
            startActivity(intent)
    }
}