package br.com.lugamvazori.calculaflex.ui.betterfuel

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import br.com.lugamvazori.calculaflex.R
import br.com.lugamvazori.calculaflex.databinding.FragmentBetterFuelBinding
import br.com.lugamvazori.calculaflex.databinding.FragmentLogInBinding
import br.com.lugamvazori.calculaflex.ui.base.auth.BaseAuthFragment

class BetterFuelFragment: BaseAuthFragment() {
    override val layout: Int
        get() = R.layout.fragment_better_fuel
}