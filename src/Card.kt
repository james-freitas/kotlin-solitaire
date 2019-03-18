const val clubs = "Clubs"
const val diamonds = "Diamonds"
const val hearts = "Hearts"
const val spades = "Spades"
val redSuits = arrayOf(diamonds, hearts)
val blackSuits = arrayOf(clubs, spades)

class Card(val value: Int, val suit: String, var faceUp: Boolean = false) {

}