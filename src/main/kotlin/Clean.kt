fun crap(x: Array<CharArray>, bags: Int, cap: Int): String {
    val  DOG = "Dog!!"
    val CLEAN = "Clean"
    val CRAP = "Cr@p"
    var counter = bags*cap        // code here
    for(line in x){
        if(line.contains('D')){
            return DOG
        }
        for(point in line){
            if(point == '@'){
                counter--
            }
        }
    }
    return if(counter < 0){
        CRAP
    } else{
        CLEAN
    }
}

fun main() {
    var bags = 2
    var cap = 2

    var  x: Array<CharArray> = arrayOf(
        charArrayOf('_' , '_' , '@' , '@' , '_' , '_'),
        charArrayOf('_' , '@' , '_' , '_' , '@' , '_'),
        charArrayOf('@' , '_' , '_' , '_' , '_' , '_'),
    )
    println(crap(x, bags, cap))
}