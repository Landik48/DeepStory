package com.example.study

import android.os.Bundle
import android.view.WindowManager
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.json.JSONObject
import java.io.InputStream

class StoryOnly : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story_only)

        val w = window
        w.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        val i = intent.getIntExtra("i", 1)

        var json: String? = null

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
}