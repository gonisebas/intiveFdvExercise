
object BikeRental{

  def sell(item: Item) = item.price

  def sell(promotion: Promotion): Double = {
    (promotion.price * 70)/100
  }

}