package com.saurabh.playground

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.fragment.app.FragmentManager

class ThirdActivity : AppCompatActivity() {

    companion object {
        const val TAG = "ThirdActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: $taskId")
        val title = intent.getStringExtra("title")
        setTitle(title)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.launch_a).setText("Three. Finish")
        findViewById<Button>(R.id.launch_a)
            .setOnClickListener {
                finish()
            }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(TAG, "onNewIntent: $taskId")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: $taskId")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: $taskId")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: $taskId")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: $taskId")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: $taskId")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: $taskId")
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Log.d(TAG, "onBackPressed: $taskId")
    }
}