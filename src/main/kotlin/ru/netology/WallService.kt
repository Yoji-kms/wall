package ru.netology

object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post{
        val newPost = post.copy(id = posts.lastIndex + 1)
        posts.plus(newPost)
        return newPost
    }

    fun update(post: Post): Boolean{
        for ((index, updatingPost) in posts.withIndex()){
            if (index == post.id) {
                posts[index] = post.copy(ownerId = updatingPost.ownerId,
                    date = updatingPost.date)
                return true
            }
        }
        return false
    }
}