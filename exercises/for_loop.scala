object for_loop {

/*"""
Edit this file to complete the exercises in
'Iterate over Data with for Loops'

Edit this file to complete the exercises in
'Iterating over Data with for Loops and Comprehensions'
"""
*/
//----------------------------------------------------------------------------
//Boilerplate code to set up the exercises. DO NOT MODIFY!
  import scala.util.Random
  val r = new scala.util.Random(891)
  val account_id_list = (1 to 50).toList
  val account_balance_list = account_id_list.map(x=>r.nextInt(2000)).map(x=> if (r.nextInt > 0) x else x * -1)
//End boilerplate.
//----------------------------------------------------------------------------

//Set total_balance equal to the sum of all the items in
//account_balance_list:
  var total_balance = 0
  for (balance <- account_balance_list) {
    total_balance = total_balance + balance
  }

/*set total_credit_balance equal to the sum of all the items in account_balance_list that are greater than or equal to zero.
Additionally, set num_accounts_with_credit equal to the number of items that meet this criteria:
*/
  var total_credit_balance = 0
  var num_accounts_with_credit = 0

/*
set account_id_debt_list equal to a list of all the items
#in account_id_list that correspond (have the same index)
#as items in account_balance_list that are less than zero:
*/
  var account_id_debt_list = List()


//set account_balance_zero_list equal to account_balance_list but change all balances less than zero to be zero:
val account_balance_zero_list = List()

}
