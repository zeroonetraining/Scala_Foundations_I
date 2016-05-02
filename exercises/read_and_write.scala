object read_and_write {

//Edit this file to complete the exercises in 'Reading and Writing Files - the Basics'


//import any modules you need
import scala.io._
import scala.tools.nsc.io._

//***********read a csv file***********
//reads a comma-separated-value (CSV) file, then returns the total number of lines in the file.

/*
    Arguments:
    filepath: The path to the file you want to read, as a string.  If the file is in a different directory than where you're 
      running this code from, you'll need to use either the full or relative path to the file.

    Returns:
    num_lines: The number of lines in the file specified by 'filename'
*/


  def read_csv(filepath:String): Long = {
    0
  }

/*
    Takes in a Array of Arrays, and saves that to a CSV file where each
    element in the Array is a line in the file and every element in the
    sub-Array is separated by a comma

    Arguments:
    data_Array: Input data Array. Each element is itself an Array, representing a single row of data, and every 
      item in a subArray represents the datain that column and row.
    output_csv_filename: The filename to save the data to, as a CSV.

    Returns:
    None

    Example:
    val data_Array = Array(Array(1, 2, 3), Array(4, 5, 6))
    write_csv(data_Array,"/path/to/test.csv")

    File 'test.csv' now contains the following:
    1,2,3
    4,5,6
    '''  
    ***Note***:
    The tests for this function use the read_csv function so make sure you that is testting as corect
    before trying to debug any errors with this function   
*/

  def write_csv(data_list:Array[Array[Any]], output_csv_path:String):Unit = {
  }

}

