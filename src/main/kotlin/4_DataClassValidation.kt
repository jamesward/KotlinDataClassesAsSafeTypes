// 4_DataClassValidation.kt

data class OneToTen(val ott: Int) {
    init {
        require(ott in 1..10) {
            "$ott out of range"
        }
    }
}

fun f1(x: OneToTen) = OneToTen(x.ott * 10)

fun f2(x: OneToTen) = OneToTen(x.ott + 10)

fun main() {
    val a = OneToTen(6)
    println(a)
    println(f1(a))
    println(f2(a))
    val b = OneToTen(11)
    println(f1(b))
    // a.ott = 99;  // Can 't modify ott
}
