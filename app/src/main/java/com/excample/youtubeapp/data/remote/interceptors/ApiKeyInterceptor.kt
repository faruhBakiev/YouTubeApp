package com.excample.youtubeapp.data.remote.interceptors

import okhttp3.Interceptor
import okhttp3.Response

class ApiKeyInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        val url = request.url.newBuilder().addQueryParameter("key","AIzaSyC34kk52UfPD1jr2rWzK8m8m_4w7FkumL0").build()
        request = request.newBuilder().url(url).build()
        return chain.proceed(request)
    }
}