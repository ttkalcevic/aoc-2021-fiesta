fun main() {
    val day = 2
    val inputFileName = "Day${day.toString().padStart(2, '0')}"
    val testInputFileName = "Day${day.toString().padStart(2, '0')}_test"

    data class Command(private val command: String) {
        private val commandSplit = command.split(" ")
        val direction: String = commandSplit[0]
        val value: Int = commandSplit[1].toInt()
    }

    fun part1(input: List<Command>): Int {
        var forward = 0
        var depth = 0

        input.forEach { command ->
            when (command.direction) {
                "forward" -> forward += command.value
                "up" -> depth -= command.value
                "down" -> depth += command.value
                else -> Unit
            }
        }

        return forward * depth
    }

    fun part2(input: List<Command>): Int {
        var forward = 0
        var depth = 0
        var aim = 0

        input.forEach { command ->
            when (command.direction) {
                "forward" -> {
                    forward += command.value
                    depth += (aim * command.value)
                }
                "up" -> aim -= command.value
                "down" -> aim += command.value
                else -> Unit
            }
        }

        return forward * depth
    }

    val testInput = readInput(testInputFileName).map { Command(it) }
    val input = readInput(inputFileName).map { Command(it) }

    check(part1(testInput) == 150) { "Part1 test failed." }
    println(part1(input))

    check(part2(testInput) == 900) { "Part2 test failed." }
    println(part2(input))
}


