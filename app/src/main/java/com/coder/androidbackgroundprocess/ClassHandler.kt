package com.coder.androidbackgroundprocess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.os.Handler
import android.os.Message
import android.view.View
import com.coder.androidbackgroundprocess.databinding.ActivityHandlerBinding

class ClassHandler : AppCompatActivity() {
    private lateinit var binding: ActivityHandlerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHandlerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var c = Runnable {
            binding.textView.setText("Handler berjalan sekarang")
        }

        var handler = Handler()
        handler.postDelayed(c, 1000)

//        binding.btnKlik.setOnClickListener {
//            onClick(binding.textView)
//        }
    }

//    val handler = object : Handler(Looper.getMainLooper()) {
//        override fun handleMessage(msg: Message) {
//            val message = msg.obj as String
//            binding.textView.text = message
//        }
//    }
//
//    fun onClick(v: View) {
//        Thread(Runnable {
//            fun run() {
//                val text = "Binar Academy"
//                val msg = Message.obtain()
//                msg.obj = text
//                msg.target = handler
//                msg.sendToTarget()
//            }
//        }).start()
//    }
}