package com.example.composepaging

interface Paginator<Key,Item> {
    suspend fun loadNextItems()
    fun reset()
}