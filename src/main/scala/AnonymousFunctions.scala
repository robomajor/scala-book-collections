object AnonymousFunctions extends App {

  var ints = List(1,2,3)
  val doubledInts = ints.map(_ * 2)
  val tripledInts = ints.map(i => i*3)
  val quadrupleInts = for (i <- ints) yield i*4

  println(s"List 'ints' - $ints")
  println(s"List 'ints' doubled - $doubledInts")
  println(s"List 'ints' tripled - $tripledInts")
  println(s"List 'ints' quadrupled - $quadrupleInts")

  ints = List.range(1,10)
  val greaterThanFive = ints.filter(_ > 5)
  val lesserThanFive = ints.filter(_ < 5)
  val onlyEvenElementsOfInts = ints.filter(_ % 2 == 0)

  println(s"New list 'ints' - $ints")
  println(s"Elements of 'ints' greater than 5 - $greaterThanFive")
  println(s"Elements of 'ints' lesser than 5 - $lesserThanFive")
  println(s"Only even elements of list 'ints' - $onlyEvenElementsOfInts")

  // map expects to receive a function that transforms one Int value into another Int value
  def double(i: Int): Int = i * 2   //a method that doubles an Int
  val doubledNewInts = ints.map(double)
  println(s"Doubled 'ints' - $doubledNewInts")

  // filter method expects to receive a function that takes an Int and returns a Boolean value
  def lessThanSeven(i: Int): Boolean = (i < 7)
  println(s"Elements of 'ints' that are lesser than seven - ${ints.filter(lessThanSeven)}")

  val nums = (1 to 10).toList
  val names = List("joel", "ed", "chris", "maurice")

  println(names)
  println(names.map(_.capitalize))
  println(nums.map(_ < 5))
  println(names.filter(_.length <= 4))
  nums.filter(_ < 4).foreach(println)
  println(nums.head)
  println("head".head)
  println("tail".tail)
  println(s"take first 2 names - ${names.take(2)}")
  println(names.takeWhile(_.length > 5))
  println(s"drops first 5 elements - ${nums.drop(5)}")
  println(s"Drops every element on list before appearing element 'chris' - ${names.dropWhile(_ != "chris")}")

  def add(x: Int, y: Int): Int = {
    val theSum = x + y
    println(s"received $x and $y, their sum is $theSum")
    theSum
  }
  val a = List(1,2,3,4)
  // reduce uses add to reduce the list a into a single value, in this case, the sum of the integers in the list
  a.reduce(add)
  println(a.reduce(_ * _))

  val m = Map(
    1 -> "a",
    2 -> "b",
    3 -> "c",
    4 -> "d"
  )

  for ((k,v) <- m) printf("key: %s, value: %s\n", k, v)
  println(m.keys)
  println(m.values)
  println(m.contains(3))

  // how to transform Map values
  val ucMap = m.transform((k,v) => v.toUpperCase)
  println(ucMap)

  // how to filter a Map by its keys
  val twoAndThree = m.view.filterKeys(Set(2,3)).toMap
  println(twoAndThree)

  // how to take the first two elements from a Map
  val firstTwoElements = m.take(2)
  println(firstTwoElements)
}
