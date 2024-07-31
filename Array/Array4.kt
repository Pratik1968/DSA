package Array

//  Reverse array
    fun main() {
val a = intArrayOf(1,2,3,4,5)
    ArrayUtil4().printArray(ArrayUtil4().reverseArray(a))

    }
class ArrayUtil4: ArrayUtil()
{
        fun reverseArray(array:IntArray):IntArray{
            val temp = IntArray(5)
            for(i in 0..<array.size){
                temp[(array.size-1)-i] = array[i]
            }
            return temp
        }
}