package com.marcslauncher.auth

object OfflineAccount {

    fun create(username: String): Account {
        return Account(
            username,
            "offline-$username",
            AccountType.OFFLINE
        )
    }

}
