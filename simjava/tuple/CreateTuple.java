package simjava.tuple;
import java.util.Scanner;
public class CreateTuple{

public int[] createIntTuple(int size){
int[] arr=new int[size];
Scanner sc=new Scanner(System.in);
String s="(";
for(int i=0;i<size;i++){
System.out.print("Enter "+(i+1)+" element : ");
int n=sc.nextInt();
arr[i]=n;
if(i!=size-1)
s+=n+",";
else{
s+=n;
}
}
s+=")";
System.out.println(s);
return arr;       
}





public float[] createFloatTuple(int size){
float [] arr=new float[size];
Scanner sc=new Scanner(System.in);
String s="(";
for(int i=0;i<size;i++){
System.out.print("Enter "+(i+1)+" element : ");
float n=sc.nextFloat();
arr[i]=n;
if(i!=size-1)
s+=n+",";
else{
s+=n;
}
}
s+=")";
System.out.println(s);
return arr;       
}


public byte[] createByteTuple(int size){
byte [] arr=new byte[size];
Scanner sc=new Scanner(System.in);
String s="(";
for(int i=0;i<size;i++){
System.out.print("Enter "+(i+1)+" element : ");
byte n=sc.nextByte();
arr[i]=n;
if(i!=size-1)
s+=n+",";
else{
s+=n;
}
}
s+=")";
System.out.println(s);
return arr;       
}






public short[] createShortTuple(int size){
short [] arr=new short[size];
Scanner sc=new Scanner(System.in);
String s="(";
for(int i=0;i<size;i++){
System.out.print("Enter "+(i+1)+" element : ");
short n=sc.nextShort();
arr[i]=n;
if(i!=size-1)
s+=n+",";
else{
s+=n;
}
}
s+=")";
System.out.println(s);
return arr;       
}


public double[] createDoubleTuple(int size){
double[] arr=new double[size];
Scanner sc=new Scanner(System.in);
String s="(";
for(int i=0;i<size;i++){
System.out.print("Enter "+(i+1)+" element : ");
Double n=sc.nextDouble();
arr[i]=n;
if(i!=size-1)
s+=n+",";
else{
s+=n;
}
}
s+=")";
System.out.println(s);
return arr;       
}



public void printTuple(int[] tuple){
String s="(";

for(int i=0;i<tuple.length;i++){
if(i!=tuple.length-1)
s+=tuple[i]+",";
else{
s+=tuple[i];
}
}
s+=")";
System.out.println(s);

}

public void printTuple(String[] tuple){
String s="(";

for(int i=0;i<tuple.length;i++){
if(i!=tuple.length-1)
s+=tuple[i]+",";
else{
s+=tuple[i];
}
}
s+=")";
System.out.println(s);

}

public void printTuple(byte[] tuple){
String s="(";

for(int i=0;i<tuple.length;i++){
if(i!=tuple.length-1)
s+=tuple[i]+",";
else{
s+=tuple[i];
}
}
s+=")";
System.out.println(s);

}


public void printTuple(short[] tuple){
String s="(";

for(int i=0;i<tuple.length;i++){
if(i!=tuple.length-1)
s+=tuple[i]+",";
else{
s+=tuple[i];
}
}
s+=")";
System.out.println(s);

}

public void printTuple(double[] tuple){
String s="(";

for(int i=0;i<tuple.length;i++){
if(i!=tuple.length-1)
s+=tuple[i]+",";
else{
s+=tuple[i];
}
}
s+=")";
System.out.println(s);

}
public void printTuple(float[] tuple){
String s="(";

for(int i=0;i<tuple.length;i++){
if(i!=tuple.length-1)
s+=tuple[i]+",";
else{
s+=tuple[i];
}
}
s+=")";
System.out.println(s);

}

}
