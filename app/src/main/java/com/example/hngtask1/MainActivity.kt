package com.example.hngtask1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import com.example.hngtask1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mainBinding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)
        mainBinding.githubButton.setOnClickListener {
            mainBinding.webView.loadUrl("https://github.com/Titilegend")
        }

    }
}