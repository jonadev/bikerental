class RentalService {

  def isFamilyPlan(size: Int, total: Int): Double = {
    if(size >= 3 && size <= 5){
      total - (total * 0.3)
    } else total
  }

  def rent(rents: List[Rent]): Double = {
    val total = rents.foldLeft(0) { (total, rent) => total + (
      rent.typ match {
        case h:Hour => h.getPrice(rent.time)
        case d:Day => d.getPrice(rent.time)
        case w:Week => w.getPrice(rent.time)
      }
    )}
    isFamilyPlan(rents.size, total)
  }
}