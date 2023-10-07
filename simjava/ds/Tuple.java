package simjava.ds;
import java.util.Scanner;
public class Tuple{
int[] tupleInt=new int[1];
float [] tupleFloat=new float[1];
byte [] tupleByte=new byte[1];
short [] tupleShort=new short[1];
double[] tupleDouble=new double[1];
String[] tupleString=new String[1];


public int[] createIntTuple(int size){
tupleInt=new int[size];
Scanner sc=new Scanner(System.in);
String s="(";
for(int i=0;i<size;i++){
System.out.print("Enter "+(i+1)+" element : ");
int n=sc.nextInt();
tupleInt[i]=n;
if(i!=size-1)
s+=n+",";
else{
s+=n;
}
}
s+=")";
System.out.println(s);
return tupleInt;       
}



public String[] createStringTuple(int size){
tupleString=new String[size];
Scanner sc=new Scanner(System.in);
String s="(";
for(int i=0;i<size;i++){
System.out.print("Enter "+(i+1)+" element : ");
String n=sc.next();
tupleString[i]=n;
if(i!=size-1)
s+=n+",";
else{
s+=n;
}
}
s+=")";
System.out.println(s);
return tupleString;       
}


public float[] createFloatTuple(int size){
tupleFloat=new float[size];
Scanner sc=new Scanner(System.in);
String s="(";
for(int i=0;i<size;i++){
System.out.print("Enter "+(i+1)+" element : ");
float n=sc.nextFloat();
tupleFloat[i]=n;
if(i!=size-1)
s+=n+",";
else{
s+=n;
}
}
s+=")";
System.out.println(s);
return tupleFloat;       
}


public byte[] createByteTuple(int size){
tupleByte=new byte[size];
Scanner sc=new Scanner(System.in);
String s="(";
for(int i=0;i<size;i++){
System.out.print("Enter "+(i+1)+" element : ");
byte n=sc.nextByte();
tupleByte[i]=n;
if(i!=size-1)
s+=n+",";
else{
s+=n;
}
}
s+=")";
System.out.println(s);
return tupleByte;       
}






public short[] createShortTuple(int size){
tupleShort=new short[size];
Scanner sc=new Scanner(System.in);
String s="(";
for(int i=0;i<size;i++){
System.out.print("Enter "+(i+1)+" element : ");
short n=sc.nextShort();
tupleShort[i]=n;
if(i!=size-1)
s+=n+",";
else{
s+=n;
}
}
s+=")";
System.out.println(s);
return tupleShort;       
}


public double[] createDoubleTuple(int size){
tupleDouble=new double[size];
Scanner sc=new Scanner(System.in);
String s="(";
for(int i=0;i<size;i++){
System.out.print("Enter "+(i+1)+" element : ");
Double n=sc.nextDouble();
tupleDouble[i]=n;
if(i!=size-1)
s+=n+",";
else{
s+=n;
}
}
s+=")";
System.out.println(s);
return tupleDouble;       
}



public void printIntTuple(){
String s="(";

for(int i=0;i<tupleInt.length;i++){
if(i!=tupleInt.length-1)
s+=tupleInt[i]+",";
else{
s+=tupleInt[i];
}
}
s+=")";
System.out.println(s);

}

public void printStringTuple(){
String s="(";

for(int i=0;i<tupleString.length;i++){
if(i!=tupleString.length-1)
s+=tupleString[i]+",";
else{
s+=tupleString[i];
}
}
s+=")";
System.out.println(s);

}

public void printByteTuple(){
String s="(";

for(int i=0;i<tupleByte.length;i++){
if(i!=tupleByte.length-1)
s+=tupleByte[i]+",";
else{
s+=tupleByte[i];
}
}
s+=")";
System.out.println(s);

}


public void printShortTuple(){
String s="(";

for(int i=0;i<tupleShort.length;i++){
if(i!=tupleShort.length-1)
s+=tupleShort[i]+",";
else{
s+=tupleShort[i];
}
}
s+=")";
System.out.println(s);

}

public void printDoubleTuple(){
String s="(";

for(int i=0;i<tupleDouble.length;i++){
if(i!=tupleDouble.length-1)
s+=tupleDouble[i]+",";
else{
s+=tupleDouble[i];
}
}
s+=")";
System.out.println(s);

}
public void printFloatTuple(){
String s="(";

for(int i=0;i<tupleFloat.length;i++){
if(i!=tupleFloat.length-1)
s+=tupleFloat[i]+",";
else{
s+=tupleFloat[i];
}
}
s+=")";
System.out.println(s);

}




public int[] addIntTuple(Tuple tup){
int[] tup2=tup.tupleInt;
int s=tupleInt.length+tup2.length;
int[]copy=new int[s];
for(int i=0;i<tupleInt.length;i++){
copy[i]=tupleInt[i];
}
for(int i=tupleInt.length;i<tup2.length+tupleInt.length;i++){
copy[i]=tup2[i-tupleInt.length];

}
this.tupleInt=copy;
return tupleInt;
}


public int[] addIntTuple(int[] tup2){
int s=tupleInt.length+tup2.length;
int[]copy=new int[s];
for(int i=0;i<tupleInt.length;i++){
copy[i]=tupleInt[i];
}
for(int i=tupleInt.length;i<tup2.length+tupleInt.length;i++){
copy[i]=tup2[i-tupleInt.length];

}
this.tupleInt=copy;
return tupleInt;
}

public String[] addStringTuple(String[] tup2){
int s=tupleString.length+tup2.length;
String[]copy=new String[s];
for(int i=0;i<tupleString.length;i++){
copy[i]=tupleString[i];
}
for(int i=tupleString.length;i<tup2.length+tupleString.length;i++){
copy[i]=tup2[i-tupleString.length];

}
this.tupleString=copy;
return tupleString;
}



public float[] addFloatTuple(float[] tup2){
int s=tupleFloat.length+tup2.length;
float[]copy=new float[s];
for(int i=0;i<tupleFloat.length;i++){
copy[i]=tupleFloat[i];
}
for(int i=tupleFloat.length;i<tup2.length+tupleFloat.length;i++){
copy[i]=tup2[i-tupleFloat.length];

}
this.tupleFloat=copy;
return tupleFloat;
}


public double[] addDoubleTuple(double[] tup2){
int s=tupleFloat.length+tup2.length;
double[]copy=new double[s];
for(int i=0;i<tupleDouble.length;i++){
copy[i]=tupleDouble[i];
}
for(int i=tupleDouble.length;i<tup2.length+tupleDouble.length;i++){
copy[i]=tup2[i-tupleDouble.length];

}
this.tupleDouble=copy;
return tupleDouble;
}

public short[] addShortTuple(short[] tup2){
int s=tupleFloat.length+tup2.length;
short[]copy=new short[s];
for(int i=0;i<tupleShort.length;i++){
copy[i]=tupleShort[i];
}
for(int i=tupleShort.length;i<tup2.length+tupleShort.length;i++){
copy[i]=tup2[i-tupleShort.length];

}
this.tupleShort=copy;
return tupleShort;
}


public byte[] addByteTuple(byte[] tup2){
int s=tupleByte.length+tup2.length;
byte[]copy=new byte[s];
for(int i=0;i<tupleByte.length;i++){
copy[i]=tupleByte[i];
}
for(int i=tupleByte.length;i<tup2.length+tupleByte.length;i++){
copy[i]=tup2[i-tupleByte.length];

}
this.tupleByte=copy;
return tupleByte;
}




}
