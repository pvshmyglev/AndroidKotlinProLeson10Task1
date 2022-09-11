package ru.netology.nmedia

import androidx.lifecycle.LiveData

interface PostRepository {

    val data : LiveData<List<Post>>
    suspend fun getAll()
    suspend fun likeById(id: Long)
    suspend fun shareById(id: Long)
    suspend fun removeById(id: Long)
    suspend fun save(post: Post)
    suspend fun getById(id: Long) : Post

}