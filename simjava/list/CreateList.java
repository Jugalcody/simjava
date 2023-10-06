package simjava.list;
import java.util.Scanner;
public class CreateList{

public int[] createIntList(int size){
int[] arr=new int[size];
Scanner sc=new Scanner(System.in);
String s="[";
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
s+="]";
System.out.println(s);
return arr;       
}





public float[] createFloatList(int size){
float [] arr=new float[size];
Scanner sc=new Scanner(System.in);
String s="[";
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
s+="]";
System.out.println(s);
return arr;       
}


public byte[] createByteList(int size){
byte [] arr=new byte[size];
Scanner sc=new Scanner(System.in);
String s="[";
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
s+="]";
System.out.println(s);
return arr;       
}






public short[] createShortList(int size){
short [] arr=new short[size];
Scanner sc=new Scanner(System.in);
String s="[";
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
s+="]";
System.out.println(s);
return arr;       
}


public double[] createDoubleList(int size){
double[] arr=new double[size];
Scanner sc=new Scanner(System.in);
String s="[";
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
s+="]";
System.out.println(s);
return arr;       
}



public void printList(int[] list){
String s="[";

for(int i=0;i<list.length;i++){
if(i!=list.length-1)
s+=list[i]+",";
else{
s+=list[i];
}
}
s+="]";
System.out.println(s);

}

public void printList(String[] list){
String s="[";

for(int i=0;i<list.length;i++){
if(i!=list.length-1)
s+=list[i]+",";
else{
s+=list[i];
}
}
s+="]";
System.out.println(s);

}

public void printList(byte[] list){
String s="[";

for(int i=0;i<list.length;i++){
if(i!=list.length-1)
s+=list[i]+",";
else{
s+=list[i];
}
}
s+="]";
System.out.println(s);

}


public void printList(short[] list){
String s="[";

for(int i=0;i<list.length;i++){
if(i!=list.length-1)
s+=list[i]+",";
else{
s+=list[i];
}
}
s+="]";
System.out.println(s);

}

public void printList(double[] list){
String s="[";

for(int i=0;i<list.length;i++){
if(i!=list.length-1)
s+=list[i]+",";
else{
s+=list[i];
}
}
s+="]";
System.out.println(s);

}
public void printList(float[] list){
String s="[";

for(int i=0;i<list.length;i++){
if(i!=list.length-1)
s+=list[i]+",";
else{
s+=list[i];
}
}
s+="]";
System.out.println(s);

}

}
