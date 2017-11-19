package com.kevintcoughlin.smodr.feature

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import com.kevintcoughlin.smodr.feature.network.RssService
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofit = Retrofit.Builder().build()
        val rssService = retrofit.create(RssService::class.java)
        val resp = rssService.fetchFeed("http://feeds.feedburner.com/SModcasts")

        val list = findViewById<RecyclerView>(R.id.list)
        val linearLayoutManager = LinearLayoutManager(this)

        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        list.setHasFixedSize(true)
        list.layoutManager = linearLayoutManager
    }
}
