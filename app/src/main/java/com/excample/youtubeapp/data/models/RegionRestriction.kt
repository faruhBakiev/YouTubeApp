package com.excample.youtubeapp.data.models

import com.google.gson.annotations.SerializedName

data class RegionRestriction(@SerializedName("blocked")
                             val blocked: List<String>?,
                             @SerializedName("allowed")
                             val allowed: List<String>?)