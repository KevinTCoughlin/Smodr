package com.kevintcoughlin.smodr.feature.repos

abstract class Repository<out T> {
    abstract fun fetchById(id: String) : T
    abstract fun fetch(start: Int?, end: Int?): List<T>
}
