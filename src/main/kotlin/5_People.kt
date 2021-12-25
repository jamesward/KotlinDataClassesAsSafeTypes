// 5_People.kt

data class FullName(val name: String) {
    init {
        println("FullName checking $name")
        require(name.split(" ").size > 1) {
            "$name needs at least first and last names"
        }
    }
}

data class BirthDate(val dob: String) {
    init {
        println("BirthDate checking $dob")
        require(true) {
            "Add code to validate BirthDate"
        }
    }
}

data class EmailAddress(val email: String) {
    init {
        println("EmailAddress checking $email")
        require(true) {
            "Add code to validate EmailAddress"
        }
    }
}

data class Person(val name: FullName, val dob: BirthDate, val email: EmailAddress) {
    init {
        println("Person checking fields $name, $dob, $email")
        require(true) {
            "Add code to validate Person"
        }
    }
}

fun main() {
    val person = Person(
        FullName("Bruce Eckel"),
        BirthDate("7/8/1957"),
        EmailAddress("mindviewinc@gmail.com")
    )
}
