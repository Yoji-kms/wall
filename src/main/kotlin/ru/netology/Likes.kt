package ru.netology

data class Likes(
    var count: Int,
    val userLikes: Boolean,
    val canLike: Boolean,
    val canPublish: Boolean
)