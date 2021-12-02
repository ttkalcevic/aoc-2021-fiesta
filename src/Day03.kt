fun main() {
    val day = 3
    val inputFileName = "Day${day.toString().padStart(2, '0')}"
    val testInputFileName = "Day${day.toString().padStart(2, '0')}_test"

    fun part1(input: List<String>): Int {
        return 0
    }

    fun part2(input: List<String>): Int {
        return 0
    }

    val testInput = readInput(testInputFileName)
    val input = readInput(inputFileName)

    check(part1(testInput) == 0) { "Part1 test failed." }
    println(part1(input))

    check(part2(testInput) == 0) { "Part2 test failed." }
    println(part2(input))
}
