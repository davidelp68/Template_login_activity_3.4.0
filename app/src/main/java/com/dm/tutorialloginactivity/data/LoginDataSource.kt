package com.dm.tutorialloginactivity.data

import com.dm.tutorialloginactivity.data.model.LoggedInUser
import java.io.IOException

/**
 * Classe che gestisce l'autenticazione con le credenziali di accesso e recupera le
 * informazioni sull'utente.
 */
class LoginDataSource {

    fun login(username: String, password: String): Result<LoggedInUser> {
        try {
            // TODO: gestire l'autenticazione loggedInUser
            val fakeUser = LoggedInUser(java.util.UUID.randomUUID().toString(), "Jane Doe")
            return Result.Success(fakeUser)
        } catch (e: Throwable) {
            return Result.Error(IOException("Error logging in", e))
        }
    }

    fun logout() {
        // TODO: revocare l'autenticazione
    }
}

