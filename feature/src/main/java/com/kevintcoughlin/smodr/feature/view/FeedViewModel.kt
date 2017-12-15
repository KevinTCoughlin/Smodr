package com.kevintcoughlin.smodr.feature.view

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import com.kevintcoughlin.common.rss.Rss
import com.kevintcoughlin.smodr.feature.repos.FeedRepo
import javax.inject.Inject


sealed class FeedViewModel: ViewModel() {
    @Inject
    lateinit var channel: LiveData<Rss>

    @Inject
    lateinit var feedRepo: FeedRepo
}