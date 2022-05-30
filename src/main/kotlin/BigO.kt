fun main() {
    logAllPairsOfArray(arrayOf(1,2,3,4,5,6))
}

//print pair of number from the array
/**
 * And the time complexity of this program will be O(n2)
 * */
fun logAllPairsOfArray(array: Array<Int>) {
    for (i in array.indices)
        for (j in array.indices)
            println("pair is {${array[i]}, ${array[j]}}")
}


//here in this example the time Complexity is O(n) because the time taken by the program will increase if the input is increased
fun findNemo() {
    val startTime = System.currentTimeMillis()
    val list = List<String>(10000) { "Find Nemo" }
    for (data in list) {
        println(data)
    }
    val endTime = System.currentTimeMillis()
    println("Total Time is ${endTime - startTime}")
}

//here in this example the time complexity is O(1), because what ever the input is the program will perform only one operation
val boxes = arrayOf(0, 1, 2, 3, 4, 5, 6)
fun findBoxes(boxes: Array<Int>) {
    println(boxes[5])
}


/**
 * There is 4 steps to calculate the Time Complexity of the Program.
 * 1. Worst Case.
 * 2. Remove Constants.
 * 3. Different Terms for inputs.
 * 4. Drop Non Dominants
 * */


/**
 * Here in the below example and the time complexity of this program will be O(n)
 *because if add all time taken by the each steps it will be
 * O(1) + O(1) + O(n) + O(n) + O(n) + O(n) + O(1) = O(3)+4O(n) = O(3+4n) =O(n)
 * */
fun funChallenge(input: String): Int {
    var a: Int = 10 // O(1)
    a = 50 + 3 // O(1)

    for (index in input.indices) { //O(n)
        anotherFunction()//O(n)
        val stranger = true//O(n)
        a++//O(n)
    }
    return a //O(1)
}

fun anotherFunction() {}

/**
 * Here in the below example and the time complexity of this program will be O(n)
 *because if add all time taken by the each steps it will be
 * O(1) + O(1) + O(1) + O(n) + O(n) + O(n) + O(n) + O(n) + O(n) + O(n) + O(1) = O(4)+7O(n) = O(4+7n) =O(n)
 * */
fun anotherFunChallenge(input: Int) {
    var a = 5; //O(1)
    var b = 10; //O(1)
    var c = 50; //O(1)
    for (i in 0..input) { //O(n)
        var x = i + 1; //O(n)
        var y = i + 2; //O(n)
        var z = i + 3; //O(n)
    }
    for (j in 0..input) { //O(n)
        var p = j * 2; //O(n)
        var q = j * 2; //O(n)
    }
    var whoAmI = "I don't know"; //O(1)
}


