package com.kadyrova.solve_the_unsolved.data

data class Suspect(
    val id: Int,
    val name: String,
    val motive: String,
    val alibi: String,
    val clue: String,
    val isCulprit: Boolean
)