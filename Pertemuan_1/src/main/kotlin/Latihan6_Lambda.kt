fun main() {
    val greet1 = { name: String -> greeting1(name) } // Lambda expression
    greet1("Kotlin")
}

fun greeting1(name: String) {
    println("Halo $name!")
}