package com.bdizital.paparazzilib

import android.widget.LinearLayout
import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import org.junit.Rule
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    enum class Config(
        val deviceConfig: DeviceConfig,
    ) {
        NEXUS_4(deviceConfig = DeviceConfig.NEXUS_4), NEXUS_5(deviceConfig = DeviceConfig.NEXUS_5), NEXUS_5_LAND(
            deviceConfig = DeviceConfig.NEXUS_5_LAND
        ),
    }

    @get:Rule
    var paparazzi = Paparazzi(deviceConfig = Config.NEXUS_5.deviceConfig)

    @Test
    fun paparazziTest() {

        paparazzi.snapshot {
            CustomButton(text = "Custom Button")
        }

        // With XML
        // val launch = paparazzi.inflate<LinearLayout>(R.layout.file)
        // paparazzi.snapshot(view = launch)
    }
}