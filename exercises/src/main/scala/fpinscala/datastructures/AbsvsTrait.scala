package fpinscala.datastructures

object AbsvsTrait extends App {

  trait Test1{
    def disp(x:Int):Int

    def impl(z:Int):Int={
      z+10
    }
  }
  //Abstract class can have constructor,trait cannot
  abstract class Test2(val x:Int){
    def disp(y:Int):Int

    def impl(z:Int):Int={
      z+x
    }
  }

  val ob1 = new Test1{
    def disp(x:Int)=x+10
  }

  val ob2 = new Test2(10){
    def disp(m:Int)= m+x
  }

  println(ob1.disp(20))
  println(ob2.disp(20))
}
