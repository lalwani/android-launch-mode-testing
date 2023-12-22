package com.saurabh.playground

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.fragment.app.FragmentManager

class SingleTopActivity : AppCompatActivity() {

    companion object {
        const val TAG = "SingleTopActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: $taskId")
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.launch_a).setText("One")
        findViewById<Button>(R.id.launch_a)
            .setOnClickListener {
                val intent = Intent(this, SecondActivity::class.java)
                    .putExtra("title", "Single Top")
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
                startActivity(intent)
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