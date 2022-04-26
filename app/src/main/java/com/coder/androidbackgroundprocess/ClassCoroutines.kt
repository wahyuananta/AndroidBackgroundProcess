package com.coder.androidbackgroundprocess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.coder.androidbackgroundprocess.databinding.ActivityCoroutinesBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ClassCoroutines : AppCompatActivity() {
    private lateinit var binding: ActivityCoroutinesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCoroutinesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnKlik.setOnClickListener {
            main()
        }
    }

    // Contoh untuk Launch
    fun main() {
        // Menjalankan coroutine baru di background dan dilanjutkan
        GlobalScope.launch {
            // non-blocking delay selama 1 detik (satuan waktu default adalah ms)
            delay(1000)
            // print setelah delay
            println("Coroutines!")
        }

        // main thread berlanjut sementara coroutine sedang delayed
        println("Hello,")
        // block main thread selama 2 detik untuk menjaga agar JVM tetap hidup
        Thread.sleep(2000)
    }

//    // Contoh untuk Async
//    fun main() {
//        val first = async { getNumber() }
//        val result = first.await()
//        println(result)
//    }
//
//    suspend fun getNumber() : Int {
//        delay(1000)
//        return 4*3
//    }
}