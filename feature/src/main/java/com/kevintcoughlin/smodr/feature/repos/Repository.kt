package com.kevintcoughlin.smodr.feature.repos

import android.arch.lifecycle.LiveData

interface Repository<T> {
    fun get(id: String) : LiveData<T>
    fun fetch(): LiveData<List<T>>
    fun size(): Int
    fun clear()
    fun remove(id: String)
}
