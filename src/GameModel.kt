class GameModel {
    val deck = Deck()
    val wastePile: MutableList<Card> = mutableListOf()
    val foundationPiles: Array<FoundationPile> = arrayOf(FoundationPile("Clubs")
            , FoundationPile("Diamonds"), FoundationPile("Hearts"), FoundationPile("Spades"))
    val tableauPiles = Array(7) { TableauPile() }
}