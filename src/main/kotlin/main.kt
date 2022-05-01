fun main() {
//    println(calculateCommission(160000000, "Masestro"))
}
fun calculateCommission(
    sumOfMoney: Int,
    typeOfCard: String = "VK_Pay",
    moneyBeforeNow: Int = 0,
    isThereAction: Boolean = true
): Double {
    val totalSumOfMoney = sumOfMoney + moneyBeforeNow
    val vkDayLimit = 15000
    val vkTotalLimit = 40000
    val dayLimit = 150000
    val totalLimit = 600000

    if (when (typeOfCard) {
            "VK_Pay" -> {
                (sumOfMoney <= vkDayLimit) && (totalSumOfMoney <= vkTotalLimit)
            }

            else -> {
                (sumOfMoney <= dayLimit) && (totalSumOfMoney <= totalLimit)
            }
        }
    )
    else {
//                TODO Здесь надо кидать исключение, когда изучим
        println(" Превышен лимит перевода")
        return 0.0
    }

    if ((typeOfCard=="Мир")&&sumOfMoney<35) {
//      TODO Исключение
        println(" Слишком маленькая сумма перевода")
        return 0.0
    }


    val masCommitionProcent = 0.6 / 100
    val visaMirCommitionProcent = 0.75 / 100
    val additionalConstFine = 20
    return when (typeOfCard) {
        "VK_Pay" -> 0.0
        "MasterCard", "Masestro" -> {
            if (isThereAction && (sumOfMoney > 300) && (sumOfMoney < 75000))
                0.0
            else
                sumOfMoney * masCommitionProcent + additionalConstFine
        };
        "Мир", "Visa" -> sumOfMoney * visaMirCommitionProcent;
        else -> 0.0
    }
}


//    fun limits (typeOfCard: String = "VK_Pay", totalSumOfMoney: Int, sumOfMoney: Int): Boolean {
//        return when (typeOfCard) {
//            "VK_Pay" -> {
//                (sumOfMoney<=15000)&&(totalSumOfMoney<=40000)
//            }
//            else -> {
//                (sumOfMoney<=150000)&&(totalSumOfMoney<=600000)
//            }
//        }
//    }
