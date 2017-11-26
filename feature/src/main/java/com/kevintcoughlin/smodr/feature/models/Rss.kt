package com.kevintcoughlin.smodr.feature.models

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(strict = false, name = "rss")
data class Rss(
    @field:Element(name = "channel", required = false)
    @param:Element(name = "channel", required = false)
    val channel: Channel
//    @Attribute(name = "xmlns:itunes", required = true)
//    val itunes: String,
//    @Attribute(name = "xmlns:atom", required = true)
//    val atom: String,
//    @Attribute(name = "xmlns:media", required = true)
//    val media: String,
//    @Attribute(name = "xmlns:feedburner", required = true)
//    val feedburner: String
//        @Attribute(name = "title", required = true)
//        val title: String
//        val link: String,
//        val pubDate: String,
//        val lastBuildDate: String,
//        val ttl: Int,
//        val language: String,
//        val copyright: String,
//        val webMaster: String,
//        val description: String,
//        val itunes: ItunesMeta,
//        val image: Image,
//        val items: Item
)