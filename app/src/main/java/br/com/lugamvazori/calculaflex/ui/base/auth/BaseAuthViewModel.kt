package br.com.lugamvazori.calculaflex.ui.base.auth

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.lugamvazori.calculaflex.models.RequestState
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class BaseAuthViewModel : ViewModel() {

    private var mAuth: FirebaseAuth = FirebaseAuth.getInstance()

    val loggedState = MutableLiveData<RequestState<FirebaseUser>>()

    fun isLoggedIn() {
        loggedState.value = RequestState.Loading

        mAuth.currentUser?.reload()

        val user = mAuth.currentUser

        if (user == null) {
            loggedState.value = RequestState.Error(Throwable("Usuário deslogado"))
        } else {
            loggedState.value = RequestState.Success(user)
        }
    }
}
