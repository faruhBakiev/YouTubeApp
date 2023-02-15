package com.excample.youtubeapp.data.models

import com.google.gson.annotations.SerializedName

data class Thumbnails(
    @SerializedName("standard")
    val standard: Standard
)