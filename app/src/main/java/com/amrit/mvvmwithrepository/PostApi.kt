package com.amrit.mvvmwithrepository

import androidx.lifecycle.LiveData
import retrofit2.Call
import retrofit2.http.GET

interface PostApi {

    @GET("/posts")
    fun getPosts(): Call<List<Post>>
}