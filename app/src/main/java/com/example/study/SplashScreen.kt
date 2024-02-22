package com.example.study

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.study.databinding.SplashBinding

class SplashScreen : AppCompatActivity() {
    private lateinit var binding: SplashBinding
    @SuppressLint("ObsoleteSdkInt", "Recycle")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)

        val w = window
        w.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        val anim1 = AnimationUtils.loadAnimation(this, R.anim.load_screen)
        val anim2 = AnimationUtils.loadAnimation(this, R.anim.load_screen_out)
        val text = findViewById<TextView>(R.id.text1)

        text.startAnimation(anim1)
        Handler().postDelayed({
            text.startAnimation(anim2)
        }, 400)

        Handler().postDelayed({
            val intent = Intent(this@SplashScreen, MainActivity::class.java)
            startActivity(intent)}, 800)
        }
}