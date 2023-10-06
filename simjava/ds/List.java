package simjava.ds;
import java.util.Scanner;
public class List{
int[] listInt=new int[1];
float [] listFloat=new float[1];
byte [] listByte=new byte[1];
short [] listShort=new short[1];
double[] listDouble=new double[1];
String[] listString=new String[1];

public int[] createIntList(int size){
listInt=new int[size];
Scanner sc=new Scanner(System.in);
String s="[";
for(int i=0;i<size;i++){
System.out.print("Enter "+(i+1)+" element : ");
int n=sc.nextInt();
listInt[i]=n;
if(i!=size-1)
s+=n+",";
else{
s+=n;
}
}
s+="]";
System.out.println(s);
return listInt;       
}


public String[] createStringList(int size){
listString=new String[size];
Scanner sc=new Scanner(System.in);
String s="[";
for(int i=0;i<size;i++){
System.out.print("Enter "+(i+1)+" element : ");
String n=sc.next();
listString[i]=n;
if(i!=size-1)
s+=n+",";
else{
s+=n;
}
}
s+="]";
System.out.println(s);
return listString;       
}



public float[] createFloatList(int size){
listFloat=new float[size];
Scanner sc=new Scanner(System.in);
String s="[";
for(int i=0;i<size;i++){
System.out.print("Enter "+(i+1)+" element : ");
float n=sc.nextFloat();
listFloat[i]=n;
if(i!=size-1)
s+=n+",";
else{
s+=n;
}
}
s+="]";
System.out.println(s);
return listFloat;       
}


public byte[] createByteList(int size){
listByte=new byte[size];
Scanner sc=new Scanner(System.in);
String s="[";
for(int i=0;i<size;i++){
System.out.print("Enter "+(i+1)+" element : ");
byte n=sc.nextByte();
listByte[i]=n;
if(i!=size-1)
s+=n+",";
else{
s+=n;
}
}
s+="]";
System.out.println(s);
return listByte;       
}






public short[] createShortList(int size){
listShort=new short[size];
Scanner sc=new Scanner(System.in);
String s="[";
for(int i=0;i<size;i++){
System.out.print("Enter "+(i+1)+" element : ");
short n=sc.nextShort();
listShort[i]=n;
if(i!=size-1)
s+=n+",";
else{
s+=n;
}
}
s+="]";
System.out.println(s);
return listShort;       
}


public double[] createDoubleList(int size){
listDouble=new double[size];
Scanner sc=new Scanner(System.in);
String s="[";
for(int i=0;i<size;i++){
System.out.print("Enter "+(i+1)+" element : ");
Double n=sc.nextDouble();
listDouble[i]=n;
if(i!=size-1)
s+=n+",";
else{
s+=n;
}
}
s+="]";
System.out.println(s);
return listDouble;       
}



public void printIntList(){
String s="[";

for(int i=0;i<listInt.length;i++){
if(i!=listInt.length-1)
s+=listInt[i]+",";
else{
s+=listInt[i];
}
}
s+="]";
System.out.println(s);

}

public void printStringList(){
String s="[";

for(int i=0;i<listString.length;i++){
if(i!=listString.length-1)
s+=listString[i]+",";
else{
s+=listString[i];
}
}
s+="]";
System.out.println(s);

}

public void printByteList(){
String s="[";

for(int i=0;i<listByte.length;i++){
if(i!=listByte.length-1)
s+=listByte[i]+",";
else{
s+=listByte[i];
}
}
s+="]";
System.out.println(s);

}


public void printShortList(){
String s="[";

for(int i=0;i<listShort.length;i++){
if(i!=listShort.length-1)
s+=listShort[i]+",";
else{
s+=listShort[i];
}
}
s+="]";
System.out.println(s);

}

public void printDoubleList(){
String s="[";

for(int i=0;i<listDouble.length;i++){
if(i!=listDouble.length-1)
s+=listDouble[i]+",";
else{
s+=listDouble[i];
}
}
s+="]";
System.out.println(s);

}
public void printFloatList(){
String s="[";

for(int i=0;i<listFloat.length;i++){
if(i!=listFloat.length-1)
s+=listFloat[i]+",";
else{
s+=listFloat[i];
}
}
s+="]";
System.out.println(s);

}

// operation 



public int[] appendIntList(int num){
int s=listInt.length;
int[]copy=new int[s+1];
int k=0;
for(int i=0;i<s;i++){
copy[i]=listInt[i];
k+=1;
}
copy[s]=num;
this.listInt=copy;
return listInt;
}


public String[] appendStringList(String num){
int s=listString.length;
String[]copy=new String[s+1];
int k=0;
for(int i=0;i<s;i++){
copy[i]=listString[i];
k+=1;
}
copy[s]=num;
this.listString=copy;
return listString;
}


}
