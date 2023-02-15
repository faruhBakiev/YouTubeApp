package com.excample.youtubeapp.data.models

import com.google.gson.annotations.SerializedName

data class TagSuggestionsItem(@SerializedName("tag")
                              val tag: String = "",
                              @SerializedName("categoryRestricts")
                              val categoryRestricts: List<String>?)