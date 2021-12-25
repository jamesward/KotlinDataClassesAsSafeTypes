// 3_ConstructorTypeValidation.kt
package constructortypevalidation

data class OneToTen(var ott: Int) {
    init {
        require(ott in 1..10) {
            "$ott out of range"
        }
    }
    override fun toString() = "OneToTen($ott)"
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
    a.ott = 99 // Can still mutate to an invalid OneToTen
    println("$a: Didn't detect that it's out of range!")
    // So, still need to validate OneToTen inside functions
    println(f2(a))
}
