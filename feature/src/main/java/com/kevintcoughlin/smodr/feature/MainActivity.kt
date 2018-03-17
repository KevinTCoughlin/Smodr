package com.kevintcoughlin.smodr.feature

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import android.view.Menu
import android.view.MenuItem
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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item != null) {
            when (item.itemId) {
                R.id.menu_settings -> launchSettings()
                else -> return super.onOptionsItemSelected(item)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun launchSettings() {
        val intent = Intent(this, SettingsActivity::class.java)
        startActivity(intent)
    }
}

