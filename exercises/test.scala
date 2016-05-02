object commonFuncs {
  def checkAnswers(input:Array[String], totalTests:Int) {
	  if (input.length == 0) println("Congratulations you have all items correct!!!!")
	  else {
		  println("You got " + input.length.toString + " out of " + totalTests + " item(s) incorrect")
		  for (i <- input) println("Please check your solution for " + i)
	  }

  }

}


object variablesTest extends App {

	val incorrect = scala.collection.mutable.ArrayBuffer.empty[(String)]

	if (variables.name != "Lee Cardholder") incorrect += "name"
	if (variables.balance != 120.50) incorrect += "balance"
	if (variables.percent_apr != 20) incorrect += "percent_apr"
	if (variables.monthly_interest != 	(120.50 * 20/100) / 12 ) incorrect += "monthly_interest" 
	
	commonFuncs.checkAnswers(incorrect.toArray, 4)


}

object stringsTest extends App {
  val incorrect = scala.collection.mutable.ArrayBuffer.empty[(String)]
  
  if (strings.lower_case_string != "change banking for good.") incorrect += "lower_case_string"
  if (strings.num_branches != ", T") incorrect += "num_branches"
  if (strings.wiki_intro_nospaces != """CapitalOneFinancialCorporationisaU.S.
-basedbankholdingcompanyspecializingincreditcards,
homeloans,autoloans,bankingandsavingsproducts.When
measuredintermsoftotalassetsanddeposits,CapitalOneis
theeighthlargestbankholdingcompanyintheUnitedStates.
Asof2012,Thebankhas963CapitalOneBankBranchesincluding
10cafestylelocationsfortheirCapitalOne360brandand2,000
ATMs.CapitalOneFinancialisamemberoftheFortune500,and
alsoconductsbusinessinCanadaandtheUnitedKingdom.The
companyhelpedpioneerthemassmarketingofcreditcardsin
the1990s,anditisnowthefourth-largestcustomerofthe
UnitedStatesPostalService.""") incorrect += "wiki_intro_nospaces"

  commonFuncs.checkAnswers(incorrect.toArray, 3)

}

object comparisonsTest extends App {
  val incorrect = scala.collection.mutable.ArrayBuffer.empty[(String)]


  if(comparisons.mortgage_approved != 
  	{if(comparisons.superprime == true 
  		   || (comparisons.long_standing_customer == true && comparisons.large_down_payment == true)
  		  ) true
     else false
    }) incorrect += "mortgage_approved"

  if(comparisons.credit_description !=
    {if (comparisons.FICO >= 700) "good" 
     else if (comparisons.FICO >= 600 && comparisons.FICO < 700) "ok" 
     else if (comparisons.FICO < 600) "bad"
    }) incorrect += "credit_description"
  println(comparisons.credit_description)
  
  commonFuncs.checkAnswers(incorrect.toArray, 2)

}

object for_loopTest extends App {
  val incorrect = scala.collection.mutable.ArrayBuffer.empty[(String)]
  
  if(for_loop.total_balance != -1722) incorrect += "total_balance"
  if(for_loop.total_credit_balance != 27390) incorrect += "total_credit_balance"
  if(for_loop.num_accounts_with_credit != 24) incorrect += "num_accounts_with_credit"
  if(for_loop.account_id_debt_list != List(1, 4, 6, 8, 9, 14, 18, 19, 21, 23, 24, 26, 28, 29, 30, 31, 33, 35, 37, 38, 39, 43, 46, 47, 48, 50))
    incorrect += "account_id_debt_list"
  if(for_loop.account_balance_zero_list != List(0, 1461, 230, 0, 1290, 0, 501, 0, 0, 781, 1276, 246, 547, 0, 1874, 868, 1886, 0, 0, 653, 0, 761, 0, 0, 1752, 0, 1093, 0, 0, 0, 0, 1754, 0, 1283, 0, 1097, 0, 0, 0, 1488, 1483, 1870, 0, 984, 1767, 0, 0, 0, 445, 0))
    incorrect += "account_balance_zero_list"

  commonFuncs.checkAnswers(incorrect.toArray, 5)

}

object datatypesTest extends App{
  val incorrect = scala.collection.mutable.ArrayBuffer.empty[(String)]

  //Arrays
  if(datatypes.fiboArray_last != 7778742049L) incorrect += "fiboArray_last"
  if(datatypes.fiboArray_even_entries_sum != 6293134512L) incorrect += "fiboArray_even_entries_sum"
  if(datatypes.fiboArray_reversed.sameElements(Array(7778742049L, 4807526976L, 2971215073L, 1836311903, 1134903170, 701408733,
    433494437, 267914296, 165580141, 102334155, 63245986, 39088169, 24157817, 14930352, 9227465, 5702887, 3524578, 
    2178309, 1346269, 832040, 514229, 317811, 196418, 121393, 75025, 46368, 28657, 17711, 10946, 6765, 4181, 2584, 
    1597, 987, 610, 377, 233, 144, 89, 55, 34, 21, 13, 8, 5, 3, 2, 1, 1, 0)) == false) incorrect += "fiboArray_reversed"
  if(datatypes.A_and_B.sameElements(Array(1, 2, 3, 4, 5, "a", "b", "c", "d", "e")) == false) incorrect += "A_and_B"
  if(datatypes.is_1337_fibo != false) incorrect += "is_1337_fibo"

