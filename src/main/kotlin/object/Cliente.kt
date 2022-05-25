package `object`

class Cliente(
    private val nome: String, private val endereco: String,
    private val telefone: String
) {
    private var dia = 0
    private var produto = ""

    constructor(nome: String, endereco: String, telefone: String, dia: Int):
            this(nome, endereco, telefone){
        this.dia = dia
    }

    constructor(nome: String, endereco: String, telefone: String, dia: Int, produto: String):
            this(nome, endereco, telefone, dia) {
        this.produto = produto
    }
}

