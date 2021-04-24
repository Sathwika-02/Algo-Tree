/*


 Problem statement: Java program to check whether a string is Pangram or not.
  
 
   A pangram is a string that contains all the letters of the English alphabet.
   Example:"The quick brown fox jumps over a lazy dog"
   In this example all the alphabets from "a to z" are present.So it is a pangram.


*/

//Solution:
import java.util.*; 
public class Pangram{
public static void main(String[] args){
 
  String string;
  boolean flag=true; //Assuming the entered  string is pangram 
  char ch;
 
//Initialize  a count  array to store count of 26 alphabets 

  int count_var[]=new int[26];
  int i;

//To take input from user use scanner class
  
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a sentence/string:");
  string=sc.nextLine();

//Convert all characters in the string to Lowercase 

  string=string.toLowerCase();

//Iterate through the string and check whether all characters from "a-z" are present in the string and increment count_var value
  
   for(i=0;i<string.length();i++){
   ch=string.charAt(i);
   if(ch==' ')
   continue;
   if(ch>='a' && ch<='z'){
   count_var[ch-'a']++;
}
}
//checking if count_var array has any zeroes .
for(i=0;i<count_var.length;i++){
if(count_var[i]==0){ //If count_var has any zeroes, the given string  is not a pangram
flag=false;
break;
}
}
if(flag)
System.out.println("Given string is a Pangram");
else
System.out.println("Given string is not a Pangram");
}
}




*/

TimeComplexity:O(26*N)
Space complexity:O(1)

Example1:
   Enter a sentence/string: 
   Input: The quick brown fox jumps over a lazy dog
   Output: Given string is a Pangram.

Explanation: Here in the entered string "The quick brown fox jumps over a lazy dog" All the characters from "a-z" are present .So ,it is a pangram.

Example2: 
   Enter a sentence/string:
   Input:aBcdefGhijklmnopqrstuvwXYZ
   Output: Given string is a Pangram


Example3: 
    Enter a sentence/string :
    Input: My name is Ram
    Output: Given string is not a Pangram.


*/