import java.util

abstract class Item(){
  def price: Double
}

class OneHourItem extends Item(){
  override def price = 5.0
}

class OneDayItem extends Item(){
  override def price = 20.0
}

class OneWeekItem extends Item(){
  override def price = 60.0
}