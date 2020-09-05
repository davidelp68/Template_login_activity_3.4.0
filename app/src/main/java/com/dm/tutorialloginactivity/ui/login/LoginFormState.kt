package com.dm.tutorialloginactivity.ui.login

/**
 * Stato di convalida dei dati del modulo di accesso.
 */
data class LoginFormState(
    val usernameError: Int? = null,
    val passwordError: Int? = null,
    val isDataValid: Boolean = false
)
