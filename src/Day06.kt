fun main() {

	data class Lanternfish(var timer: Int)

	fun parseInput(input: List<String>): List<Lanternfish> {
		val lanternfishes = input.get(0).split(",").map { lanternfish ->
				Lanternfish( lanternfish.toInt() )
		}
		return lanternfishes
	}

	fun age(list: List<Lanternfish>, age: Int): Int {
		for (i in 1..age) {
			list.forEach {
				it.timer--
				if (it.timer == 0) {
					list.plus(Lanternfish(8))
				}
			}

		}
		return list.size
	}

	fun part1(input: List<String>): Int {
		val parsedInput = parseInput(input)
		return age(parsedInput, 80)
	}

	fun part2(input: List<String>): Int {
		return input.size
	}

	// test if implementation meets criteria from the description, like:
	val testInput = readInput("Day06_test")
	val input = readInput("Day06")

	//println(part1(testInput))
	//check(part1(testInput) == 5934)
	//println(part1(input))

	//check(part2(testInput) == 12)
	//println(part2(input))
}
