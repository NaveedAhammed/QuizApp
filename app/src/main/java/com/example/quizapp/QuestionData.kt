package com.example.quizapp

data class QuestionData(
    var id: Int,
    var question: String,
    var option_one: String,
    var option_two: String,
    var option_three: String,
    var option_four: String,
    var corrct_ans: Int
)