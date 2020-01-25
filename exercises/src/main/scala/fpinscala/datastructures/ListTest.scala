package fpinscala.datastructures

import scala.util.{Try,Success,Failure}

object ListTest extends App {

  val ob1 = List(1,2,3,4,5)
  println(List.tail((ob1)))
  Try{List.tail(Nil)} match {
    case Success(value) => println(s"Its a success ${value}")
    case Failure(ex) => println(s"Exception thrown as ${ex.getMessage}")
  }

  println(List.setHead(ob1,0))
  println(List.setHead(Nil,1))

  println(List.drop(ob1,3))

  println("Test Drop While")
  println(List.dropWhile(List(2,4,6,8,9,10),(x:Int)=>x%2 == 0))
  println(List.dropWhile(List(2,4,6,8,12,10),(x:Int)=>x%2 == 0))

  println("Init test")
  println(List.init(List(1,2,3,4,5)))
  println(List.init(List(1)))

}
