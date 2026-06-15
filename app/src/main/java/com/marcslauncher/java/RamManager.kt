package com.marcslauncher.java

object RamManager {

    var allocatedRamMb = 4096

    fun setRam(amountMb: Int) {
        allocatedRamMb = amountMb
    }

}
