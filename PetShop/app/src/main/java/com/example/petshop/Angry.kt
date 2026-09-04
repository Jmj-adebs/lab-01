package com.example.petshop


class Angry(date: String): Mood(date) {
    override fun emotion(): String {
        return "Angry"
    }
}