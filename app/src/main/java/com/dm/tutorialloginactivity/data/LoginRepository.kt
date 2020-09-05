package com.dm.tutorialloginactivity.data

import com.dm.tutorialloginactivity.data.model.LoggedInUser

/**
 * Classe che richiede l'autenticazione e le informazioni sull'utente dall'origine dati remota e
 * mantiene una cache in memoria dello stato di accesso e delle informazioni sulle
 * credenziali dell'utente.
 */

class LoginRepository(val dataSource: LoginDataSource) {

    // cache in memoria dell'oggetto loggedInUser
    var user: LoggedInUser? = null
        private set

    val isLoggedIn: Boolean
        get() = user != null

    init {
        // Se le credenziali dell'utente verranno memorizzate nella cache nella memoria locale,
        // si consiglia di crittografarle
        // vedere https://developer.android.com/training/articles/keystore
        user = null
    }

    fun logout() {
        user = null
        dataSource.logout()
    }

    fun login(username: String, password: String): Result<LoggedInUser> {
        // gestire il login
        val result = dataSource.login(username, password)

        if (result is Result.Success) {
            setLoggedInUser(result.data)
        }

        return result
    }

    private fun setLoggedInUser(loggedInUser: LoggedInUser) {
        this.user = loggedInUser
        // Se le credenziali dell'utente verranno memorizzate nella cache nella memoria locale,
        // si consiglia di crittografarle
        // vedere https://developer.android.com/training/articles/keystore
    }
}
