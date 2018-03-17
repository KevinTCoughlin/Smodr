package com.kevintcoughlin.common.media

import java.util.*

class PlaybackQueue {

    interface IPlayback {
        fun duration(): Int
    }

    val queue: LinkedList<IPlayback>

    constructor () {
        queue = LinkedList()
    }

    constructor (elements: Collection<IPlayback>) {
        queue = LinkedList(elements)
    }

    fun next(): IPlayback {
        queue.remove()
        return queue.first
    }

    fun enqueue(element: IPlayback) {
        queue.add(element)
    }

    fun enqueueAll(elements: Collection<IPlayback>): Boolean {
        return queue.addAll(elements)
    }

    fun size(): Int {
        return queue.size
    }

    fun isEmpty(): Boolean {
        return queue.isEmpty()
    }

    fun current(): IPlayback {
        return queue.first
    }

    fun shuffle() {
        queue.shuffle()
    }

    fun clear() {
        queue.clear()
    }

    fun remove(element: IPlayback): Boolean {
       return queue.remove(element)
    }

    fun removeAll(elements: Collection<IPlayback>): Boolean {
        return queue.removeAll(elements)
    }

    fun totalTime(): Int {
        var total = 0
        queue.forEach {
            total += it.duration()
        }
        return total
    }

    fun swap(idx1: Int, idx2: Int) {
        val temp = queue.removeAt(idx1)
        queue[idx2] = temp
    }

    fun swap(obj1: IPlayback, idx: Int) {
        queue.remove(obj1)
        queue[idx] = obj1
    }

    fun all(): List<IPlayback> {
        return queue
    }
}