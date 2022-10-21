fun main() {
    val amount = 10001
    val smallDiscountLimit = 1000
    val bigDiscountLimit = 10_000
    val melomaniacDiscountInPersent = 1
    val smallDiscountInRubles = 100
    val bigDiscountInPercents = 5
    val isThisUserMelomaniac = true

    var totalAmount = if (amount > bigDiscountLimit) amount-(amount/100)*bigDiscountInPercents else if (amount > smallDiscountLimit) amount-smallDiscountInRubles else amount
    if (isThisUserMelomaniac) totalAmount = totalAmount-(totalAmount/100)*melomaniacDiscountInPersent

    println("Конечная стоимость составляет $totalAmount р.")
}