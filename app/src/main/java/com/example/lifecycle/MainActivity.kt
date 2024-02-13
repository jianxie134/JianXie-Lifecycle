package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(TAG, "onCreate() called")

        var button : Button = findViewById(R.id.button)
        var textView: TextView = findViewById(R.id.textView)
        var editText: EditText = findViewById(R.id.editText)

        button.setOnClickListener {view: View ->
            textView.text = getString(R.string.hello)
            editText.setText(getString(R.string.hello))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart() is called")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume() is called")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause() is called")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop() is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy() is called")
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}