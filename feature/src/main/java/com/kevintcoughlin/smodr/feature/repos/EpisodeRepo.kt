package com.kevintcoughlin.smodr.feature.repos

import com.kevintcoughlin.smodr.feature.models.Item

class EpisodeRepo: Repository<Item>() {
    override fun fetchById(id: String): Item {
        return Item("hey")
    }

    override fun fetch(start: Int?, end: Int?): List<Item> {
        val list = ArrayList<Item>()
        list.add(Item("Hey"))
        list.add(Item("Hey1"))
        list.add(Item("Hey2"))
        list.add(Item("Hey3"))
        list.add(Item("Hey4"))
        return list
    }
}