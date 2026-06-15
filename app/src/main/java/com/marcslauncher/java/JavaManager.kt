package com.marcslauncher.java

object JavaManager {

    var currentVersion = JavaVersion.JAVA_21

    fun switch(version: JavaVersion) {
        currentVersion = version
        println("Using $version")
    }

}
