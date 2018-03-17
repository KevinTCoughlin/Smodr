package com.kevintcoughlin.common.rss

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(strict = false, name = "rss")
data class Rss(
    @field:Element(name = "channel")
    @param:Element(name = "channel")
    val channel: Channel
)