package Week3.thursday.afternoontask.mvp

object MortgageValidator extends App{

  def validateMortgage(salary:Double, mortgage:Double): Either[String, Double] ={
    if(salary<=0) Left("Invalid input!!!")
    else if(salary*4 < mortgage) Left("Sorry!! Your salary doesn't meet the mortgage requirement")
    else Right(salary)
  }

  def validateDeposit(deposit:Double, housePrice:Double): Either[String, Double] ={
    if(deposit<=0) Left("Invalid Input!!!")
    else if(deposit< housePrice*0.1) Left("Sorry!! Not enough Deposit")
    else Right(deposit)
  }

  def validateCreditScore(creditScore:Int): Either[String, Int] ={
    if(creditScore<=0) Left("Invalid Input!!!")
    else if(creditScore< 550) Left("Not enough credit score")
    else Right(creditScore)
  }

  def validateBuyer(buyer: Buyer): Either[String, QualifiedBuyer] ={
    for {
      salary <- validateMortgage(buyer.salary, buyer.buyingHousePrice-buyer.deposit)
      deposit <- validateDeposit(buyer.deposit, buyer.buyingHousePrice)
      creditScore <- validateCreditScore(buyer.creditScore)
      qualifiedBuyer = QualifiedBuyer(salary = salary, deposit = deposit, creditScore = creditScore,
        buyingHousePrice = buyer.buyingHousePrice)
    }
      yield qualifiedBuyer
  }

  val samanthaBuyer = Buyer(salary = 45000, deposit = 20000, creditScore = 577,
    buyingHousePrice = 280000)

  println(validateBuyer(samanthaBuyer))




}
