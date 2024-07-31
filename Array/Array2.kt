package Array

// Print Elements of array
//
    fun main() {
        val a = intArrayOf(1, 23, 4, 5, 6)
        ArrayUtil().printArray(a)
    }

open class ArrayUtil {

        fun printArray(a: IntArray) {
            for (i in a) {
                println(i)
            }
        }

}
