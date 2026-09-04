package com.example.petshop

class Happy(date: String): Mood(date) {
    override fun emotion(): String {
        return "Happy"
    }
}