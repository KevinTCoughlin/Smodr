package com.kevintcoughlin.smodr.feature.repos

import com.kevintcoughlin.smodr.feature.models.Channel
import com.kevintcoughlin.smodr.feature.models.Rss
import javax.inject.Singleton

@Singleton
sealed class FeedRepo: Repository<Rss> {
    override fun size(): Int {
        throw NotImplementedError();
    }

    override fun clear() {
        throw NotImplementedError();
    }

    override fun remove(id: String) {
        throw NotImplementedError();
    }

    override fun get(id: String): Rss {
        return Rss(Channel(""))
    }

    override fun fetch(): List<Rss> {
        return ArrayList()
    }
}
