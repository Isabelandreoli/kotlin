package exercicio

class Cavalo(
    override var nome: String,
    override var idade: Int
) : Animal {

    override fun deslocar() {
        println("\nCorrendo pelo campo.")
    }

    override fun som() {
        println("Relincho.")
    }
}