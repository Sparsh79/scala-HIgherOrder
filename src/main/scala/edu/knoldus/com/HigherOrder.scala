package edu.knoldus.com

class HigherOrder {
  def sumofSquare(x: Int, y: Int): Int = x*x + y*y
  def sumofCubes(x: Int, y: Int): Int = x*x + y*y
  def sumofInt(x: Int, y: Int): Int = x+y

  def HigherOrder(f: (Int, Int) => Int, first: Int, second: Int): Int =  f(first, second)

}
object HigherOrder{

  def main(args: Array[String]): Unit = {

    val obj = new HigherOrder ()
    println(obj.HigherOrder(obj.sumofSquare, first= 5, second = 5))
      println(obj.HigherOrder(obj.sumofCubes, first = 7,second = 7))
    println(obj.HigherOrder(obj.sumofInt, first = 8, second = 8))


  }
}