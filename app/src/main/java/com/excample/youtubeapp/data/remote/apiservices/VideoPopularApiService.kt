package com.excample.youtubeapp.data.remote.apiservices

import com.excample.youtubeapp.data.models.PopularVideo
import com.excample.youtubeapp.data.models.VideoResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface VideoPopularApiService {

    @GET("videos")
    suspend fun fetchPopularVideos(
        @Query("regionCode") regionCode: String,
        @Query("chart") chart: String,
        @Query("part") part: String,
        @Query("pageToken") nextPageToken: String
    ): VideoResponse<PopularVideo>
}