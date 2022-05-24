package classe

class Cadastro(
    var nome: String, var telefone: String) {

    var email = ""
    var aniversario = ""
    var descontoVip = false

    constructor(nome: String, telefone: String, email: String, aniversario: String)
            :this(nome, telefone){
        this.email = email
        this.aniversario = aniversario
    }

    fun compra() {
        println("Escolha o produto abaixo e informe a quantidade:"+
                "\n1 - Suco Natural   2 - Vitamina   3 - Smoothie")
    }
    fun pagamento(valor:Int) {
        println("A sua compra deu R$$valor"+
                "\nEscolha uma forma de pagamento:"+
                "\n1 - Dinheiro   2 - Débito   3 - Crédito")
    }
}