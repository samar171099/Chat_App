package com.example.chatapp.model

data class ChatChannel(val userIds: MutableList<String>) {

    constructor() : this(mutableListOf())
}