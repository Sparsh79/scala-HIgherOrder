package edu.knoldus.com

class HigherOrder {
  def sumofSquare(x: Int, y: Int): Int = x*x + y*y
  def sumofCubes(x: Int, y: Int): Int = x*x*y + y*y*y
  def sumofInt(x: Int, y: Int): Int = x+y

  def HigherOrder(f: (Int, Int) => Int, first: Int, second: Int): Int =  f(first, second)

}
object HigherOrder{

  def main(args: Array[String]): Unit = {

    val obj = new HigherOrder ()
    println(obj.sumofSquare(x= 5, y= 5))
      println(obj.sumofCubes(x = 7, y = 7))
    println(obj.sumofInt(x = 8, y = 8))

  }
}
