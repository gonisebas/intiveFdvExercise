import org.scalatest.FunSuite


class BikeRentalTest extends FunSuite {

  test("App.rent one hour") {
    assert(BikeRental.sell(new OneHourItem) === 5)
  }

  test("App.rent one day") {
    assert(BikeRental.sell(new OneDayItem) === 20)
  }

  test("App.rent one week") {
    assert(BikeRental.sell(new OneWeekItem) === 60)
  }

  test("App.rent promotion offer") {
    assert(BikeRental.sell(new Promotion(List(new OneHourItem, new OneDayItem, new OneWeekItem))) === 59.5)
  }

}
