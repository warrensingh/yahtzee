object UpperSection {

    fun evaluate(dice: List<Int>): List<Int> {

        val ones = dice.filter { it == 1}.size * 1
        val twos = dice.filter { it == 2}.size * 2
        val threes = dice.filter { it == 3}.size * 3
        val fours = dice.filter { it == 4}.size * 4
        val fives = dice.filter { it == 5}.size * 5
        val sixes = dice.filter { it == 6}.size * 6

        return listOf(ones, twos, threes, fours, fives, sixes)

    }

}
