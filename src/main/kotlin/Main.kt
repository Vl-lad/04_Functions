package org.example

fun main() {
    val text = "F2p)v\"y233{0->c}ttelciFc"
    val firstHalf = text.substring(0, text.length / 2)
    val secondHalf = text.substring(text.length / 2, text.length)
    val decodeFirstHalf = decodeFirstHalf(firstHalf)
    val decodeSecondHalf = decodeSecondHalf(secondHalf)

    println("""
        first half is: $decodeFirstHalf
        second half is : $decodeSecondHalf
        
        result: $decodeFirstHalf $decodeSecondHalf
    """.trimMargin())
}
fun decodeFirstHalf(text:String):String{
    var resultOne: String = text
    resultOne = moveRight(resultOne, 1)
    resultOne = resultOne.replace('5', 's' )
    resultOne = resultOne.replace('4', 'u' )
    resultOne = moveLeft(resultOne, 3)
    resultOne = resultOne.replace('0', 'o' )
    return resultOne
}
fun decodeSecondHalf(text:String):String{
    var resultTwo:  String = text
    resultTwo = resultTwo.reversed()
    resultTwo = moveLeft(resultTwo, 4)
    resultTwo = resultTwo.replace('_', ' ' )
    return resultTwo
}

fun moveRight(text: String, amount: Int): String {
    return text.map { c -> c + amount }.joinToString("")
}
fun moveLeft(text: String, amount: Int): String {
    return text.map { c -> c - amount }.joinToString("")
}
