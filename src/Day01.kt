fun main() {
    fun part1(input: List<Int>): Int {
        return input.countIncreases()
    }

    fun part2(input: List<Int>): Int {
        return input.countIncreases(3)
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test").map { it.toInt() }
    check(part1(testInput) == 7) { "Part1 test failed." }
    check(part2(testInput) == 5) { "Part2 test failed." }

    val input = readInput("Day01").map { it.toInt() }
    println(part1(input))
    println(part2(input))
}
