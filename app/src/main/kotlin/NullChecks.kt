class ClientInfo(var email: String?) {
}

class Client(val personalInfo: ClientInfo = ClientInfo(null)) {
}

class Mailer {
    fun sendMessage(email: String, message: String) {
        println("${email} ${message}")
    }
}

fun sendEmailToClient(client: Client?, message: String?, mailer: Mailer) {
    val email = client?.personalInfo?.email ?: "someone@isgoingtoreadit.com"
    if (message != null) {
        mailer.sendMessage(email, message)
    }
}

fun main(args: Array<String>) {
    val mailer = Mailer()

    sendEmailToClient(Client(), null, mailer)

    sendEmailToClient(Client(ClientInfo("client@xyz.com")), "Message", mailer)

}

fun eval(expr: Expr): Int =
        when (expr) {
            is Num -> expr.value
            is Sum -> eval(expr.left) + eval(expr.right)
            else -> throw IllegalArgumentException("Unknown expression")
        }

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr