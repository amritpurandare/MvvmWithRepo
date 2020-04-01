package com.amrit.mvvmwithrepository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PostRepository {

    fun getPosts(): LiveData<List<Post>> {

        val data = MutableLiveData<List<Post>>()

        val postApi = RetrofitService.buildService(PostApi::class.java)

        val postsCall = postApi.getPosts()

        postsCall.enqueue(object : Callback<List<Post>> {

            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                data.value = response.body()
            }

            override fun onFailure(call: Call<List<Post>>, t: Throwable) {

            }
        })

        return data
    }
}