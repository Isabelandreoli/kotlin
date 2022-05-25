import `object`.Cliente

/*Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão e pelo menos mais duas opções de
construtores conforme sua percepção, com os atributos: nome (String), endereço (String), telefone (String),
listaDeCompras (mutableListOf<Strings>()).

A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
Ao instanciar a classe cliente na função exercicio.main(), não esquecer de colocar dentro de um bloco try catch.*/

fun main(){

    while (true){

     print("Digite o seu nome: ")
     val nome = readln()

     print("Digite o endereço: ")
     val endereco = readln()

     print("Digite o telefone: ")
     val telefone = readln()

     println("Informe o dia para entrega: ")
     val dia = readln().toInt()

     println("Informe a forma de pagamento: "+
            "\n1.Dinheiro  -  2.Crédito  -  3.Débito")
     val pag = readln().toInt()

     try {
         val cliente = Cliente(nome, endereco, telefone)

         while (true){
          println("DISK ENTREGA")
          println("1 - Adicionar produtos"+
                  "2 - Remover produtos" +
                  "3 - Listar compras"+
                  "4 - Conferir seus dados de pagamento"+
                  "5 - Sair\n")

          when(readln().toInt()){
           1 -> {
            println("Digite um produto para adicionar a lista de compras: ")
            val compra = readln()
            cliente.comprar(compra)
           }
           2 -> {
            println("Digite um produto para remover da lista de compras: ")
            val compra = readln()
            cliente.excluir(compra)
           }
           3 -> {
            cliente.listar()
           }
           4 ->
            cliente.dados(dia, pag)
           5 -> break

           else -> println("Valor inválido")
          }
         }
      break
     }catch (e: Exception){
      println(e.message)
     }
    }
}