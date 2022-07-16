package org.shahramkhandagi.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    var activePlayer = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }



    fun clickOnItem(view: View) {
        val imageview = view as ImageView
        imageview.translationY = (-1500).toFloat()
        if (activePlayer == 0) {
            imageview.setImageResource(R.drawable.x)
            activePlayer = 1
        } else {
            imageview.setImageResource(R.drawable.o)
            activePlayer = 0
        }
        imageview.animate().translationYBy(1500F).rotation(3600F).duration = 300

    }
}