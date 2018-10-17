import org.scalatest.FunSuite


class PromotionTest extends FunSuite {

  test("Promotion. Add low items error"){
    val thrown = intercept[IllegalArgumentException]{
      new Promotion(List())
    }
    assert(thrown.getMessage === "requirement failed: Promotion must have at least 3 items")
  }

  test("Promotion. Add hight items error"){
    val thrown = intercept[IllegalArgumentException]{
      new Promotion(List(new OneHourItem, new OneHourItem, new OneHourItem, new OneHourItem,  new OneHourItem, new OneHourItem))
    }
    assert(thrown.getMessage === "requirement failed: Promotion must have at most 5 items")
  }

  test("Promotion. Items quantity ok"){
    val promotion = new Promotion(List(new OneHourItem, new OneHourItem, new OneHourItem))
    assert(promotion.size === 3)
  }

}
