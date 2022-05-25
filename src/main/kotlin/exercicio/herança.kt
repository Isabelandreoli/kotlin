package exercicio

fun main(){

    val cachorro = Cachorro("Dug", 3)
    val cavalo = Cavalo("Scootaloo", 8)
    val preguiça = Preguica("Preguicita", 20)

    cachorro.deslocar()
    cachorro.som()

    cavalo.deslocar()
    cavalo.som()

    preguiça.deslocar()
    preguiça.som()

}