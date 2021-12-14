fun main() {
	fun part1(input: List<String>): Int {
		var amount = 0;
		var value = 0;
		var oldValue = 0;
		input.forEach {
			value = it.toInt();
			if (value > oldValue) {
				amount++;
			}
			oldValue = value;
		}
		return amount - 1;
	}

	fun part2(input: List<String>): Int {
		var amount = 0
        var value: Int
        var oldValue = 0;
		var a = 0;
		var b = 0;
        var c: Int;

		input.forEach {
			c = b;
			b = a;
			a = it.toInt();
            if (b == 0 || c == 0) {
            } else {
                value = a + b + c;
                if (value > oldValue) {
                    amount++;
                }
                oldValue = value;
            }
		};

		return amount - 1;
	}

	// test if implementation meets criteria from the description, like:
	val testInput = readInput("Day01_test")
	check(part1(testInput) == 7)
    check(part2(testInput) == 5)

	val input = readInput("Day01")
	println(part1(input))
	println(part2(input))
}
