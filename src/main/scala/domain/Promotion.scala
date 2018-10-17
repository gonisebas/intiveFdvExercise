
class Promotion(items: List[Item]) extends Item(){

  require((items.size >= 3), "Promotion must have at least 3 items")
  require((items.size <= 5), "Promotion must have at most 5 items")

  override def price: Double = {
    sum(items)
  }

  def sum(xs: List[Item]): Double = {
    if(xs.isEmpty) 0
    else xs.head.price + sum(xs.tail)

  }

  def size = items.size

}