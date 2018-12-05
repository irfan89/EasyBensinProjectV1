package com.example.irfan.easybensinv1.auth

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AlphaAnimation
import android.view.animation.TranslateAnimation
import kotlinx.android.synthetic.main.fragment_auth_sign_in.*

class AuthSignInFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_auth_sign_in, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val trans1 = TranslateAnimation(700F, 0F, 0F, 0F)
        trans1.duration = 800
        val trans2 = TranslateAnimation(700F, 0F, 0F, 0F)
        trans2.duration = 1000
        val fadeIn = AlphaAnimation(0F, 1F)
        fadeIn.duration = 2000
        etSignInEmail.startAnimation(trans1)
        etSignInPassword.startAnimation(trans2)
        btnSignIn.startAnimation(fadeIn)

        tvSignIn1.setOnClickListener {
            (activity as AuthActivity).viewSignUp()
        }

        btnSignIn.setOnClickListener {
            val path = "main-app"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("my-main://$path"))
            startActivity(intent)
        }
    }
}