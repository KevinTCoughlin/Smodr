package com.kevintcoughlin.smodr.feature.repos

import com.kevintcoughlin.common.rss.Rss

class FeedRepo: Repository<Rss> {
    private val feeds: HashMap<String, Rss>

    constructor() {
        feeds = HashMap(0)
    }
    constructor(rss: Rss) {
        feeds = HashMap(1)
        feeds[rss.channel.title] = rss
    }

    constructor(rss: Array<Rss>) {
        feeds = HashMap(rss.size)

        for (r in rss) {
            feeds[r.channel.title] = r
        }
    }

    override fun size(): Int {
        return feeds.size
    }

    override fun clear() {
        feeds.clear()
    }

    override fun remove(id: String) {
        feeds.remove(id)
    }

    override fun get(id: String): Rss {
        return feeds[id] ?: throw Exception("Feed not found.")
    }

    override fun put(obj: Rss) {
        feeds[obj.channel.title] = obj
    }

    override fun putAll(obj: Array<out Rss>) {
        for (r in obj) {
            put(r)
        }
    }

    override fun fetch(): List<Rss> {
        return feeds.values.toList()
    }
}
