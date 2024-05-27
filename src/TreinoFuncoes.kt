class Pessoa {
    fun iniciar() {
        println("iniciado")
    }

    fun nome(primeiroNome: String, sobrenome: String) {
        println(primeiroNome)
        println(sobrenome)

    }
    fun idade (idade : Int) {
        println(idade)

    }
    fun altura(altura: Float) : String{
        val mensagemAltura = "Sua altura é $altura"
        return "seila"

    }
    fun isPessoa () : Boolean {
        return true

    }

}

fun main() {
    Pessoa().iniciar()
    Pessoa().idade(15)
    Pessoa().nome("Ryan", "Silva")
    println(Pessoa().altura(180f))
    println(Pessoa().isPessoa())

}