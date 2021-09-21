object MapAndSet extends App {

  val states = collection.mutable.Map(
    "AK" -> "Alaska",
    "IL" -> "Illinois",
    "KY" -> "Kentucky"
  )
  //adding a single element
  states += ("AL" -> "Alabama")
  //adding multiple elements
  states += ("AR" -> "Arkansas", "AZ" -> "Arizona")
  //adding elements from another Map
  states ++= Map("CA" -> "California", "CO" -> "Colorado")
  for ((symbol,name) <- states) println(s"Symbol: $symbol - full name: $name")

  println("Lets remove Alabama and Arkansas")
  states --= List("AL","AR")
  states.foreach { case(symbol, name) => println(s"Symbol: $symbol - full name: $name") }

  //reassign key to a new value
  states("AK") = "Alaska, A Really Big State"
  println(states("AK"))

  val set = scala.collection.mutable.Set[Int]()

  set += 1
  set += 2 += 3
  set ++= Vector.range(5,8)
  for (i <- set) print(s"$i, ")
  println()

  println("trying to add a value to a set that’s already in it, the attempt is quietly ignored")
  set += 2
  for (i <- set) print(s"$i, ")
  println()
  println(s"is value added: ${set.add(2)}")

  println("Lets remove 2 and 3 from set")
  set -= (2, 3)
  for (i <- set) print(s"$i, ")
  println()

  println(s"If 40 isn't on the set, what will return method remove? - ${set.remove(40)}")

}
