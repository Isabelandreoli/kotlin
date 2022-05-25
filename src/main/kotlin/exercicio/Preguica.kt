package exercicio

class Preguica(
    override var nome: String,
    override var idade: Int
) : Animal {

    override fun deslocar() {
        println("\nSubindo em árvores.")
    }

    override fun som() {
        println("...zzz...")
    }
}