package com.getox.xnews

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class SplashActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT:Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        barAnimation()
        centerAnimation()

        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        },SPLASH_TIME_OUT)
    }

    fun barAnimation()
    {
        var bar1 = findViewById<View>(R.id.bar_1)
        var bar2 = findViewById<View>(R.id.bar_2)
        var bar3 = findViewById<View>(R.id.bar_3)

        val animator1 = ObjectAnimator.ofFloat(bar1,View.TRANSLATION_Y,-500f,0f)
        val animator2 = ObjectAnimator.ofFloat(bar2,View.TRANSLATION_Y,-500f,0f)
        val animator3 = ObjectAnimator.ofFloat(bar3,View.TRANSLATION_Y,-500f,0f)

        animator1.duration=2000
        animator1.start()
        animator2.duration=2000
        animator2.start()
        animator3.duration=2000
        animator3.start()

    }

    fun centerAnimation()
    {
        var imgTick = findViewById<ImageView>(R.id.img_tick)

        val animator3 = ObjectAnimator.ofFloat(imgTick,View.TRANSLATION_Y,-500f,0f)
        val animator4 = ObjectAnimator.ofFloat(imgTick,View.ALPHA,1f)

        animator3.duration=2500
        animator3.start()
        animator4.duration=2500
        animator4.start()

        bottomAnimation()
    }

    fun bottomAnimation()
    {
        var appTitle = findViewById<TextView>(R.id.app_title)
        var appTagline = findViewById<TextView>(R.id.app_tagline)

        val animator5 = ObjectAnimator.ofFloat(appTitle,View.TRANSLATION_Y,300f,0f)
        val animator6 = ObjectAnimator.ofFloat(appTagline,View.TRANSLATION_Y,300f,0f)

        animator5.duration=2000
        animator5.start()
        animator6.duration=2000
        animator6.start()
    }
}
