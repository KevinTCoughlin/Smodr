package com.kevintcoughlin.smodr.feature.repos

import com.kevintcoughlin.smodr.feature.models.Feed
import javax.inject.Singleton

@Singleton
class FeedRepo: Repository<Feed> {
    override fun size(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clear() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun remove(id: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun get(id: String): Feed {
        return Feed("Hey")
    }

    override fun fetch(): List<Feed> {
        val list = ArrayList<Feed>()
        list.add(Feed("Hey"))
        list.add(Feed("Hey1"))
        list.add(Feed("Hey2"))
        list.add(Feed("Hey3"))
        list.add(Feed("Hey4"))
        return list
    }
}
