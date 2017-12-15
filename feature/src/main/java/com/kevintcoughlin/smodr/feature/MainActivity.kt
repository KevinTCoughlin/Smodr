package com.kevintcoughlin.smodr.feature

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.kevintcoughlin.smodr.feature.network.FeedEndpoints
import com.kevintcoughlin.smodr.feature.network.RssService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

sealed class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rssService = RssService.create()
        val feedUrl = FeedEndpoints.SMODCAST.url
        val resp = rssService.fetchFeed(feedUrl)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({
                    result -> System.out.println(result.toString())
                }, {
                    error -> System.out.println(error.message)
                })
    }
}

