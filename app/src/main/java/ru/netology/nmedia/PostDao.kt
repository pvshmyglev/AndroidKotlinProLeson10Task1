package ru.netology.nmedia

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface PostDao {

    @Query("SELECT * FROM posts ORDER BY id DESC")
    fun getAll(): LiveData<List<PostEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPost(post: PostEntity) : Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(posts: List<PostEntity>)

    @Update
    suspend fun updatePost(post: PostEntity)

    @Query("DELETE FROM posts WHERE id = :id")
    suspend fun removeById(id: Long)

    @Query("SELECT * FROM posts WHERE id = :id")
    suspend fun getById(id: Long) : PostEntity

    suspend fun save(post: PostEntity): PostEntity {

        return if (post.id == 0L) {

            val newId = insertPost(post)

            post.copy(id = newId)

        } else {

            updatePost(post)

            post

        }

    }

}