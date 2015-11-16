object Sum {

    fun calculate(dice: Set<Int>) =
            dice.reduce { a, b -> a+ b}

}
