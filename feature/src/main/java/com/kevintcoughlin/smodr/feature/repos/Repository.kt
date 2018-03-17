package com.kevintcoughlin.smodr.feature.repos

interface Repository<in T> {
    fun get(id: String): T //@TODO: Fix type
    fun put(obj: T)
    fun putAll(obj: Array<out T>)
    fun fetch(): List<T>
    fun size(): Int
    fun clear()
    fun remove(id: String)
}
