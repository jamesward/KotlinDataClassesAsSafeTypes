// 1_CheckedInt.kt

fun f1(oneToTen: Int): Int {
    require(oneToTen in 1..10) {
        "$oneToTen out of range"
    }
    return oneToTen * 10
}

fun f2(oneToTen: Int): Int {
    require(oneToTen in 1..10) {
        "$oneToTen out of range"
    }
    return oneToTen + 10
}

fun main() {
    var a = 6
    println(a)
    println(f1(a))
    println(f2(a))
    val b = 11
    println(f1(b))
    a = 99
    println(f2(a))
}
