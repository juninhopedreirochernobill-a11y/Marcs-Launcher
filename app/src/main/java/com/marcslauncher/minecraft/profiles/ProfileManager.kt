package com.marcslauncher.minecraft.profiles

object ProfileManager {

    private val profiles = mutableListOf<Profile>()

    fun add(profile: Profile) {
        profiles.add(profile)
    }

}
