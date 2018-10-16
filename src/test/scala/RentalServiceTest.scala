import org.scalatest.{FlatSpec, Matchers}

class RentalServiceTest extends FlatSpec with Matchers {

  val service: RentalService = new RentalService

  "All types of rent" should "return the correct price" in {
    assert(5D == service.rent(List(Rent(Hour(), 1))))
    assert(20D == service.rent(List(Rent(Day(), 1))))
    assert(60D == service.rent(List(Rent(Week(), 1))))
    assert(0D == service.rent(Nil))

  }

  "A set of rents" should "return the correct price - NO family plan" in {
    assert(320D == service.rent(
      List(
        Rent(Day(), 10),
        Rent(Week(), 2)
      )
    ))
  }

  "A set of rents" should "apply to family plan retuning the correct price" in {
    assert(14 == service.rent(
      List(
        Rent(Hour(), 1),
        Rent(Hour(), 1),
        Rent(Hour(), 1),
        Rent(Hour(), 1),
      )
    ))
  }

  "A set of rents" should "not apply to family plan retuning the correct price" in {
    assert(30D == service.rent(
      List(
        Rent(Hour(), 1),
        Rent(Hour(), 1),
        Rent(Hour(), 1),
        Rent(Hour(), 1),
        Rent(Hour(), 1),
        Rent(Hour(), 1)
      )
    ))
  }
}