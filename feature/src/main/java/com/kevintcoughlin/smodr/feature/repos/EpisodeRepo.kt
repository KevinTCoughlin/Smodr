package com.kevintcoughlin.smodr.feature.repos

import com.kevintcoughlin.HashMapRepository
import com.kevintcoughlin.common.rss.Item

class EpisodeRepo: HashMapRepository<Item>() {
    override fun get(id: String): Item {
        return Item("hey")
    }

    override fun fetch(): List<Item> {
        val list = ArrayList<Item>()
        list.add(Item("Hey"))
        list.add(Item("Hey1"))
        list.add(Item("Hey2"))
        list.add(Item("Hey3"))
        list.add(Item("Hey4"))
        return list
    }
}