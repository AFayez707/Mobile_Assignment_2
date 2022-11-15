/*
 * Created by: Ahmed Fayez
 */

package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private var foodList = arrayOf("Hamburger", "Pizza", "Mexican", "American", "Chinese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addButton = findViewById<Button>(R.id.btnAdd)
        val btnDecide = findViewById<Button>(R.id.btnDecide)
        val textAdd = findViewById<EditText>(R.id.txtAdd)
        val txtResult = findViewById<TextView>(R.id.txtResult)

        addButton.setOnClickListener {
            if (textAdd.text.isNotEmpty()) {
                foodList += (textAdd.text.toString())
                txtResult.text = textAdd.text.toString()
                textAdd.text.clear()
            }
        }

        btnDecide.setOnClickListener{
            var s = (foodList.size - 1)
            var rand = (0..s).random()
            txtResult.text = foodList[rand]
        }

    }

}
