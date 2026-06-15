package com.marcslauncher.auth

object AccountManager {

    private val accounts = mutableListOf<Account>()

    fun addAccount(account: Account) {
        accounts.add(account)
    }

    fun getAccounts(): List<Account> {
        return accounts
    }

}
