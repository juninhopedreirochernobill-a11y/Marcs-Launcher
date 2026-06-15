package com.marcslauncher.auth

data class Account(
    val username: String,
    val uuid: String,
    val type: AccountType
)
