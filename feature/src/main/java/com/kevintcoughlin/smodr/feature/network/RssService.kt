package com.kevintcoughlin.smodr.feature.network

import com.kevintcoughlin.smodr.feature.models.Feed
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

/**
 * Created by excel on 11/18/2017.
 */
interface RssService {
    @GET
    fun fetchFeed(@Url url: String): Call<Feed>
}