class test1
{
static int a=10;
static int b;
static void print()
{
System.out.println(a);
System.out.println(b);
}

/*static void print()
{
System.out.println("static....");
b=a*20;
}*/
public static void main(String[] args) {
test ob1=new test();
System.out.println("main");
print();
}
}
