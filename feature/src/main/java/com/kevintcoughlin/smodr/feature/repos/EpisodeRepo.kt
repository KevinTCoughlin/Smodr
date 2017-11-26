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

    override fun get(id: String): LiveData<Item> {
        val data = MutableLiveData<Item>()
        data.value = Item("hey")
        return data
    }

    override fun fetch(): LiveData<List<Item>> {
        val data: MutableLiveData<List<Item>> = MutableLiveData()
        val list = ArrayList<Item>()
        list.add(Item("Hey"))
        list.add(Item("Hey1"))
        list.add(Item("Hey2"))
        list.add(Item("Hey3"))
        list.add(Item("Hey4"))
        data.value = list
        return data
    }
}