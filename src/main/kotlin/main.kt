fun main() {
    var sumOfMoney=15*100
    val minSum=35*100
    val commition =0.75/100
    val amount = if(sumOfMoney>=minSum) {
        println("Полная сумма перевода")
        sumOfMoney * (1 + commition)
    }
    else {
        println("Недостаточная сумма перевода")
        0
    }
    print(amount)
    println(" коп")
}