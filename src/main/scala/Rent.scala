case class Rent(
                 typ: RentType,
                 time: Integer
                )

trait RentType {
  val price = 0
  def getPrice(time: Int): Int = time * price
}

case class Hour() extends RentType {
  override val price: Int = 5
}

case class Day() extends RentType {
  override val price: Int = 20
}

case class Week() extends RentType {
  override val price: Int = 60
}