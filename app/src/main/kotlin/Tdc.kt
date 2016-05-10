fun welcome(name: String = "Developer", event: String = "TDC")
        = "Hello ${name}, welcome to ${event}!"

fun main(args: Array<String>) {
    var greeting = welcome("André")
    println(greeting)

    greeting = welcome(name = "Luiz", event = "I/O")
    println(greeting)

    greeting = welcome(event = "I/O")
    println(greeting)

    greeting = welcome()
    println(greeting)
}