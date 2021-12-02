fun main() {
    val day = 1
    val inputFileName = "Day${day.toString().padStart(2, '0')}"
    val testInputFileName = "Day${day.toString().padStart(2, '0')}_test"

    fun part1(input: List<Int>): Int {
        return input.countIncreases()
    }

    fun part2(input: List<Int>): Int {
        return input.countIncreases(3)
    }

    val testInput = readInput(testInputFileName).map { it.toInt() }
    val input = readInput(inputFileName).map { it.toInt() }

    check(part1(testInput) == 7) { "Part1 test failed." }
    println(part1(input))

    check(part2(testInput) == 5) { "Part2 test failed." }
    println(part2(input))
}
