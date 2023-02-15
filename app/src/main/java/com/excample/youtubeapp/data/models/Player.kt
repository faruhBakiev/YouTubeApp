package com.excample.youtubeapp.data.models

import com.google.gson.annotations.SerializedName

data class Player(@SerializedName("embedHeight")
                  val embedHeight: String = "",
                  @SerializedName("embedWidth")
                  val embedWidth: String = "",
                  @SerializedName("embedHtml")
                  val embedHtml: String = "")