package com.kevintcoughlin.smodr.feature.repos

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.kevintcoughlin.smodr.feature.models.Feed
import javax.inject.Singleton

@Singleton
class FeedRepo: Repository<Feed>() {
    override fun get(id: String): LiveData<Feed> {
        val data: MutableLiveData<Feed> = MutableLiveData()
        data.value = Feed("Hey")
        return data
    }

    override fun fetch(start: Int?, end: Int?): LiveData<List<Feed>> {
        val data: MutableLiveData<List<Feed>> = MutableLiveData()
        val list = ArrayList<Feed>()
        list.add(Feed("Hey"))
        list.add(Feed("Hey1"))
        list.add(Feed("Hey2"))
        list.add(Feed("Hey3"))
        list.add(Feed("Hey4"))
        data.value = list
        return data
    }
}
