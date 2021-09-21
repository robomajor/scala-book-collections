import scala.collection.mutable.ArrayBuffer

object Collections extends App {

  val ints = ArrayBuffer[Int]()
  val names = ArrayBuffer[String]()

  ints += 1 += 2
  ints.foreach(x => println(x))

  val nums = ArrayBuffer(1,5,7,3)
  nums ++= ints
  nums.foreach(n => print(s"$n, "))
  println()

  println("Lets drop element of value 3")
  nums -= 3
  nums.foreach(n => print(s"$n, "))
  println()

  println("Lets subtract array that contain 1 and 2")
  nums --= ints
  nums.foreach(n => print(s"$n, "))
  println(" - First occurrences of the elements from the subtracted set have been removed")

  nums.sortInPlace()
  println(s"nums array but sorted - $nums")

  println("Lets append a list of range from 7 to 9 ")
  ints ++= List(7, 8, 9)
  nums.appendAll(ints)
  nums.foreach(n => print(s"$n, "))
  println()

  println("Lets insert a 0 at index 0")
  nums.insert(0, 0)
  nums.foreach(n => print(s"$n, "))
  println()

  println("Lets insert a vector of range from <6 to 12)")
  nums.insertAll(0, Vector.range(6,12))
  nums.foreach(n => print(s"$n, "))
  println()

  println("Lets prepend a sequence of range from <4 to 7)")
  nums.prependAll(Seq.range(4,7))
  nums.foreach(n => print(s"$n, "))
  println()

  println("Lets remove 5 elements that come after element at position <4...")
  nums.remove(4,5)
  nums.foreach(n => print(s"$n, "))
  println()

  println("Lets trim first 3 elements")
  nums.trimStart(3)
  nums.foreach(n => print(s"$n, "))
  println()

  println("Lets trim last 3 elements")
  nums.trimEnd(3)
  nums.foreach(n => print(s"$n, "))
  println()

  println("Lets just clear this Array")
  nums.clear()
  nums.foreach(n => print(s"$n, "))
  println()
}
