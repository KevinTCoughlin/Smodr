package com.kevintcoughlin.common.rss

import org.simpleframework.xml.Element

data class Channel (
    @field:Element(name = "title", required = false)
    @param:Element(name = "title", required = false)
    val title: String
//    @field:Element(name = "link", required = false)
//    @param:Element(name = "link", required = false)
//    val link: String
//    @field:Element(name = "pubDate", required = false)
//    @param:Element(name = "pubDate", required = false)
//    val pubDate: String,
//    @field:Element(name = "lastBuildDate", required = false)
//    @param:Element(name = "lastBuildDate", required = false)
//    val lastBuildDate: String,
//    @field:Element(name = "ttl", required = false)
//    @param:Element(name = "ttl", required = false)
//    val ttl: String,
//    @field:Element(name = "language", required = false)
//    @param:Element(name = "language", required = false)
//    val language: String,
//    @field:Element(name = "copyright", required = false)
//    @param:Element(name = "copyright", required = false)
//    val copyright: String,
//    @field:Element(name = "webmaster", required = false)
//    @param:Element(name = "webmaster", required = false)
//    val webmaster: String,
//    @field:Element(name = "description", required = false)
//    @param:Element(name = "description", required = false)
//    val description: String
)