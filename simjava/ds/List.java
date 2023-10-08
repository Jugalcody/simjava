package simjava.ds;
import java.util.Scanner;
public class List{
int[] listInt=new int[1];
float [] listFloat=new float[1];
byte [] listByte=new byte[1];
short [] listShort=new short[1];
double[] listDouble=new double[1];
String[] listString=new String[1];


public int[] listInt(){ return listInt;}
public float[] listFloat() {return listFloat;}
public double[] listDouble() {return listDouble;}
public String[] listString() {return listString;}
public short[] listShort() {return listShort;}
public byte[] listByte() {return listByte;}

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



public String getIntList(){
String s="[";

for(int i=0;i<listInt.length;i++){
if(i!=listInt.length-1)
s+=listInt[i]+",";
else{
s+=listInt[i];
}
}
s+="]";
return s;
}

public String getStringList(){
String s="[";

for(int i=0;i<listString.length;i++){
if(i!=listString.length-1)
s+=listString[i]+",";
else{
s+=listString[i];
}
}
s+="]";
return s;
}

public String getByteList(){
String s="[";

for(int i=0;i<listByte.length;i++){
if(i!=listByte.length-1)
s+=listByte[i]+",";
else{
s+=listByte[i];
}
}
s+="]";
return s;
}


public String getShortList(){
String s="[";

for(int i=0;i<listShort.length;i++){
if(i!=listShort.length-1)
s+=listShort[i]+",";
else{
s+=listShort[i];
}
}
s+="]";

return s;
}

public String getDoubleList(){
String s="[";

for(int i=0;i<listDouble.length;i++){
if(i!=listDouble.length-1)
s+=listDouble[i]+",";
else{
s+=listDouble[i];
}
}
s+="]";
return s;
}

public String getFloatList(){
String s="[";

for(int i=0;i<listFloat.length;i++){
if(i!=listFloat.length-1)
s+=listFloat[i]+",";
else{
s+=listFloat[i];
}
}
s+="]";
return s;
}

// operation 



public int[] appendIntList(int num){
int s=listInt.length;
int[]copy=new int[s+1];
for(int i=0;i<s;i++){
copy[i]=listInt[i];
}
copy[s]=num;
this.listInt=copy;
return listInt;
}


public String[] appendStringList(String num){
int s=listString.length;
String[]copy=new String[s+1];
for(int i=0;i<s;i++){
copy[i]=listString[i];
}
copy[s]=num;
this.listString=copy;
return listString;
}


public short[] appendShortList(short num){

int s=listShort.length;
short[]copy=new short[s+1];
for(int i=0;i<s;i++){
copy[i]=listShort[i];
}
copy[s]=num;
this.listShort=copy;
return listShort;
}

public float[] appendFloatList(float num){
int s=listFloat.length;
float[]copy=new float[s+1];
for(int i=0;i<s;i++){
copy[i]=listFloat[i];
}
copy[s]=num;
this.listFloat=copy;
return listFloat;
}

public double[] appendDoubleList(double num){
int s=listDouble.length;
double[]copy=new double[s+1];
for(int i=0;i<s;i++){
copy[i]=listDouble[i];
}
copy[s]=num;
this.listDouble=copy;
return listDouble;
}

public byte[] appendByteList(byte num){
int s=listByte.length;
byte[]copy=new byte[s+1];
for(int i=0;i<s;i++){
copy[i]=listByte[i];
}
copy[s]=num;
this.listByte=copy;
return listByte;
}


//remove element

public int popIntList(){
int s=listInt.length;
int num=listInt[s-1];
int[]copy=new int[s-1];
for(int i=0;i<s-1;i++){
copy[i]=listInt[i];
}

this.listInt=copy;
return num;
}


public int popShortList(){
int s=listShort.length;
short num=listShort[s-1];
short[]copy=new short[s-1];
for(int i=0;i<s-1;i++){
copy[i]=listShort[i];
}

this.listShort=copy;
return num;
}




public float popFloatList(){
int s=listFloat.length;
float num=listFloat[s-1];
float[]copy=new float[s-1];
for(int i=0;i<s-1;i++){
copy[i]=listFloat[i];
}

this.listFloat=copy;
return num;
}


public byte popByteList(){
int s=listByte.length;
byte num=listByte[s-1];
byte[]copy=new byte[s-1];
for(int i=0;i<s-1;i++){
copy[i]=listByte[i];
}

this.listByte=copy;
return num;
}



public double popDoubleList(){
int s=listDouble.length;
double num=listDouble[s-1];
double[]copy=new double[s-1];
for(int i=0;i<s-1;i++){
copy[i]=listDouble[i];
}

this.listDouble=copy;
return num;
}



public String popStringList(){
int s=listString.length;
String num=listString[s-1];
String[]copy=new String[s-1];
for(int i=0;i<s-1;i++){
copy[i]=listString[i];
}

this.listString=copy;
return num;
}


//insert into some index

//int list insert method
public void insert(int[] list,int num,int index){

int[] newlist=new int[list.length+1];
for(int i=0;i<index;i++){
newlist[i]=list[i];
}
newlist[index]=num;
for(int i=index+1;i<newlist.length;i++){
newlist[i]=list[i-1];
}
this.listInt=newlist;
}

//byte list insert method
public void insert(byte[] list,byte num,int index){

byte[] newlist=new byte[list.length+1];
for(int i=0;i<index;i++){
newlist[i]=list[i];
}
newlist[index]=num;
for(int i=index+1;i<newlist.length;i++){
newlist[i]=list[i-1];
}
this.listByte=newlist;
}

// string list insert method



public void insert(String[] list,String num,int index){

String[] newlist=new String[list.length+1];
for(int i=0;i<index;i++){
newlist[i]=list[i];
}
newlist[index]=num;
for(int i=index+1;i<newlist.length;i++){
newlist[i]=list[i-1];
}
this.listString=newlist;
}

// short list insert method


public void insert(short[] list,short num,int index){

short[] newlist=new short[list.length+1];
for(int i=0;i<index;i++){
newlist[i]=list[i];
}
newlist[index]=num;
for(int i=index+1;i<newlist.length;i++){
newlist[i]=list[i-1];
}
this.listShort=newlist;
}

// float list insert method



public void insert(float[] list,float num,int index){

float[] newlist=new float[list.length+1];
for(int i=0;i<index;i++){
newlist[i]=list[i];
}
newlist[index]=num;
for(int i=index+1;i<newlist.length;i++){
newlist[i]=list[i-1];
}
this.listFloat=newlist;
}

// double list insert method

public void insert(double[] list,double num,int index){

double[] newlist=new double[list.length+1];
for(int i=0;i<index;i++){
newlist[i]=list[i];
}
newlist[index]=num;
for(int i=index+1;i<newlist.length;i++){
newlist[i]=list[i-1];
}
this.listDouble=newlist;
}



// remove from an index


public void remove(int[] list,int index){

for(int i=index;i<list.length-1;i++){

list[i]=list[i+1];
}

list[list.length-1]=0;

}


public void remove(short[] list,int index){  //short

for(int i=index;i<list.length-1;i++){

list[i]=list[i+1];
}

list[list.length-1]=0;

}



public void remove(float[] list,int index){  //float 

for(int i=index;i<list.length-1;i++){

list[i]=list[i+1];
}

list[list.length-1]=0;

}


public void remove(double[] list,int index){  //double

for(int i=index;i<list.length-1;i++){

list[i]=list[i+1];
}

list[list.length-1]=0;

}


public void remove(byte[] list,int index){  //byte

for(int i=index;i<list.length-1;i++){

list[i]=list[i+1];
}

list[list.length-1]=0;

}


public void remove(String[] list,int index){  //String

for(int i=index;i<list.length-1;i++){

list[i]=list[i+1];
}

list[list.length-1]=null;

}

}
