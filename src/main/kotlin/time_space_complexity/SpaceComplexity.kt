fun main(){
println(arrayOfHiNTimes(100))
}

/**
 *Here the space complexity of the below program will be O(1),
 * because here we are only creating one variable which is i.
 * */
fun boo(n:Int){
    for(i in 0..n){
        println(i)
    }
}


/**
 * Here the space complexity of the below program will be O(n),
 * because here we are allocating the memory as per the user inputs.
 * i.e. if the number of inputs increase the amount of space taken by the memory will also be increased.
 * */
fun arrayOfHiNTimes(n:Int): MutableList<Int> {

    var ds = "asdfas"
    ds.length

    var integerArray = mutableListOf<Int>()
    for(i in 0..n){
        integerArray.add(i)
    }
    return integerArray
}