package com.kevintcoughlin.smodr.feature.repos

import android.arch.lifecycle.LiveData

abstract class Repository<T> {
    abstract fun get(id: String) : LiveData<T>
    abstract fun fetch(start: Int?, end: Int?): LiveData<List<T>>
}
