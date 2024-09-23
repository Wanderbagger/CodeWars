fun solution(number: Int): Int {
    var result = 0
    for (x in 0  until number){
        if(x % 3 == 0 || x % 5==0){
            result += x
        }
    }
    if(result < 0){
        result = 0
    }
    return result
}

fun main() {
    println( solution(10))
}