package com.example.irfan.easybensinv1.auth

import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_splas_screen.*


class SplashScreenFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_splas_screen, container, false)
    }

    private var mProgressStatus = 0
    private val mHandler = Handler()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        progressBarAuth.progressDrawable.setColorFilter(Color.WHITE, android.graphics.PorterDuff.Mode.SRC_IN)
        Thread(Runnable {
            while (mProgressStatus < 100) {
                mProgressStatus++
                android.os.SystemClock.sleep(10)
                mHandler.post { progressBarAuth.progress = mProgressStatus }
            }
            mHandler.post { (activity as AuthActivity).viewSignUp() }
        }).start()

    }
}