package com.mahmutalperenunal.numberguessinggame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.mahmutalperenunal.numberguessinggame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)

        mainBinding.buttonStart.setOnClickListener {

            val intent = Intent(this, GameActivity::class.java)
            if (!mainBinding.radioButtonOne.isChecked && !mainBinding.radioButtonTwo.isChecked && !mainBinding.radioButtonThree.isChecked) {

                Snackbar.make(
                    mainBinding.constraintLayout,
                    "Please select a number of digits",
                    Snackbar.LENGTH_LONG
                ).show()

            } else {

                if (mainBinding.radioButtonOne.isChecked) {
                    intent.putExtra("number", "one")
                } else if (mainBinding.radioButtonTwo.isChecked) {
                    intent.putExtra("number", "two")
                } else {
                    intent.putExtra("number", "three")
                }

                startActivity(intent)

            }

        }

    }
}