package fpinscala.datastructures

sealed trait MyList[+A]

case object Nil extends MyList[Nothing]
case class MyCons[+A](head:A, tail:MyList[A]) extends MyList[A]

object MyList{
  def sum(xs:MyList[Int]): Int={
    xs match {
      case Nil => 0
      case MyCons(a, as:MyList[Int]) => a + sum(as)
    }
  }

  def product(xs:MyList[Double]): Double = {
    xs match {
      case Nil => 1.0
      case MyCons(0, as) => 0.0
      case MyCons(a, as) => a * product(as)
    }
  }

  def apply[A](xs: A*): MyList[A]={
    if (xs.isEmpty) Nil
    else MyCons(xs.head, apply(xs.tail:_*))
  }
}


object MyListRun extends App{
  val ob1 = MyList(1,2,3,4,5)
  println(ob1)

  val x = MyList(1,2,3,4,5) match {
    case MyCons(x, MyCons(2, MyCons(4, _))) => x
    case Nil => 42
    case MyCons(x, MyCons(y, MyCons(3, MyCons(4, _)))) => x + y
    case MyCons(h, t) => h + MyList.sum(t)
    case _ => 101
  }
  println(x)

}
