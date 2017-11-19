package com.kevintcoughlin.smodr.feature

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kevintcoughlin.smodr.feature.network.RssService
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofit = Retrofit.Builder()
                .build()

        val rssService = retrofit.create(RssService::class.java)
    }
}
