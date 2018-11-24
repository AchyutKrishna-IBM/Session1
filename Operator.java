class Operator
{
public static void main(String[] args)
{
int a=20;
int b=10;
int c=a--;
int d=a>>2;
int e=a&b;
System.out.println("a:"+a);
System.out.println("b:"+(a-- - --a));
System.out.println("c:"+c);
System.out.println("d:"+d);
System.out.println("e:"+e);
}
}