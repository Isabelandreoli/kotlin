import `object`.Cliente

/*Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão e pelo menos mais duas opções de
construtores conforme sua percepção, com os atributos: nome (String), endereço (String), telefone (String),
listaDeCompras (mutableListOf<Strings>()).

A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
Ao instanciar a classe cliente na função exercicio.main(), não esquecer de colocar dentro de um bloco try catch.*/

fun main(){

 val cadastro = Cliente(
  "Isabela",
  "Rua Caiubi, 123",
  "99876-5432",

 )
}