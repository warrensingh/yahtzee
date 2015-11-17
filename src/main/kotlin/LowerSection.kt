class LowerSection(private val dice: List<Int>) {

    private val sumOfAllDice = Sum.calculate(dice)

    private val counts =
        setOf(1, 2, 3, 4, 5, 6)
            .map { number ->

                dice.filter { it == number }.size

            }

    val threeOfAKind =
        if (counts.contains(3))
            sumOfAllDice
        else
            0

    val fourOfAKind =
        if (counts.contains(4))
            sumOfAllDice
        else
            0

    val fullHouse =
        if (counts.contains(3) && counts.contains(2))
            25
        else
            0

    val smallStraight =
        if (
        dice.containsAll(setOf(1, 2, 3, 4)) ||
            dice.containsAll(setOf(2, 3, 4, 5)) ||
            dice.containsAll(setOf(3, 4, 5, 6))
        )
            30
        else
            0

    val largeStraight =
        if (
        dice.containsAll(setOf(1, 2, 3, 4, 5)) ||
            dice.containsAll(setOf(2, 3, 4, 5, 6))
        )
            40
        else
            0

    val chance = sumOfAllDice

    val yahtzee =
        if (dice.distinct().size == 1)
            50
        else
            0


}