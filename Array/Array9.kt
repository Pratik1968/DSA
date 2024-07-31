package Array
// find missing number  between 1 to n
fun main(){
    println(ArrayUtil9().findMissing(intArrayOf(1,2,3,4,6,7,8,9),9))
}
class ArrayUtil9:ArrayUtil(){
    fun findMissing(value:IntArray,n:Int):Int{
        val expectedSum = n*(n+1)/2
        var resultSum = 0

        for (item in value){
            resultSum+=item
        }
        val missingNum =expectedSum-resultSum
        return missingNum
    }
}
