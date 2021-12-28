package cards
import cards.Suit.*
import cards.Rank.*

enum class Suit { Clubs, Spades, Hearts, Diamonds }

enum class Rank(val value: Int) {
    Two(2), Three(3), Four(4), Five(5),
    Six(6), Seven(7), Eight(8), Nine(9),
    Ten(10), Jack(11), Queen(12), King(13), Ace(14)
}

sealed interface Card {
    val rank: Rank
    val suit: Suit
}

object Deck {
    enum class Club(override val rank: Rank, override val suit: Suit): Card {
        TwoClubs(Two, Clubs), ThreeClubs(Three, Clubs), FourClubs(Four, Clubs),
        FiveClubs(Five, Clubs), SixClubs(Six, Clubs), SevenClubs(Seven, Clubs),
        EightClubs(Eight, Clubs), NineClubs(Nine, Clubs), TenClubs(Ten, Clubs),
        JackClubs(Jack, Clubs), QueenClubs(Queen, Clubs), KingClubs(King, Clubs),
        AceClubs(Ace, Clubs)
    }
    enum class Spade(override val rank: Rank, override val suit: Suit): Card {
        TwoSpades(Two, Spades), ThreeSpades(Three, Spades), FourSpades(Four, Spades),
        FiveSpades(Five, Spades), SixSpades(Six, Spades), SevenSpades(Seven, Spades),
        EightSpades(Eight, Spades), NineSpades(Nine, Spades), TenSpades(Ten, Spades),
        JackSpades(Jack, Spades), QueenSpades(Queen, Spades), KingSpades(King, Spades),
        AceSpades(Ace, Spades)
    }
    enum class Heart(override val rank: Rank, override val suit: Suit): Card {
        TwoHearts(Two, Hearts), ThreeHearts(Three, Hearts), FourHearts(Four, Hearts),
        FiveHearts(Five, Hearts), SixHearts(Six, Hearts), SevenHearts(Seven, Hearts),
        EightHearts(Eight, Hearts), NineHearts(Nine, Hearts), TenHearts(Ten, Hearts),
        JackHearts(Jack, Hearts), QueenHearts(Queen, Hearts), KingHearts(King, Hearts),
        AceHearts(Ace, Hearts)
    }
    enum class Diamond(override val rank: Rank, override val suit: Suit): Card {
        TwoDiamonds(Two, Diamonds), ThreeDiamonds(Three, Diamonds), FourDiamonds(Four, Diamonds),
        FiveDiamonds(Five, Diamonds), SixDiamonds(Six, Diamonds), SevenDiamonds(Seven, Diamonds),
        EightDiamonds(Eight, Diamonds), NineDiamonds(Nine, Diamonds), TenDiamonds(Ten, Diamonds),
        JackDiamonds(Jack, Diamonds), QueenDiamonds(Queen, Diamonds), KingDiamonds(King, Diamonds),
        AceDiamonds(Ace, Diamonds)
    }
}

fun main() {
    Deck.Heart.values().forEach {
        println("${it.name}, ${it.suit}, ${it.rank}")
    }
}
