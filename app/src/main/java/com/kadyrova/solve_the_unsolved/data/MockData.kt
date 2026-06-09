package com.kadyrova.solve_the_unsolved.data

val suspects = listOf(
    Suspect(
        id = 1,
        name = "Mark Weber",
        motive = "Money problems",
        alibi = "Was at home",
        clue = "A witness saw him near the crime scene.",
        isCulprit = true
    ),
    Suspect(
        id = 2,
        name = "Anna Keller",
        motive = "Jealousy",
        alibi = "Was at work",
        clue = "Her fingerprints were found on the victim's phone.",
        isCulprit = false
    ),
    Suspect(
        id = 3,
        name = "Sarah Novak",
        motive = "Revenge",
        alibi = "Was with friends",
        clue = "Several threatening messages were found on her phone.",
        isCulprit = false
    )
)