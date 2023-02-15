package com.excample.youtubeapp.data.repositories

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.excample.youtubeapp.base.BaseRepository
import com.excample.youtubeapp.data.remote.apiservices.VideoPopularApiService
import com.excample.youtubeapp.data.remote.pagingsources.VideoPopularPagingSources
import javax.inject.Inject

class VideoPopularRepository @Inject constructor(private val service: VideoPopularApiService) :
    BaseRepository() {

    fun fetchVideosPopular(regionCode: String, chart: String, part: String) =
        Pager(PagingConfig(pageSize = 10, enablePlaceholders = false)) {
            VideoPopularPagingSources(service, regionCode, chart, part)
        }.liveData
}
