package Array
// Check Palindrome
fun main(){
println(ArrayUtil10().isPalindrome("101"))
}
class ArrayUtil10{
    fun isPalindrome(word:String):Boolean{
        val wordArray = word.toCharArray()
        var reverseWord = ""
        for (index in 0 .. (wordArray.size-1)){
            reverseWord+= wordArray[(wordArray.size-1)-index]
        }

        if(reverseWord==word){
            return true
        }
        return false
    }
}