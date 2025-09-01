/* 
    Name: Connor McGuire
    In-Class Problems 1
    Kotlin Basics
*/

fun main() {

    // 1. Print these messages on separate lines
    
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")
    

    // 2. Uncomment the following code and fix the compile error
    println("New chat message from a friend")

    // 3. Uncomment the following and fix the compile error
    
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
    

    // 4. Uncomment and fix this code so it prints:
    // The total part size is: 50
    
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
     

    // 5. Uncomment and fix this code so it compiles 
    // (note: having a fraction of a cat might not make sense)
    
    val numCats: Int = 2
    var numDogs: Int = 2
    numDogs += numCats
    
    

    // 6. After fixing number 5, write a print statement to print the number
 
    println("There are $numCats cats and $numDogs dogs")

    // 7. Write a when statement that prints whether there are more cats than 
    // dogs, more dogs than cats, are there are the same number of each.
    // Hint: you can simply do 
    when {
    numCats > numDogs -> println("Their are more cats than dogs")
    numCats < numDogs -> println("Their are more dogs than cats")
    else -> println("Their are the same number of cats and dogs")
 }
   

    // 8. Use a when statement to determine if a character is a vowel or 
    // consonant and print the result. Char has methods named lowerCaseChar()
    // and upperCaseChar() you can use, or you can assume upper/lowercase
    // Hint: you can create a listOf vowels
    
    val letter = 'a'

	when (letter.lowercaseChar()) {
    in listOf('a', 'e', 'i', 'o', 'u') -> println("The letter is a vowel")
    else -> println("The letter is a consonant")
}

    // 9. Use a for loop to print the numbers 0 to 9 in reverse order. Hint -
    // there is a downTo keyword
    
    
    for (i in 9 downTo 0) println(i)

    
    // 10. Create one list with 3 of your favorite shows/movies/games/etc. and
    // print the list
	
    
    val movieList = listOf("Breaking Bad", "Interstellar", "Rainbow Six Seige") 
    println(movieList)
    
    
    // 11. Create another list with 2 or 3 of your least favorite shows/movies/
    // /games/etc. Then, create a third list that contains everything from both lists.
    // Print out this new list.
    
    
    val movieList2 = listOf("Stranger Things", "The Summer I turned Pretty", "Dead by Daylight") 
    val movieList3= mutableListOf("$movieList", "$movieList2")
    println(movieList2)
    println(movieList3)
    

    // 12. Remove your most and least favorite from the combined list, and print
    // this new list. (You may need to modify what you did for 10 and 11)
    
    movieList3.remove("Stranger Things")
    movieList3.remove("Rainbow Six Seige")
    println(movieList3)

    // 13. Create a string variable and set it to null, then print the string
    
    var someString: String? = null
	println(someString)

    // 14. Make a variable and set it to the length of the string from problem 13 such 
    // that if the string is null, the variable will be -1, then print the length.
    
    
    var myString: String? = null
    val length = myString?.length ?: -1
	println(length)

    
    // 15. Write a when statement that returns a string saying if the string
    // is empty, the string is short, the string is medium length, or the string
    // is long. Whatever you consider is short, medium, and long is fine.
    
    
    val stringa: String? = "Skibidi Toilet is not real chat" 

	val result = when {
    stringa.isNullOrEmpty() -> println("The string is empty")
    stringa.length < 10 -> println("The string is short")
    stringa.length in 10..25 -> println("The string is medium length")
    else -> println("The string is long")
    }
}
