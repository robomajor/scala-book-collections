object Tuples extends App {

  val t = (3, "Three", new OtherPerson("Al"))
  val d = ("Maggie", 30)

  println(t._3)

  val (x, y, z) = (4, "Four", new OtherPerson("Andre"))
  println(x,y,z)

  def getStockInfo = {
    // other code here ...
    ("NFLX", 100.00, 101.00)  // this is a Tuple3
  }

  val (symbol, currentPrice, bidPrice) = getStockInfo
}

class OtherPerson(name: String) {
  override def toString: String = s"It's a person named $name"
}