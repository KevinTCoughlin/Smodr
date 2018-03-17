package com.kevintcoughlin.smodr.feature

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.kevintcoughlin.smodr.feature.network.FeedEndpoints
import com.kevintcoughlin.smodr.feature.network.RssService
import com.kevintcoughlin.smodr.feature.repos.FeedRepo
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {

    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // @TODO: Use as Singleton
        val rssRepo = FeedRepo()

        val rssService = RssService.create()
        val feedUrl = FeedEndpoints.SMODCAST.url
        val resp = rssService.fetchFeed(feedUrl)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({ result ->
                    rssRepo.put(result)
                }, { error ->
                    Toast.makeText(this, error.message, Toast.LENGTH_SHORT)
                })
    }
}

