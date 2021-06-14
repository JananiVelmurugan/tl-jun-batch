Exercises
1. Create a calculator class to perform addition, subtraction, multiplication and division of two integers. Get inputs from command line/program arguments.
2. Find the number of vowels in a given string             
   Input1:”NewyorkE”
   'e' or 'E' - it should be counted as 1
   Output1:2
   Hint:irrespective of case
3. Find the sum of maximum and minimum number from a given input array
   Input:{19,17,12}
   max - 19
   min - 12
   sum - 31
   Output:31
4. Find the number of words are of given length
   Input1:{“aa”,”b”,”cc”,”ddd”}
   Input2:2
   Output1:2
   
   Input1:{“aa”,”b”,”cc”,”ddd”}
   Input2:1
   Output1:1
   
   Input1:{“aa”,”b”,”cc”,”ddd”}
   Input2:3
   Output1:1
5. Find the sum of the numbers in the given input string array
   Input:{“2AA”,”12”,”ABC”,”c1a”)
   Output:6 (2+1+2+1)
   Note in the above array 12 must not considered as such it must be considered as 1,2

6. Convert String array to String
   String[] input1=["Vikas","Lokesh",Ashok]
   Expected output String: "Vikas,Lokesh,Ashok"

7. Email Validation. Output is false if the validation fails else true.
   String input1="test@gmail.com"
                1)@ & : should be present;
                2)@ & . should not be repeated;
                3)there should be four charcters between @ and .;
                4)there shouls be atleast 3 characters before @ ;
                5)the end of mail id should be .com;
   Expected Output=true

8. Square root calculation
   ((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2))
   o/p should be rounded of to int;
   Sample input:
   double x1=5;
   double x2=6;
   double y1=8;
   double y2=3;
   output : 15
9. Calculate whether given year as leap or not;
   Sample input: int year = 2020;
   Sample output: boolean isLeapYear = true;

10. Find A union B
	Sample input: int[] a={1,2,3,4};
				  int[] b={3,4,5,6};
	Sample output: int[] c={1,2,3,4,5,6}

11. Find A interscetion B
	Sample input: int[] a={1,2,3,4};
				  int[] b={3,4,5,6};
	Sample output: int[] c={3,4}

12. Find (A union B) - (A intersection B)
	Sample input: int[] a={1,2,3,4};
				  int[] b={3,4,5,6};
				  a union b = {1,2,3,4,5,6}
				  a intersection b = {3,4}
				  (a union b) - (a intersection b) = {1,2,5,6}
	Sample output: int[] c={1,2,5,6}

13. Convert decimal to binary
	Sample input : 12 
	Sample output : 1100
	
14. Concatenate the character in a given position. 
	If there is no character in a given position place "$" sign.
	input1[]={"abc","da","ram"};
    input2=3; 
	hint : 
	3rd character is "c" in "abc"
	3rd character is not present in "da", so place "$"
	3rd character is "m" in "ram" 
	concate all the characters to a single string "c$m"
    o/p string ="c$m";

15. Display unique characters in a string.
	input:"helloworld"
	output:"helowrd"

16. Given a method with two strings as input. Write code to modify the first string such that all characters are replace by plus sign(=) except the characters which are present in the second string. That is, if one or more characters of first string appear in second string, they will not be replace by +. Return the modified string as output. Note-ignore case.

Example:
input1 = New York
input2 = New Jersy
output = New Y+r+

17. Given a method with a string input. Write code to encrypt the given string using following rules and return the encrypted string:

a. Replace the character at odd positions by next character in alphabet
b. Leave the characters at even positions unchanged

Note:
* if an odd position character is 'z' replace it by 'a'
* assume the first character in the string is at position 1

Example
input = curiosity
output = dusipsjtz

18. Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5.
* Method Name - calculateSum
* Argument - int n
* Return Type - int sum
* Logic - Calculate the sum of first n natural numbers which are divisible by 3 or 5.

19. Create a class with a method to find the difference between the sum of the squares and the square of the sum of the first n natural numbers.
* Method Name - calculateDifference
* Argument - int n
* Return Type - int sum
* Logic - Find the difference between the sum of the squares of the first n natural numbers and the square of their sum.
For Example if n is 10,you have to find
(1^2+2^2+3^2+….9^2+10^2)-
(1+2+3+4+5…+9+10)^2

20. Create a class containing a method to create the mirror image of a String. The method should return the two Strings separated with a pipe(|) symbol .
* Method Name - getImage
* Argument - String
* Return Type - String
* Logic - Accepts One String. Find the mirror image of the String. Add the two Strings together separated by a pipe(|) symbol.
For Example
Input : EARTH
Output : EARTH|HTRAE

21. Given a method with an int array. Write code to find the power of each individual element according to its position index, add them up and return as output.
Example:
input = {3,6,2,1}
output = (3)0+(6)1+(2)2+(1)3 = 1+6+4+1=12

22. Given a method with a string input. Write code to test if first and last characters are same. Incase they are same return 1 else return -1 as output. Note: consider case.
Example:
input = "the picture was great"
(first character = 't', last character = 't')
output = 1

23. Profit Calculation 
Inorder to calculate profit percentage of the Electronic gadgets sold in a store, you need to store the buying price and selling price of the gadgets.
Write a program to store the buying price and selling price of the products and print the values to the console.
Note:
•	Create the variables buyingPrice,sellingPrice
•	Assign the variables with values for buying price as 20.54 and selling price as 30.50
Sample Output: 
Buying price is 20.54
Selling price is 30.50

24. Profit and Loss 
Sam purchased x dozens of toys at the rate of Rs. y per dozen. He sold each one of them at the rate of Rs. z. Can you please help him out percentage of profit? 
Given the values of x, y and z, write a program to compute Sam's profit percentage. 
Example: 
Dozens of toys purchased (x) = 20 
Rate per dozen (y) = Rs. 375 
Selling price per toy (z) = Rs. 33 
Cost Price of 1 toy = 375/12 = Rs. 31.25 
Selling Price of 1 toy = Rs.33 
Profit = 33 - 31.25 = Rs. 1.75 
Profit % = 1.75 / 31.25 * 100 = 5.6% 
Input Format: 
Input consists of 3 integers – x, y and z. 
x - Number of dozens purchased. 
y - Cost per dozen. 
z - Selling price per item. 
Output Format: 
Refer Sample Input and Output for formatting details. The profit percentage needs to be printed correct to 2 decimal places. 
Sample Input and Output: 
number of dozens of toys purchased 
20 
price per dozen 
375 
selling price of 1 toy 
33 
Sam's profit percentage is 5.60 percent 

25. Discount Calculation 
Calculate the discount based on the price of two items and the overall discount percentage. 
Input Format: 
1.	Item 1 price as floating point 
2.	Item 2 price as floating point 
3.	Discount as integer 
Output Format: 
1.	Total of Item 1 and Item 2 
2.	Price after discount (correct to 2 decimal places) 
3.	Amount discounted (correct to 2 decimal places) 
Sample Input and Output Format: 
Sample Input and Output: 
Price of item 1 : 
20.50 
Price of item 2 : 
45.40 
Discount in percentage : 
10 
Total amount : $65.90 
Discounted amount : $59.31 
Saved amount : $6.59 




