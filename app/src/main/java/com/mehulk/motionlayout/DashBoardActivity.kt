package com.mehulk.motionlayout

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashBoardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        btnSample.setOnClickListener { startActivity(Intent(this, SimpleActivity::class.java)) }
        btnConstraintSet.setOnClickListener { startActivity(Intent(this, ConstraintSetActivity::class.java)) }
        btnKeyFrameSet.setOnClickListener { startActivity(Intent(this, KeyFrameSetActivity::class.java)) }
        btnParallax.setOnClickListener { startActivity(Intent(this, ParallaxActivity::class.java)) }
    }
}
