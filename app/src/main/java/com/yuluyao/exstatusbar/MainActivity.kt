package com.yuluyao.exstatusbar

import android.graphics.Color
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  /*  window.decorView.systemUiVisibility =
        View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or
        View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or
        View.SYSTEM_UI_FLAG_FULLSCREEN or
        View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or
        View.SYSTEM_UI_FLAG_IMMERSIVE or
        View.SYSTEM_UI_FLAG_LAYOUT_STABLE

    if (Build.VERSION.SDK_INT >= 21) {
      window.statusBarColor = 0x8800ffff.toInt()
//      window.statusBarColor =Color.TRANSPARENT
      window.navigationBarColor = 0x88ff00ff.toInt()
    }*/


//    window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
//    window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)


  }
}
