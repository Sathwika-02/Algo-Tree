"""
Problem Statement: Python program to print pronic numbers in given range 
     
         A pronic number is a number which is the product of two consecutive integers, that is, a number of the form n(n + 1).
The first few pronic numbers are: 0, 2, 6, 12, 20, 30, 42, 56, etc.
First create a function named isPronicNumber() which determines whether given number is pronic or not .Then define a boolean variable
flag and set its value to false .Then iterate a loop from 1 to given number and check whether i*(i+1) is equal to given number for any value of i.
If match is found then set flag to true , break the loop and return value of flag. Then start a loop from given range and call isPronicNumber() method .
isPronicNumber() returns true which signifies that number is Pronnic ,then display that number.
"""
def isPronicNumber(number): 
   flag = False;    
   for i in range(1, number+1):    
#Multiply consecutive numbers to check for Pronic number   
        if((i*(i+1)) == number):    #If match is found set flag to true and return value of flag
            flag = True  
            break    
   return flag
   
#Take input from user
a=int(input("enter number 1:"))
b=int(input("enter number 2:"))
print("Pronic numbers between given range are  ");    
for i in range(a,b+1):    
    if(isPronicNumber(i)):    
        print(i,end=" ")

"""
Testcases:
Enter number 1: 1
Enter number 2: 100
Output: Pronic numbers between given range are 
2 6 12 20 30 42 56 72 90 

Enter number 1: 4
Enter number 2: 70
Output:Pronic numbers between given range are 
6 12 20 30 42 56 

TimeComplexity: O(n) where n is total numbers in range 
Space Complexity: O(1)
"""