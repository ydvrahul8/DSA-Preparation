package exercise

/**
 * Find if the array contains the sum or not
 * eg. array = [1,2,3,4,5]
 * sum = 8
 * output = true
 * */

fun main() {
    val data = arrayOf(1, 2, 3, 4, 5, 6, 7)
    val data1 = arrayOf(5, 3, 1, 2, 4, 6, 7)
    println(findSum2(data, 8))
}

fun findSum(data: Array<Int>, sum: Int): Boolean {
    var result = false
    for (index1 in data.indices)
        for (index2 in data.indices) {
            result = (data[index1] + data[index2]) == sum
            if (result)
                break
        }
    return result
}

/**
 * This solution will only work with if the array passed in the function is in the sorted manner.
 * and the time complexity of this function will be O(n)
 * */

fun findSum1(data: Array<Int>, sum: Int): Boolean {
    var initialIndex = 0
    var lastIndex = data.size - 1

    var result = false
    while (initialIndex < lastIndex) {
        val dataSum = data[initialIndex] + data[lastIndex]
        if (dataSum == sum) {
            result = true
            break
        } else if (dataSum < sum)
            initialIndex++
        else if (dataSum > sum)
            lastIndex--
    }
    return result
}

/**
 * This is solution will work for any kind of given array.
 * the time complexity of this array will be O(n)
 * */
fun findSum2(data: Array<Int>, sum: Int): Boolean {
    val set = HashSet<Int>()
    set.add(sum - data[0])
    for (index in 1 until data.size) {
        println(data[index])
        if (set.contains(data[index])) {
            return true
        } else {
            set.add(sum - data[index])
        }
    }
    return false
}