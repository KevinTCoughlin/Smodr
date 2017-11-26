package com.kevintcoughlin.smodr.feature.models

import org.simpleframework.xml.Element

data class Channel (
    @field:Element(name = "title", required = false)
    @param:Element(name = "title", required = false)
    val title: String
)