package com.marcslauncher.mods

object ModManager {

    private val mods = mutableListOf<Mod>()

    fun add(mod: Mod) {
        mods.add(mod)
    }

    fun getMods(): List<Mod> {
        return mods
    }

}
