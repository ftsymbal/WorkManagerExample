package com.example.workmanagerexample

import android.content.Context
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import kotlinx.coroutines.delay

class MyWorker(appContext: Context, workerParams: WorkerParameters):
    CoroutineWorker(appContext, workerParams) {
    override suspend fun doWork(): Result {

        // Emulate 10 second work
        Log.i(TAG, "Started Work")
        delay(10000)
        Log.i(TAG, "Done some Work")

        return Result.success()
    }

    companion object {
        private const val TAG = "MyWorker"
    }
}