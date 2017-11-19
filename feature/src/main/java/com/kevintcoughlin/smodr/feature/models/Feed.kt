package com.kevintcoughlin.smodr.feature.models

/**
 * Created by excel on 11/18/2017.
 */
data class Feed (
        val title: String,
        val link: String,
        val pubDate: String,
        val lastBuildDate: String,
        val ttl: Int,
        val language: String,
        val copyright: String,
        val webMaster: String,
        val description: String,
        val itunes: ItunesMeta,
        val image: Image,
        val items: Item
)