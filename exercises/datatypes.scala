object datatypes {
/*
Edit this file to complete the exercises in
'Efficiently Storing and Accessing Data'
*/


//#####################################################
//Some setup, creating an array to be
//used in some of the exercises:

  val fibs:Stream[Long] = 0 #:: 1 #:: (fibs zip fibs.tail).map{ t => t._1 + t._2 }
  val fiboArray = fibs.take(50).toArray

//#####################################################

//#####Arrays!#####

//Just to get you going, here's the answer to the first exercise:
  val maybe_your_first_array = Array(1, 2, 3, 4, 5)

// Find the last element of fiboArray:
  var fiboArray_last = 0

// Find the sum of all even entries (indices 0, 2, 4,...) of fiboArray:
  val fiboArray_even_entries_sum = 0

// Can you put a reversed copy of fiboArray into fiboArray_reversed?
  val fiboArray_reversed:Array[Long] = Array()

  val A = Array(1, 2, 3, 4, 5)
  val B = Array("a", "b", "c", "d", "e")

//Two lists can be concatenated with ++. Concatenate A and B together, and store the result in A_and_B.
  val A_and_B:Array[Any] = Array()

// Check if 1337 is in fiboArray. If it is, make is_1337_fibo True, otherwise make it False.
  val is_1337_fibo = true

//#####Tuples!#####

// Here's the first answer to the tuple section:
  //val maybe_your_first_tuple = (0, 1, 2, 3, "hello", 4, 5, true, 7.5)


//#####Maps!#####

//Check out all the stuff you can put in Maps:
  val maybe_your_first_map = Map("key1" -> "val1", "key2" -> "val2", 
                                 "key3" -> 0, "key4" -> (1,2,3), (1,2) -> "tuples can be keys",
                                 "so can lists"-> List("how", "cool", "for", "lists"))


//Create a new map called 'zip_map' from 2 arrays: use the Array B above as the keys and the correspinding values of Array A as the values
  val zip_map = null

// Map elements are accessed by key rather than position.
// Try it here - get the value of key "c" in the map zip_map:
  val c_value = 0

// remove the key "d" from zip_map
  val zip_map_remove = null
}
