package com.neppplus.myfavoriteapp_20220604

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//        로딩화면에서 => (2.5초 기다리고) => 메인화면으로 이동 + 로딩화면 종료

        val myIntent = Intent(this, MainActivity::class.java)
        startActivity(myIntent)
        finish()

    }
}