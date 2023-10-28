package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var foods = arrayOf("Hamburger", "Pizza", "Mexican", "American", "Chinese");
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addNewFood()
        decideDinner()
    }

    fun addNewFood() {
        val addFood = findViewById<Button>(R.id.addFood);
        val newFood = findViewById<EditText>(R.id.newFood);
        addFood.setOnClickListener() {
            foods += newFood.text.toString();
            newFood.text.clear();
        }
    }

    fun decideDinner() {
        val decideDinner = findViewById<Button>(R.id.decideDinner);
        val dinnerText = findViewById<TextView>(R.id.dinnerText);
        decideDinner.setOnClickListener() {
            val random = Random.nextInt(foods.size);
            println(foods.get(random))
            dinnerText.text = foods.get(random);
        }
    }
}