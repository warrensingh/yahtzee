data class Scores(
    val ones: Int?,
    val twos: Int?,
    val threes: Int?,
    val fours: Int?,
    val fives: Int?,
    val sixes: Int?,

    val sum: Int = 0,
    val bonus: Int = 0,

    val threeOfAKind: Int?,
    val fourOfAKind: Int?,
    val fullHouse: Int?,
    val smallStraight: Int?,
    val largeStraight: Int?,
    val chance: Int?,
    val yahtzee: Int?,

    val total: Int = 0
)
