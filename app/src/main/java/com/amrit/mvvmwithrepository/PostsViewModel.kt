package com.amrit.mvvmwithrepository

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class PostsViewModel : ViewModel() {
    var posts: LiveData<List<Post>> = PostRepository().getPosts()
}