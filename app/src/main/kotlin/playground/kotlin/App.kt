package playground.kotlin

class App(private val greetee: String = "World") {
    val greeting: String
        get() {
            return "Hello $greetee!"
        }
}

fun main() {
    println(App().greeting)
}
