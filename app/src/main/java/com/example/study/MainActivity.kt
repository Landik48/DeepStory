package com.example.study

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonScr1: Button = findViewById(R.id.buttonScr1)

        val w = window
        w.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        Handler().postDelayed({
            animation()
        }, 300)


        buttonScr1.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivityNext::class.java)
            startActivity(intent)
        }

    }
    fun animation(){
        val buttonScr1: Button = findViewById(R.id.buttonScr1)

        buttonScr1.animate()
            .translationXBy(200f)
            .setDuration(350)

            .withEndAction {
                buttonScr1.animate()
                    .translationXBy(-400f)
                    .setDuration(350)

                    .withEndAction {
                        buttonScr1.animate()
                            .translationXBy(300f)
                            .setDuration(450)

                            .withEndAction {
                                buttonScr1.animate()
                                    .translationXBy(-200f)
                                    .setDuration(450)

                                    .withEndAction {
                                        buttonScr1.animate()
                                            .translationXBy(150f)
                                            .setDuration(600)

                                            .withEndAction {
                                                buttonScr1.animate()
                                                    .translationXBy(-50f)
                                                    .setDuration(600)
                                            }
                                    }
                            }
                    }
            }

    }

    override fun onBackPressed() {
        Toast.makeText(this, "Дальше некуда)", Toast.LENGTH_SHORT).show()
    }
}