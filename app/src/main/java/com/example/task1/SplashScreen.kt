package com.example.task1

import android.animation.Animator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.task1.databinding.SplashScreenBinding

class SplashScreen : AppCompatActivity() {

    private lateinit var binding:SplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=SplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.splashLottie.playAnimation()

        binding.splashLottie.addAnimatorListener(object : Animator.AnimatorListener{
            override fun onAnimationStart(p0: Animator) {
            }

            override fun onAnimationEnd(p0: Animator) {
                startProgram()
            }

            override fun onAnimationCancel(p0: Animator) {
            }

            override fun onAnimationRepeat(p0: Animator) {
            }

        })
    }

    private fun startProgram(){
        val intent= Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()

    }
}