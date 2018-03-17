package com.kevintcoughlin.smodr.feature.repos

import com.kevintcoughlin.HashMapRepository
import com.kevintcoughlin.common.rss.Rss

class FeedRepo: HashMapRepository<Rss>() {
    override fun getKey(rss: Rss): String {
        return rss.channel.title
    }
}
