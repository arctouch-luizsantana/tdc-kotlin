
fun main(args: Array<String>) {

    val famousPeople = arrayListOf<String>("Einstein", "Ghandi", "Newton", "MC Bin Laden")

    val forSure = famousPeople is java.util.ArrayList
    println(forSure)

    val pairs = famousPeople.map { Pair(it, it == "MC Bin Laden") }

    pairs.forEach {
        val (name, singer) = it
        val verb = if (singer) "is" else "is not"
        println("${name} ${verb} a singer")
    }


    fun String.isSinger() = this == "MC Bin Laden"

    famousPeople.forEach {
        val verb = if (it.isSinger()) "is" else "is not"
        println("${it} ${verb} a singer")
    }

}