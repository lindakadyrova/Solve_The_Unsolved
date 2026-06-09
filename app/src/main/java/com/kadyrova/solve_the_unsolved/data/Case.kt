package com.kadyrova.solve_the_unsolved.data

data class Case(
    val id: Int,
    val title: String,
    val description: String,
    val suspects: List<Suspect>
)