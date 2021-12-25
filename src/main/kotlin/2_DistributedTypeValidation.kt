// 2_DistributedTypeValidation.kt
package distributedtypevalidation

data class OneToTen(var ott: Int) {
    override fun toString(): String {
        return "OneToTen($ott)"
    }
}

fun f1(x: OneToTen): OneToTen {
    require(x.ott in 1..10) {
        "${x.ott} out of range"
    }
    return OneToTen(x.ott * 10)
}

fun f2(x: OneToTen): OneToTen {
    require(x.ott in 1..10) {
        "${x.ott} out of range"
    }
    return OneToTen(x.ott + 10)
}

fun main() {
    val a = OneToTen(6)
    println(a)
    println(f1(a))
    println(f2(a))
    val b = OneToTen(11)
    println(f1(b))
    a.ott = 99
    println(f2(a))
}
