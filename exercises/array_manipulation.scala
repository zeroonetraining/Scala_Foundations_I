//Edit this file to complete the exercises in 'Using Arrays for Fast Data Manipulation'
object array_manipulation {

  import Array._
/*
  Exercise 1:
   Create and return an array called myArray that meets the following criteria:
     1. Is one-dimensional.
     2. Starts from zero, and contains every third number
        (i.e. 0, 3, 6, 9...).
     3. Ends with 477.
     4. Is an a
*/
  val myArray = range(0,478,3)


/*
  Exercise 2:
  Filter a 1D array of numbers element-by-element, returning only elements
  that are also in a second array and not in an optional third array.

  Arguments:
    array_to_filter: The 1D Numpy array to be filtered.
    equal_array: A 1D Numpy array, of the same length as array_to_filter,
      where elements in array_to_filter that equal those in this array
      will be returned.
    not_equal_array (None): If not None, is a 1D Numpy array, of the same
      length as array_to_filter, where elements in array_to_filter that
      equal those in equal_array but *do not* equal those in this array
      will be returned.

  Returns:
    filtered_array: elements in array_to_filter that match the elements in
      equal_array and optionally do not match the elements in not_equal_array.

  Examples:
    import Array._
    val array_to_filter = Array(1,2,3,4,5)
    val equal_array = Array(1,2,5,5,5)
    val not_equal_array = Array(2,2,3,4,1)
    filter_array(array_to_filter, equal_array) // returns Array(1,2,5)
    filter_array(array_to_filter, equal_array, not_equal_array) // returns Array(1,5)
    filter_array(array_to_filter, not_equal_array, equal_array) // returns Array(3,4)
*/

  def filter_array(array_to_filter:Array[Int], equal_array:Array[Int], not_equal_array:Array[Int]=Array()):Array[Int] = {

    Array(0)
  }


/*
  Exercise 3:
    Multiply each element in a 1D array (of Doubles or Ints) by the element at the
    same index of the array when reversed, then return the result.

    Arguments:
    input_array: The 1D array to have this operation performed on it.

    Returns:
    output_array: The result of the operation.

    Example:
    val input_array = Array(1,2,3,4,5)
    reverse_multiply(input_array) // returns Array(5,8,9,8,5)
*/

  def reverse_multiply(input_array:Array[Double]): Array[Double] = {
    Array(0.0)
  }


/*
  Exercise 4:
    Compute the set intersection of two 1D Arrays. The
    set intersection is defined as all distinct values which appear
    in both arrays.
    
    Arguments:
    array_1, array_2: 1D Arrays of integers
    
    Returns"
    set_intersection: the set intersection of the two input arrays.
*/
  def compute_set_intersection(array_1:Array[Int], array_2:Array[Int]): Array[Int] = {
    Array(0)
  }


/*
Exercise 5:
  Compute the mean of every sub-Array of a 2D nested array.
  
  Arguments:
    input_array: An Array containing multiple Arrays of integers.
  
  Returns:
    mean_array: A 1D Array containing the means of each sub-array

  Example:
    val input_array = range(0,25).grouped(5).toArray
    compute_mean_array(input_array) //returns Array(
*/

  def compute_mean_array(input_array:Array[Array[Int]]): Array[Double] = {
    Array(0.0)
  }

/*
  Exercise 6: 
    Take a 1D Array of Integers and transform it into an Array of Tuples where 
    the first element of each tuple is the square of the original element and 
    the second element of the tuple is the priginal element plus 5.

    Arguments:
      input_array:  An array containing integers

    Returns:
      tuple_array:  An array of tuples

    Example:
      val input_array = Array(1,2,3,4)
      compute_tuple_array(input_array) // Returns Array((1,6), (4,7), (9,8), (16,9))
*/

  def compute_tuple_array(input_array:Array[Int]): Array[(Int,Int)] = {
    Array((0,0))
  }

}