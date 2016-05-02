object functions {
/*
Edit this file to complete the exercises in
'Writing Functions for Repeatability and Portability'
*/

    /*
    Compute the monthly interest, based on a balance and an APR.

    Arguments:
    balance: The balance of an account.
    apr_percent: The APR as a percent (e.g. 19.99)

    Returns:
    interest: The amount of monthly interest owed on the balance, based on the APR
    '*/

  def compute_monthly_interest(balance:Double,apr_percent:Double): Double = {
    
    val interest = balance*apr_percent/100.0/12.0
    return interest
  }

    /*
    Compute a minimum payment based on the following rules:
    1. if balance plus the monthly interest is less than 25,
        the balance plus the monthly interest.
    2. if 1% of the balance plus the monthly interest is
        less than 25, 25.
    3. otherwise, 1% of the balance plus the monthly interest.
    4. If the mininum payment is less than zero, set it to zero.

    Arguments:
    balance: The balance of the account.
    monthly_interest: The amount of monthly interest owed.

    Returns
    min_pay: The minimum payment owed, based on the above rules.
    */


  def compute_min_pay(balance:Double, monthly_interest:Double):Double = {
    100.00
  }
    /*
    Compute the minimum payment (based on the same rules as
    'compute_min_pay', above) for a list of balances
    at a given APR.

    Arguments:
    balance_list: A list of balances.
    apr_percent: The APR for all of the balances.

    Returns:
    min_pay_list: A list of all the minimum payments owed,
        one for each balance.
    */

  
  def compute_min_pay_list(balance_list: List[Double], apr_percent:Double=19.99):List[Double] = {
    List(100.00)
  }
    

    /*
    Return a function literal that takes in a slope, intercept, and x-value (in that order),
    and computes the corresponding y-value for the line.
    */

  val y_value = (slope:Double, intercept:Double, x_value:Double) => 0.0


}