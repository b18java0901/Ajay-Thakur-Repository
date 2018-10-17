
class A  //super/parent/base
{
 A()
 {
 System.out.println("in parent class default constructor");
 }
A(int x)
{
System.out.println("in parent class overloaded constructor");
}
void sum(int x, int y)
{
System.out.println("Parent class method");
System.out.println(x+y);
}
void disp()
{
System.out.println("hello");
}
}




class B extends A//sub/child/derived
{
B()
{
System.out.println("in Child class constructor");
}
B(String y)
{super(10);
System.out.println("in Child class overloaded constructor");
}
void show()
{
System.out.println("hi");
//disp();
}
}




