fun main(args: Array<String>) {

    val dice = RollDice.apply(5)

    dice.forEach { print("$it ") }
    println()

    val upperSection = UpperSection(dice)

    println("Ones: " + upperSection.ones)
    println("Twos: " + upperSection.twos)
    println("Threes: " + upperSection.threes)
    println("Fours: " + upperSection.fours)
    println("Fives: " + upperSection.fives)
    println("Sixes: " + upperSection.sixes)

    val lowerSection = LowerSection(dice)

    println("Three of a kind: " + lowerSection.threeOfAKind)
    println("Four of a kind: " + lowerSection.fourOfAKind)
    println("Full House: " + lowerSection.fullHouse)
    println("Small straight: " + lowerSection.smallStraight)
    println("Large straight: " + lowerSection.largeStraight)
    println("Chance: " + lowerSection.chance)
    println("Yahtzee: " + lowerSection.yahtzee)

}
