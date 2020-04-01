package com.amrit.mvvmwithrepository.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.amrit.mvvmwithrepository.model.Post
import com.amrit.mvvmwithrepository.repo.PostRepository

class PostsViewModel : ViewModel() {
    var posts: LiveData<List<Post>> = PostRepository()
        .getPosts()
}