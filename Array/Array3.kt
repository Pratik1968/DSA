package Array


// Remove even integer from array
    fun main(args: Array<String>) {
        val arr = intArrayOf(1, 2, 3, 4, 5, 6)
        ArrayUtil3().printArray(ArrayUtil3().returnEvenInteger(arr))
    }

class ArrayUtil3 : ArrayUtil() {
    fun returnEvenInteger(a: IntArray): IntArray {
        val temp = IntArray(countEvenNumbers(a))
        var lastIndex = 0
        for (x in a) {
            if (x % 2 == 0) {
                temp[lastIndex] = x
                lastIndex++
            }
        }
        return temp
    }

    private fun countEvenNumbers(a: IntArray): Int {
        var count = 0
        for (x in a) {
            if (x % 2 == 0) {
                count++
            }
        }
        return count
    }
}
