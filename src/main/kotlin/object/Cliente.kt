package `object`

class Cliente(
    private val nome: String, private val endereco: String,
    private val telefone: String
) {
    private var dia = 0
    private var pagamento = ""

    private val listaCompras = mutableListOf<String>()

    constructor(nome: String, endereco: String, telefone: String, dia: Int):
            this(nome, endereco, telefone){
        this.dia = dia
    }

    constructor(nome: String, endereco: String, telefone: String, dia: Int, pagamento: String):
            this(nome, endereco, telefone, dia) {
        this.pagamento = pagamento
    }

    fun comprar(compra: String){
        if (compra != ""){
            listaCompras.add(compra)
            println("$compra foi adicionado a sua lista.")
        }else{
            println("Digite um produto válido.")
        }
    }
    fun excluir(compra: String){
        if (listaCompras.contains(compra)){
            listaCompras.remove(compra)
            println("$compra foi removido da sua lista.")
        }else{
            println("O produto não está na lista.")
        }
    }
    fun listar(){
        println("SUA LISTA:")
        listaCompras.forEach{
            println(it)
        }
    }
    fun dados(entrega: Int, pag: Int){
        println("Sua entrega será realizada todo o dia $entrega")
        println("Forma de pagamento: $pag")
    }
}

