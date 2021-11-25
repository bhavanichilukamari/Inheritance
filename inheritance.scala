
class A{
  def add(): Unit ={
    println("hello")
  }
}
//CHILD CLASS INHERITING PARENT CLASS
class B extends A{
  def sub(): Unit ={
    println("hello world")
  }
}
//MULTI LEVEL INHERITANCE
class C extends B{
  def mul(): Unit ={
    println("world hello")
  }
}
// When we to access only the class of A and C leaving B then write a class  C extends A where we can access the methods of C and A  
object inheritance extends App {
 val obj = new C
  obj.add
  obj.sub
  obj.mul
}
