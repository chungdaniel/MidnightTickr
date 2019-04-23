package com.chungdaniel.midnighttickr

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.wahoofitness.connector.HardwareConnector

class HardwareConnectorService : Service() {
    private lateinit var mHardwareConnector : HardwareConnector
    private val mHardwareConnectorListener : HardwareConnector.Listener = HardwareConnectorListener()

    override fun onCreate() {
        super.onCreate()
        mHardwareConnector = HardwareConnector(this, mHardwareConnectorListener)
    }

    override fun onBind(p0: Intent?): IBinder? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onDestroy() {
        super.onDestroy()
        mHardwareConnector.shutdown()
    }
}