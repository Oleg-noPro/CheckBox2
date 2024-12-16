package com.example.checkbox2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var toolBarTB: Toolbar

    private lateinit var infoTV: TextView
    private lateinit var infoCheckCB: CheckBox

    private lateinit var text_ppd_TV: TextView

    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        toolBarTB = findViewById(R.id.toolBarTB)
        setSupportActionBar(toolBarTB)
        title = "Правила дорожного движения"

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        infoTV = findViewById(R.id.infoTV)
        infoCheckCB = findViewById(R.id.infoCheckCB)

        text_ppd_TV = findViewById(R.id.text_ppd_TV)

        infoCheckCB.setOnClickListener { view ->
            if (infoCheckCB.isChecked) {
                infoTV.text = "Правила дорожного движения."
                text_ppd_TV.text = "1. Первое правило." +
                        "2. Второе правило." +
                        "3. Третье правило."
            } else {
                infoTV.text = "Информация"
                text_ppd_TV.text = ""
            }
        }
    }
}