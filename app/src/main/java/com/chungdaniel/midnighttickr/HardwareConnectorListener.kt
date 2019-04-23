package com.chungdaniel.midnighttickr

import com.wahoofitness.connector.HardwareConnector
import com.wahoofitness.connector.HardwareConnectorEnums
import com.wahoofitness.connector.HardwareConnectorTypes
import com.wahoofitness.connector.conn.connections.SensorConnection

class HardwareConnectorListener : HardwareConnector.Listener {
    override fun onHardwareConnectorStateChanged(
        p0: HardwareConnectorTypes.NetworkType,
        p1: HardwareConnectorEnums.HardwareConnectorState
    ) {
    }

    override fun onFirmwareUpdateRequired(p0: SensorConnection, p1: String, p2: String) {
    }
}