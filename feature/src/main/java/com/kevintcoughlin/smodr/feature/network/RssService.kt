package com.kevintcoughlin.smodr.feature.network

import com.kevintcoughlin.common.rss.Rss
import io.reactivex.Observable
import org.simpleframework.xml.convert.AnnotationStrategy
import org.simpleframework.xml.core.Persister
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.simplexml.SimpleXmlConverterFactory
import retrofit2.http.GET
import retrofit2.http.Url

interface RssService {
    @GET
    fun fetchFeed(@Url url: String): Observable<Rss>

    companion object Factory {
        fun create(): RssService {
            val retrofit = Retrofit.Builder()
                    .baseUrl("https://feeds.feedburner.com/")
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(SimpleXmlConverterFactory.createNonStrict(Persister(AnnotationStrategy())))
                    .build()
            return retrofit.create(RssService::class.java)
        }
    }
}