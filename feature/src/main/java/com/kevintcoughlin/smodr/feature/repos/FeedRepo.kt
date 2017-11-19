package com.kevintcoughlin.smodr.feature.repos

import com.kevintcoughlin.smodr.feature.models.Feed

class FeedRepo: Repository<Feed>() {
    override fun fetchById(id: String): Feed {
        return Feed("hey")
    }

    override fun fetch(start: Int?, end: Int?): List<Feed> {
        val list = ArrayList<Feed>()
        list.add(Feed("Hey"))
        list.add(Feed("Hey1"))
        list.add(Feed("Hey2"))
        list.add(Feed("Hey3"))
        list.add(Feed("Hey4"))
        return list
    }
}
