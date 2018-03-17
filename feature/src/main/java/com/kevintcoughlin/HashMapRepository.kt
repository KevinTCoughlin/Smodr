package com.kevintcoughlin

import com.kevintcoughlin.smodr.feature.repos.Repository

abstract class HashMapRepository<T>: Repository<T> {
    private val feeds: HashMap<String, T>

    constructor() {
        feeds = HashMap(0)
    }
    constructor(obj: T) {
        if (obj == null)
            throw Exception()

        feeds = HashMap(1)
        feeds[obj.hashCode().toString()] = obj
    }

    constructor(objs: Array<T>) {
        feeds = HashMap(objs.size)

        for (o in objs) {
            if (o != null) {
                feeds[o.hashCode().toString()] = o
            }
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

    override fun get(id: String): T {
        return feeds[id] ?: throw Exception("Feed not found.")
    }

    override fun put(obj: T) {
        if (obj != null) {
            feeds[obj.hashCode().toString()] = obj
        }
    }

    override fun putAll(obj: Array<out T>) {
        for (r in obj) {
            put(r)
        }
    }

    override fun fetch(): List<T> {
        return feeds.values.toList()
    }

    protected open fun getKey(obj: T): String {
        if (obj == null)
            throw NullPointerException()

        return obj.hashCode().toString()
    }
}
