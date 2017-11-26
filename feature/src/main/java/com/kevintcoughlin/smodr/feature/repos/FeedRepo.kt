package com.kevintcoughlin.smodr.feature.repos

import com.kevintcoughlin.smodr.feature.models.Channel
import com.kevintcoughlin.smodr.feature.models.Rss
import javax.inject.Singleton

@Singleton
class FeedRepo: Repository<Rss> {
    override fun size(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clear() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun remove(id: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun get(id: String): Rss {
        return Rss(Channel(""))
    }

    override fun fetch(): List<Rss> {
        val list = ArrayList<Rss>()
//        list.add(Rss("Hey"))
//        list.add(Rss("Hey1"))
//        list.add(Rss("Hey2"))
//        list.add(Rss("Hey3"))
//        list.add(Rss("Hey4"))
        return list
    }
}
