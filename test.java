import simjava.print.Print;
import simjava.tuple.CreateTuple;
class test{
public static void main(String args[]){
String[] a={"hello","bro"};
byte[] k={3,4,5,6,127};
Print p=new Print();
p.printArray(k);
p.println("hello");

CreateTuple c=new CreateTuple();
System.out.println(typeof(c.createIntTuple(5)));
//p.printArray(arr);
float[] tuple2=c.createFloatTuple(6);
//System.out.println(typeof(c.printTuple(tuple2)));
c.printTuple(tuple2);


}


}
