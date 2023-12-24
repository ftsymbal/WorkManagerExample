package com.example.workmanagerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager
import androidx.work.WorkRequest

class MainActivity : AppCompatActivity() {
    private lateinit var startWorkButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startWorkButton = findViewById(R.id.startWorkButton)

        startWorkButton.setOnClickListener {
            val myWorkRequest: WorkRequest =
                OneTimeWorkRequest.from(MyWorker::class.java)
            WorkManager.getInstance(this)
                .enqueue(myWorkRequest)
        }
    }
}