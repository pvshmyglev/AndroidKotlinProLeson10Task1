package ru.netology.nmedia

internal fun List<PostEntity>.toPost() = map(PostEntity::toPost)
internal fun List<Post>.toPostEntity() = map(Post::toPostEntity)

internal fun PostEntity.toPost() = Post (

    id = id,
    author = author,
    authorAvatar = authorAvatar,
    content = content,
    video = video,
    publishedDate = publishedDate,
    likeByMe = likeByMe,
    countLikes = countLikes,
    countShare = countShare,
    countVisibility = countVisibility,

)

internal fun Post.toPostEntity() = PostEntity (

    id = id,
    author = author,
    authorAvatar = authorAvatar,
    content = content,
    video = video,
    publishedDate = publishedDate,
    likeByMe = likeByMe,
    countLikes = countLikes,
    countShare = countShare,
    countVisibility = countVisibility,

)