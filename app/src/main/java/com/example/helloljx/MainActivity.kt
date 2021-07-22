package com.example.helloljx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgViewQR = findViewById<ImageView>(R.id.imageViewQR)
        val btnShowQR = findViewById<Button>(R.id.button)

        btnShowQR.setOnClickListener{
            if(imgViewQR.visibility==View.GONE){
                btnShowQR.text=getString(R.string.ShowQR)
                    imgViewQR.visibility=View.VISIBLE
            }else{
                btnShowQR.setText(R.string.ShowQR)
                imgViewQR.visibility=View.GONE
            }
        }
    }
}