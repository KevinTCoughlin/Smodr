package com.kevintcoughlin.smodr.feature.repos

interface Repository<out T> {
    fun get(id: String) : T
    fun fetch(): List<T>
    fun size(): Int
    fun clear()
    fun remove(id: String)
}
