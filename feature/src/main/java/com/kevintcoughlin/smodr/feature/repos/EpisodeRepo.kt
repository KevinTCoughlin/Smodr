package com.kevintcoughlin.smodr.feature.repos

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.kevintcoughlin.smodr.feature.models.Item

class EpisodeRepo: Repository<Item> {
    override fun clear() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun remove(id: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun size(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

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