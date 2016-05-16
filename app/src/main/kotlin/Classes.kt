import kotlin.properties.Delegates

interface Funk {
    var views: Long

    fun funk() {
        views++
        println("ta tranquilo ta favorável")
    }
}

open class Person constructor(name: String) {
    open fun walk() {
        println("walking as a normal person")
    }
}

class Singer(name: String, isSinger: Boolean, override var views: Long) : Person(name), Funk


interface Moveable {
    fun move() { print("move") }
}

interface Walkable {
    fun move() { walk() }
    fun walk() { print("walk") }
}

class Animal : Moveable {
    override fun move() { print("animal is moving") }
}

class Computer {

}

class Human : Moveable, Walkable {

    override fun move() {
        super<Walkable>.move()
    }
}

class Panelist {
    val presentation : String by lazy {
        "Kotlin!!!!"
    }

    var numberOfQuestions : Int by Delegates.observable(0) {
        prop, old, new ->
        println("It was ${old} not it is ${new}")
    }
}