  //Maps
  if(datatypes.zip_map != Map("e" -> 5, "a" -> 1, "b" -> 2, "c" -> 3, "d" -> 4)) incorrect += "zip_map"
  if(datatypes.c_value != 3) incorrect += "c_value"
  if(datatypes.zip_map_remove != Map("e" -> 5, "a" -> 1, "b" -> 2, "c" -> 3)) incorrect += "zip_map_remove"

  commonFuncs.checkAnswers(incorrect.toArray, 8)
}


object functionsTest extends App {
  val incorrect = scala.collection.mutable.ArrayBuffer.empty[(String)]

  if(functions.compute_monthly_interest(1000, 12.00) != 10.0) incorrect += "compute_monthly_interest"
  if(functions.compute_min_pay(10,10) != 20.0 || functions.compute_min_pay(100,10) != 25.0 ||
     math.round(functions.compute_min_pay(10000,10)*100).toDouble /100 != 100.1) incorrect += "compute_min_pay"
  if(functions.compute_min_pay_list(List(10,100,500,1000,10000), 12.99).sameElements(List(10.10825, 25.0, 25.0, 25.0, 101.0825)) == false) incorrect += "compute_min_pay_list"
  
  if(functions.y_value(1.5, 10, 2.0) != 13.0) incorrect += "y_value"
  
  commonFuncs.checkAnswers(incorrect.toArray, 4)
}

object inputTest extends App {
  val incorrect = scala.collection.mutable.ArrayBuffer.empty[(String)]
  println("""If prompted to enter a cardholder name enter "Lee Cardholder".""")
  println("""If prompted to enter a balance enter "10.25".""")
  println()

  if(input.name != "Lee Cardholder") incorrect += "name"

  if(input.balance != 10.25) incorrect += "balance"
  
  commonFuncs.checkAnswers(incorrect.toArray, 2)


}


object read_and_writeTest extends App {
  val incorrect = scala.collection.mutable.ArrayBuffer.empty[(String)]
  def getCurrentDirectory = new java.io.File( "." ).getCanonicalPath
  println(getCurrentDirectory)


  if(read_and_write.read_csv(getCurrentDirectory+"/data/old_transactions.csv") != 26) incorrect += "read_csv"

  val testFile = new java.io.File(getCurrentDirectory+"/data/test.csv")

  if(testFile.exists == true) testFile.delete
  read_and_write.write_csv(Array(Array(1,2,3),Array(5,6,7)), getCurrentDirectory+"/data/test.csv")

  if(testFile.exists == false || read_and_write.read_csv(getCurrentDirectory+"/data/test.csv") != 2) incorrect += "write_csv"
  println(testFile.exists)
  println(read_and_write.read_csv(getCurrentDirectory+"/data/test.csv"))
  commonFuncs.checkAnswers(incorrect.toArray, 2)

}

object array_manipulationTest extends App {
  import Array._
  val incorrect = scala.collection.mutable.ArrayBuffer.empty[(String)]
  
  if(array_manipulation.myArray.sameElements(Array(0, 3, 6, 9, 12, 15, 18, 21, 24, 27, 
  	30, 33, 36, 39, 42, 45, 48, 51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99, 
  	102, 105, 108, 111, 114, 117, 120, 123, 126, 129, 132, 135, 138, 141, 144, 147, 150, 153, 156, 159, 
  	162, 165, 168, 171, 174, 177, 180, 183, 186, 189, 192, 195, 198, 201, 204, 207, 210, 213, 216, 219, 
  	222, 225, 228, 231, 234, 237, 240, 243, 246, 249, 252, 255, 258, 261, 264, 267, 270, 273, 276, 279, 
  	282, 285, 288, 291, 294, 297, 300, 303, 306, 309, 312, 315, 318, 321, 324, 327, 330, 333, 336, 339, 
  	342, 345, 348, 351, 354, 357, 360, 363, 366, 369, 372, 375, 378, 381, 384, 387, 390, 393, 396, 399, 
  	402, 405, 408, 411, 414, 417, 420, 423, 426, 429, 432, 435, 438, 441, 444, 447, 450, 453, 456, 459, 
  	462, 465, 468, 471, 474, 477)) != true) incorrect += "myArray"

  if(array_manipulation.filter_array(Array(1,2,3,4,5), Array(1,2,5,5,5)).sameElements(Array(1,2,5)) != true ||
  	 array_manipulation.filter_array(Array(1,2,3,4,5), Array(1,2,5,5,5), Array(2,2,3,4,1)).sameElements(Array(1,5)) != true ||
  	 array_manipulation.filter_array(Array(1,2,3,4,5), Array(2,2,3,4,1), Array(1,2,5,5,5)).sameElements(Array(3,4)) != true
  	) incorrect += "filter_array"
  
  if(array_manipulation.reverse_multiply(Array(1,2,3,4,5)).sameElements(Array(5,8,9,8,5)) != true) incorrect += "reverse_multiply"

  if(array_manipulation.compute_set_intersection(Array(1,2,2,3,4), Array(2,2,2,4,5)).sameElements(Array(2, 4)) != true) incorrect += "compute_set_intersection"

  if(array_manipulation.compute_mean_array(range(0,25).grouped(5).toArray).sameElements(Array(2.0, 7.0, 12.0, 17.0, 22.0)) != true) incorrect += "compute_mean_array"

  if(array_manipulation.compute_tuple_array(Array(1,2,3,4)).sameElements(Array((1,6), (4,7), (9,8), (16,9))) != true) incorrect += "compute_tuple_array"

  commonFuncs.checkAnswers(incorrect.toArray, 6)


}








