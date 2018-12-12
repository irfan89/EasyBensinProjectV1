package com.example.irfan.easybensinv1.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AlphaAnimation
import android.view.animation.TranslateAnimation
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_auth_sign_up.*

class AuthSignUpFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_auth_sign_up, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val trans1 = TranslateAnimation(700F, 0F, 0F, 0F)
        trans1.duration = 800
        val trans2 = TranslateAnimation(700F, 0F, 0F, 0F)
        trans2.duration = 1000
        val trans3 = TranslateAnimation(700F, 0F, 0F, 0F)
        trans3.duration = 1200
        val fadeIn = AlphaAnimation(0F, 1F)
        fadeIn.duration = 2200
        etSignUpFullName.startAnimation(trans1)
        etSignUpEmail.startAnimation(trans2)
        etSignUpPassword.startAnimation(trans3)
        btnSignUp.startAnimation(fadeIn)

        tvSignUp2.setOnClickListener {
            (activity as AuthActivity).viewSignIn()
        }
    }
}