val lyrics = """
    |Jamais a natureza
    |Reuniu tanta beleza
    |Jamais algum poeta
    |Teve tanto pra cantar!
    """.trimMargin()

val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"
var datePattern = """\d{2} ${month} \d{4}"""

fun main(args: Array<String>) {
    println(lyrics)

    val today = "13 MAY 2016".matches(Regex(datePattern))
    println(today)
}