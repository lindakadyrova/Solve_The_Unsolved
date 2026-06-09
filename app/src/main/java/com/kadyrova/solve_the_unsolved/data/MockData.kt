package com.kadyrova.solve_the_unsolved.data

val case1Suspects = listOf(
    Suspect(
        1, "Mark Weber",
        "Money problems",
        "Was at home",
        "Seen near the crime scene.",
        true),
    Suspect(
        2,
        "Anna Keller",
        "Jealousy",
        "Was at work",
        "Fingerprints on the phone.",
        false),
    Suspect(
        3,
        "Sarah Novak",
        "Revenge",
        "Was with friends",
        "Argued with the victim.",
        false)
)

val case2Suspects = listOf(
    Suspect(
        1,
        "David Brown",
        "Needed money",
        "Was in the café",
        "Had access to the museum.",
        true),
    Suspect(
        2,
        "Emma White",
        "Wanted fame",
        "Was at home",
        "Knew the security code.",
        false),
    Suspect(
        3,
        "Lucas Green",
        "Angry at the museum",
        "Was outside",
        "His jacket was found nearby.",
        false
    )
)

val case3Suspects = listOf(
    Suspect(
        1,
        "John Black",
        "Inheritance",
        "Was sleeping",
        "His fingerprints were on the glass.",
        false
    ),
    Suspect(
        2,
        "Olivia Stone",
        "Revenge",
        "Was in the garden",
        "Her ring was found in the room.",
        true
    ),
    Suspect(
        3,
        "Peter Miller",
        "Business conflict",
        "Was on a call",
        "He deleted messages.",
        false)
)
val cases = listOf(
    Case(
        1,
        "The Missing Necklace",
        "A valuable necklace disappeared.", case1Suspects),
    Case(
        2,
        "Museum Theft",
        "A famous painting was stolen.", case2Suspects),
    Case(
        3,
        "Murder at the Mansion",
        "A businessman was found dead.", case3Suspects)
)