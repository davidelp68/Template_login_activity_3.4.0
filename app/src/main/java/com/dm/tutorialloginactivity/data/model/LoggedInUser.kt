package com.dm.tutorialloginactivity.data.model

/**
 * Classe di dati che cattura le informazioni sull'utente per gli utenti che hanno effettuato
 * l'accesso recuperate da LoginRepository
 */
data class LoggedInUser(
    val userId: String,
    val displayName: String
)
