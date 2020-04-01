package com.amrit.mvvmwithrepository.network

import com.amrit.mvvmwithrepository.model.Post
import retrofit2.Call
import retrofit2.http.GET

interface PostApi {

    @GET("/posts")
    fun getPosts(): Call<List<Post>>
}