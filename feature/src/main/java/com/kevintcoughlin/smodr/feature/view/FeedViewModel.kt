package com.kevintcoughlin.smodr.feature.view

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import com.kevintcoughlin.smodr.feature.models.Feed
import com.kevintcoughlin.smodr.feature.repos.FeedRepo
import javax.inject.Inject


class FeedViewModel: ViewModel() {
    @Inject
    lateinit var feed: LiveData<Feed>

    @Inject
    lateinit var feedRepo: FeedRepo

    fun init(id: String) {
        feed = feedRepo.get(id)
    } }