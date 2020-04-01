package com.amrit.mvvmwithrepository

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: PostsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(PostsViewModel::class.java)

        viewModel.posts.observe(this, Observer {

            Toast.makeText(this@MainActivity, "Posts are ${it.size} in number", Toast.LENGTH_LONG)
                .show()
        })

    }
}
