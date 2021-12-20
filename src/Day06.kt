fun main() {

	fun LongArray.rotateLeftInPlace() {
		val leftMost = first()
		this.copyInto(this, startIndex = 1)
		this[this.lastIndex] = leftMost
	}

	fun simulateDays(fishiesPerDay: LongArray, days: Int): Long {
		repeat(days) {
			fishiesPerDay.rotateLeftInPlace()
			fishiesPerDay[6] += fishiesPerDay[8]
		}
		return fishiesPerDay.sum()
	}

	fun parseInput(input: String): LongArray =
		LongArray(9).apply {
			input.split(",").map { it.toInt() }.forEach { this[it] += 1L }
		}

	fun part1(input: List<String>): Long {
		val parsedInput = parseInput(input[0])
		return simulateDays(parsedInput, 80)
	}

	fun part2(input: List<String>): Long {
		val parsedInput = parseInput(input[0])
		return simulateDays(parsedInput, 256)
	}

	// test if implementation meets criteria from the description, like:
	val testInput = readInput("Day06_test")
	val input = readInput("Day06")

	check(part1(testInput) == 5934L)
	println(part1(input))

	check(part2(testInput) == 26984457539)
	println(part2(input))
}
