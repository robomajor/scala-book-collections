object ListsAndOther extends App {

  val ints = List(1, 2, 3)
  val names = Vector("Joel", "Chris", "Ed")

  val newInts = List(-1, 0) ++: ints
  val newNames = names ++: Vector("Mike", "Joel")

  for (i <- newInts) print(s"$i, ")
  println()
  newNames.foreach(n => print(s"$n, "))
  println()

  val list = 1 :: 2 :: 3 :: Nil
  println(list)

  val vectorOfPeeps = Vector(Person("Bert"), Person("Ernie"), Person("Grover"))
  println(vectorOfPeeps(1).introduceYourself())
  val newVectorOfPeeps = Vector(Person("Matt")) ++ vectorOfPeeps ++ Vector(Person("Ralph"))
  for (peeps <- newVectorOfPeeps) println(peeps)
}

case class Person(var firstName: String = "Commonname", var lastName: String = "Popularsurname") {
  var age = 20
  var address = new Address()
  def introduceYourself() = println(s"My name is $lastName, $firstName $lastName to be precise. $age years living on $address")
  override def toString: String = s"$firstName $lastName is $age years old"
}

class Address(var street: String = "Mapple", var number: Int = 13, var city: String = "Washington") {
  override def toString: String = s"$street street $number in $city"
}
