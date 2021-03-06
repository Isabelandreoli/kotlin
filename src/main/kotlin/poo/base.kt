import classe.Conta

fun main(){
    /*val cliente = classe.Cadastro(
    "Isabela",
    "99876-5432",
        "email",
        "16/02/1999"
    )

    println("Nome: ${cliente.nome}")

    cliente.compra()
    val produto = readln().toInt()
    val quantidade = readln().toInt()
    var valor = 0
    when(produto){
        1 -> valor = 5
        2 -> valor = 10
        3 -> valor = 15
    }
    val preço = valor * quantidade

    cliente.pagamento(preço)
    val pagamento = readln().toInt()

    println("Obrigade e volte sempre!")*/

    val conta = Conta(
        "Isabela",
        "123.234.345-00",
        1000,
        100123,
        800.00,
        false
    )
    println("BANCOIN")
    println("Bem-vinde ${conta.titular}")
    println("1 - Saldo"+
    "\n2 - Saque"+
    "\n3 - Depósitos"+
    "\n4 - Transferência"+
    "\n5 - Empréstimo")
    val menu = readln().toInt()

    if (menu == 1) {
        conta.saldo()
    }else if (menu == 2){
        println("Valor disponível para saque: R$${conta.saldo}")
        print("Insira o valor do saque: R$")
        val valor = readln().toDouble()
        conta.saque(valor)
    }else if (menu == 3){
        println("Saldo: R$${conta.saldo}")
        print("Insira o valor do depósito: R$")
        val valor = readln().toDouble()
        conta.deposito(valor)
    }else if (menu == 4){
        println("Saldo: R$${conta.saldo}")
        print("Insira o valor da transferênia: R$")
        val valor = readln().toDouble()
        conta.transferir(valor)

        println("Titular: ")
        val amigo = readln()
        println("Transferência para $amigo realizada.")
    }else if (menu == 5) {
        if (conta.emprestimo) {
            println("Insira o valor do empréstimo: R$")
            var valor = readln().toDouble()
            println("Empréstimo no valor de R$$valor APROVADO.")
        } else {
            println("Insira o valor do empréstimo: R$")
            var valor = readln().toDouble()
            println(
                "Empréstimo no valor de R$$valor NEGADO." +
                        "\nEntre em contato com o seu gerente.")
        }
    }else{
        println("Tente uma opção válida.")
    }
}