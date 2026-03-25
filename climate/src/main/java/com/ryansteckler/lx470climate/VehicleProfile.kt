package com.ryansteckler.lx470climate

import android.util.Log

data class VehicleProfile(
    val name: String,
    val updateTemperature: Int,
    val updateAC: Int,
    val updateRecirc: Int,
    val updateAuto: Int,
    val updateDefrost: Int,
    val updateWindowVent: Int,
    val updateFaceVent: Int,
    val updateFeetVent: Int,
    val updateFanSpeed: Int,
    val updateRecircAuto: Int?,  // null for vehicles that don't report this
    val tempOffset: Int,
) {
    companion object {
        val LX470 = VehicleProfile(
            name = "LX470",
            updateTemperature = 11,
            updateAC = 2,
            updateRecirc = 3,
            updateAuto = 4,
            updateDefrost = 6,
            updateWindowVent = 7,
            updateFaceVent = 8,
            updateFeetVent = 9,
            updateFanSpeed = 10,
            updateRecircAuto = 15,
            tempOffset = 64,
        )

        val LC100 = VehicleProfile(
            name = "LC100",
            updateTemperature = 27,
            updateAC = 11,
            updateRecirc = 12,
            updateAuto = 4,
            updateDefrost = 15,
            updateWindowVent = 20,
            updateFaceVent = 19,
            updateFeetVent = 18,
            updateFanSpeed = 21,
            updateRecircAuto = null,
            tempOffset = 64,
        )

        val DEFAULT = LC100

        fun detect(canbusId: Int, tipId: Int): VehicleProfile {
            Log.i("VehicleProfile", "CANBUS_ID=$canbusId, TIP_ID=$tipId")
            // TODO: Add real detection once we have ID values from both vehicles.
            // For now, default to LC100 so the tester can validate.
            return DEFAULT
        }
    }
}
