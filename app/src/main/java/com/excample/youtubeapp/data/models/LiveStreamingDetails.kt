package com.excample.youtubeapp.data.models

import com.google.gson.annotations.SerializedName

data class LiveStreamingDetails(@SerializedName("activeLiveChatId")
                                val activeLiveChatId: String = "",
                                @SerializedName("actualStartTime")
                                val actualStartTime: String = "",
                                @SerializedName("scheduledStartTime")
                                val scheduledStartTime: String = "",
                                @SerializedName("scheduledEndTime")
                                val scheduledEndTime: String = "",
                                @SerializedName("actualEndTime")
                                val actualEndTime: String = "",
                                @SerializedName("concurrentViewers")
                                val concurrentViewers: String = "")