package com.thishkt.demobutton

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private var isOffline: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_change.setOnClickListener {
            if (isOffline) {
                isOffline = false
                tv_state.setTextColor(Color.GREEN)
                tv_state.setText(R.string.online)
            } else {
                isOffline = true
                tv_state.setTextColor(Color.GRAY)
                tv_state.setText(R.string.offline)
            }
        }

    }
}
