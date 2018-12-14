package enumExample

fun main(args: Array<String>) {

    var  dayMonday = DayOfWeek.MONDAY

    println("Day of week is $dayMonday")

    val directionEast = Direction.EAST

    println("Direction is $directionEast")

    val cardTypePlatinum = CardType.PLATINUM



    println("Card limit is ${cardTypePlatinum.getCreditLimit()}")

}

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

interface ICardLimit {
    fun getCreditLimit(): Int
}

enum class CardType : ICardLimit {
    SILVER {
        override fun getCreditLimit() = 100000
    },
    GOLD {
        override fun getCreditLimit() = 200000
    },
    PLATINUM {
        override fun getCreditLimit() = 300000
    }
}

enum class DayOfWeek(internal var dayNumber:Int){

    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    fun getDayNumber():Int{
        return dayNumber
    }

}