package exercicio

class Cachorro(
    override var nome: String,
    override var idade: Int
) : Animal {

    override fun deslocar() {
        println("\nCorrendo atrás da bolinha.")
    }

    override fun som() {
        println("Au auuu.")
    }
}