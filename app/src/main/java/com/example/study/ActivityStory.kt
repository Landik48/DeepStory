package com.example.study

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.json.JSONObject
import java.io.IOException
import java.io.InputStream

class ActivityStory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story)

        val w = window
        w.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        val back:Button = findViewById(R.id.back)
        val next:Button = findViewById(R.id.next)

        back.animate()
            .translationYBy(1000f)
            .setDuration(0)
        next.animate()
            .translationYBy(1000f)
            .setDuration(0)

        Handler().postDelayed({
            next.animate().translationYBy(-1100f).setDuration(600).withEndAction{
                next.animate().translationYBy(100f).setDuration(600)
            }
            back.animate().translationYBy(-1100f).setDuration(700).withEndAction{
                back.animate().translationYBy(100f).setDuration(700)
            }
        }, 400)

        var i = 1
        read_json(i)

        back.setOnClickListener {
            if (i == 1) {
                Toast.makeText(this, "Это первая страница", Toast.LENGTH_SHORT).show()
                back.animate()
                    .translationXBy(100f)
                    .setDuration(300)

                    .withEndAction {
                        back.animate()
                            .translationXBy(-200f)
                            .setDuration(300)

                            .withEndAction {
                                back.animate()
                                    .translationXBy(150f)
                                    .setDuration(300)

                                    .withEndAction {
                                        back.animate()
                                            .translationXBy(-50f)
                                            .setDuration(400)
                                    }
                            }
                    }

            } else {
                i -= 1; read_json(i)
            }
        }

        next.setOnClickListener {
            if (i == 15) {
                Toast.makeText(this, "Это последняя страница", Toast.LENGTH_SHORT).show()

                next.animate()
                    .translationXBy(100f)
                    .setDuration(300)

                    .withEndAction {
                        next.animate()
                            .translationXBy(-200f)
                            .setDuration(300)

                            .withEndAction {
                                next.animate()
                                    .translationXBy(150f)
                                    .setDuration(300)

                                    .withEndAction {
                                        next.animate()
                                            .translationXBy(-50f)
                                            .setDuration(400)
                            }
                        }
                    }

            } else {
                i += 1; read_json(i)
            }
        }
    }

    fun read_json(i: Int){
        var json: String? = null

        try{
            val input: InputStream = assets.open("stores.json")
            json = input.bufferedReader().use {it.readText()}
            val jsonOBJ = JSONObject(json)

            val name: TextView = findViewById(R.id.nameStory)
            val text: TextView = findViewById(R.id.textStory)
            val author: TextView = findViewById(R.id.author)

            val data_name = jsonOBJ.getJSONObject(i.toString()).getString("name")
            val data_text = jsonOBJ.getJSONObject(i.toString()).getString("text")
            val data_author = jsonOBJ.getJSONObject(i.toString()).getString("author")

            name.text = data_name
            text.text = data_text
            author.text = data_author
        }
        catch (e: IOException){Toast.makeText(this, "Error!", Toast.LENGTH_SHORT).show()}
    }

    override fun onBackPressed() {
        val intent = Intent(this@ActivityStory, MainActivityNext::class.java)
        startActivity(intent)
    }
}