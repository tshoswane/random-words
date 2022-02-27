package com.salepito.randomwords

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val randomButton = findViewById<Button>(R.id.randomButton)
        val randomTextView = findViewById<TextView>(R.id.randomTextView)

        randomButton.setOnClickListener{
            val list = listOf("win", "box", "top", "hot", "one", "not", "on", "run", "girl", "off", "bed", "big", "bus", "out", "egg", "red", "rat", "her", "him", "has", "at", "bad", "hat", "van", "ten", "net", "pen", "get", "tin", "kid", "dig", "sip", "if", "in", "fit", "six", "fix", "pot", "mop", "rot", "but", "rod", "dot", "got", "fox", "ox", "odd", "jug", "gun", "hut", "nut", "hug", "rut", "gum", "up", "us", "rub", "mud", "lady", "bug", "ball", "love", "wolf", "fish", "star", "sing", "foot", "lion", "blue", "pain", "fire", "home", "safe", "good", "read", "wish", "baby", "hand", "rain", "cake", "best", "what", "time", "look", "down", "help", "food", "hope", "wind", "bird", "bean", "hair", "fall", "dark", "goat", "ship", "water", "back", "work", "magic", "dad", "fun", "mum", "boy", "cat", "leg", "man", "old", "cut", "pet", "sun", "is", "pig", "dog", "sad", "wet", "car", "bag", "sit", "cup",)
            val randomElement = list.asSequence().shuffled().find { true }

            // Display the new value in the text view.
            randomTextView.text = randomElement.toString()
        }
    }
}