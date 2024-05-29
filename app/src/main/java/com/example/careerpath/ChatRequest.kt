package com.example.careerpath



data class ChatRequest (val messages: List<Message>,
                        val model : String)