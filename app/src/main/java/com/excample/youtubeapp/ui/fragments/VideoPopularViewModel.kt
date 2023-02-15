package com.excample.youtubeapp.ui.fragments

import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.excample.youtubeapp.base.BaseViewModel
import com.excample.youtubeapp.data.repositories.VideoPopularRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class VideoPopularViewModel @Inject constructor(private val repository: VideoPopularRepository): BaseViewModel(){

    fun fetchVideosPopular(regionCode: String, chart: String, part: String) =
        repository.fetchVideosPopular(regionCode, chart, part).cachedIn(viewModelScope)
}