// 6_DateOfBirth.kt

data class Day(val d: Int) {
    init {
        require(d in 1..31) {
            "$d: day of month out of range"
        }
    }
}

data class Month(val m: Int) {
    init {
        require(m in 1..12) {
            "$m: month out of range"
        }
    }
}

data class Year(val y: Int) {
    init {
        require(y in 1901..2022) {
            "$y: year out of range"
        }
    }
}

data class DateOfBirth(val month: Month, val day: Day, val year: Year)

fun main() {
    println(DateOfBirth(Month(7), Day(8), Year(1957)))
    println(DateOfBirth(Month(0), Day(32), Year(1857)))
}
