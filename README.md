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
The profit percentage needs to be printed correct to 2 decimal places. 
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
a.	Item 1 price as floating point 
b.	Item 2 price as floating point 
c.	Discount as integer 
Output Format: 
a.	Total of Item 1 and Item 2 
b.	Price after discount (correct to 2 decimal places) 
c.	Amount discounted (correct to 2 decimal places) 
Sample Input and Output Format: 
Price of item 1 : 
20.50 
Price of item 2 : 
45.40 
Discount in percentage : 
10 
Total amount : $65.90 
Discounted amount : $59.31 
Saved amount : $6.59 

26. Lab Allocation 
There are 3 labs in the CSE department (L1, L2 and L3) with a seating capacity of x, y and z. Find the lab which has the minimal seating capacity. 
Input and Output Format: 
Assume that x, y and z are always distinct. 
Refer sample input and output. 
Sample Input and Output 1: 
x 
30 
y 
40 
z 
20 
L3 has the minimal seating capacity 

27. Compare 2 Integers 
Write a program to relate 2 integers entered by the user as equal to, less than or greater than. 
Input and Output Format: 
Input consists of 2 integers. 
Sample Input and Output 1: 
Enter the first number 
6 
Enter the second number 
8 
6 is less than 8 
Sample Input and Output 2: 
Enter the first number 
8 
Enter the second number 
6 
8 is greater than 6 
Sample Input and Output 3: 
Enter the first number 
8 
Enter the second number 
8 
8 is equal to 8 

28. Secure URL 
Write a program to check whether the given URL is secure. 
Example: 
Secure URL: https://www.amazon.com/ 
Sample Input and Output 1: 
Enter the string 
http://www.amazon.com/ 
Enter the start string 
https 
"http://www.amazon.com/" does not start with "https" 
Sample Input and Output 2: 
Enter the string 
https://www.amazon.com/ 
Enter the start string 
https 
"https://www.amazon.com/" starts with "https" 

29. Replace Organization Name 
This program is to illustrate the use of the method replace() defined in the string API.
Two companies enter into a Marketing Agreement and they prepare an Agreement Draft. After that one of the companies changes its name. The name changes need to be made in the Agreement Draft as well. Write a program to perform the name changes in the agreement draft.
Sample Input and Output :
Enter the content of the document
ITT is a private organisation. ITT is a product based company. DBox is a ITT product
Enter the old name of the company
ITT
Enter the new name of the company
TTT
The content of the modified document is
TTT is a private organisation. TTT is a product based company. DBox is a TTT product

30. Day of the Week (Using direct Array initialization) 
Write a program to find the day of the week for the day number given. 1 should return Sun, 2 should return Mon, etc. 
Note: 
Declare and Initialize array in a single line using curly braces. 
Sample Input and Output: 
Enter the day number
3 
Day of the week is Tue 

31. Day of the Week (Using new keyword)
Write a program to find the day of the week for the day number given. 1 should return Sun, 2 should return Mon, etc. 
Note:
Declare and Initialize array elements using new keyword.
Sample Input and Output: 
Enter the day number
3 
Day of the week is Tue 

32. The Red Cross (for loop) 
On an event of a natural calamity, Red Cross is responsible to present the accurate details of the number of people who were rescued and sought refuge in the camps.  
Write a program to facilitate Red Cross authorities record the total number of refugees from each tent of the camps given the number of tents.  
Note: 
•	Use integer array to store the number of refugees present in each tent. 
•	Use for loop to store people count in tent and calculate the total number of people.  
 
Input Format: 
First line of the input is an integer value that corresponds to the number of tents in the camp. 
The next n lines of input contains the number of refugees staying in each of the tents. 
Output Format: 
Output should print the total number of citizens present in the camp. 
Sample Input and Output: 
5 
10 
12 
30 
12 
12 
76 

33. Refer 32 The Red Cross  (while loop) 

34. Refer 32 The Red Cross (for-each loop) 

35. Refer 24 Profit and Loss (Using Methods) 
 
Note: 
•	Use methods to modularize the program coded earlier for this problem statement. 
•	Create a method calculateProfit() with the below mentioned signature. 
                  public float calculateProfit(int dozenCount, int pricePerDozen,  int sellPrice) 
•	Invoke this method from the main method. 
 
36. Product Details (Class and Instance) 
 
Create a class named Product with the following private member variables. 
•	id of type Long 
•	productName of type String 
•	supplierName of type String 

Include appropriate getters and setters. 
Create another class and write a main method to perform the following steps: 
1.	Read the input 
2.	Create instance of Product and set the values into Product instance using setter methods. 
3.	Display the output as listed in the sample Output/Input using getter methods. 

Sample Input and Output: 
Enter the product id 
1 
Enter the product name 
Printer 
Enter the supplier name 
HP 
Product Id is 1 
Product Name is Printer 
Supplier Name is HP 
 
37. Product Details (Constructors) 

Create a class named Product with the following private member variables. 
•	id of type Long 
•	productName of type String 
•	supplierName of type String 
Include appropriate getters and setters. 
Include a 3-argument constructor and a default constructor. 
Create a method “void display()” to display the product details. 
Create another class and write a main method to perform the following steps: 
.	Read the input 
.	Create instance of Product using 3 argument constructor. 

Sample Input and Output : 
Enter the product id 
1 
Enter the product name 
Printer 
Enter the supplier name 
HP 
Product Id is 1 
Product Name is Printer 
Supplier Name is HP 


38. Display Trainee Details 
 
Write a program to read and display the Trainee details for the batch CHNFSD. 
 
Read the following Trainee details from the user: 
•	Employee Id 
•	Name 
 
Display the following details to the user: 
•	Employee Id 
•	Name 
•	Batch Code 
 
Note: 
•	Create a Class Trainee with instance variables employeeId and name with appropriate constructor and getter / setters. 
•	Declare and initialize static variable BATCH_CODE in Trainee class as mentioned below. 
                  private static final String BATCH_CODE = “CHNFSD”; 
•	Create a method display() in Trainee class to display the details to the user. 
•	In each Java class the code should be organized in such a way the declarations are done in the order specified below. Please ensure that this order is organized in this class. static variables 
o	instance variables 
o	constructors 
o	getters and setters 
o	other methods 
•	Create a class Main which does the following: 
o	Read the number of Trainees details to be read 
o	Read each Trainee employeeId and name. 
o	Create an instance of Trainee class and invoke the display() method. 
Sample Input and Output: 
Enter the number of Trainees  
2 
Enter Employee Id
969143 
Enter Name
John 
Enter Employee Id 
969144 
Enter Name 
Priya 
969143 John CHNFSD 
969144 Priya CHNFSD 

39. Account Transactions 
 
Write a program to allow users to perform the following transactions on their bank account. 
•	Deposit 
•	Withdraw 
Display the balance amount after the completion of each transaction. 
 
Note: 
•	Create a class called Account with 2 private member variables 
o	accountNumber of type String 
o	balance of type int 
•	Include 2 argument constructor. 
•	Include getter / setter method for accountNumber. 
•	Include only getter for balance. 
•	Create a method deposit() based on below method signature. Add transactionAmount to the balance instance variable. 
public void deposit(int transactionAmount) 
•	Create another method withdraw() which reduces the balance amount based on the transactionAmount. If the balances go below zero after withdrawal, then the transaction should not be performed, and the earlier balance should be retained. This method displays insufficient balance when the balance is about to go below zero. 
public void withdraw(int transactionAmount) 

Sample Input and Output1: 
Enter the Account Number 
1000321 
Enter the Account Balance 
5000 
Enter 1 to deposit an amount, 2 to withdraw an amount 
1 
Enter the amount to deposit 
1000 
Your balance after the transaction is: 6000 
 
Sample Input and Output2: 
Enter the Account Number 
1000321 
Enter the Account Balance 
5000 
Enter 1 to deposit an amount, 2 to withdraw an amount 
2 
Enter the amount to withdraw 
1000 
Your balance after the transaction is: 4000 

Sample Input and Output3: 
Enter the Account Number 
1000321 
Enter the Account Balance 
5000 
Enter 1 to deposit an amount, 2 to withdraw an amount 
2
Enter the amount to withdraw
10000 
Insufficient Balance 
Your balance after the transaction is: 5000 

40. Area of a Shape 
Write a program to calculate the area of the given shape using a menu driven application. 
Create a base class called Shape. 
Data members: 
protected String shapeName; 
Methods: 
calculateArea() –Return type of this method is Double. This method should return the value 0.   
Constructor: 
Create a single argument constructor that initializes the shapeName. 
 
Create a class called Square that extends Shape 
Data members: 
side – of type Integer. 
Methods: 
calculateArea() – calculates and returns the area of the square. The return type of this method is Double. 
Constructor: 
Create a constructor that initializes the side. (1-argument constructor).  
Call the super class constructor to initialize the shapeName as "Square". 
 
Create a class called
Rectangle that extends Shape 
Data members: 
length – of type Integer. 
breadth – of type Integer. 
Methods: 
calculateArea() – calculates and returns the area of the Rectangle. The return type of this method is Double. 
Constructor: 
Create a constructor that initializes the length and breadth. (2-argument constructor).  
Call the super class constructor to initialize the shapeName as "Rectangle".
 
Create a class called Circle that extends Shape 
Data members: 
radius – of type Integer. 
Methods: 
calculateArea() – calculates and returns the area of the Circle. The return type of this method is Double. 
Constructor: 
Create a constructor that initializes the radius. (1-argument constructor).  
Call the super class constructor to initialize the shapeName as "Circle". 
 Include appropriate getters and setters in all the given classes. 
Create a class Main to capture the input details from the user and display the calculated area to the user. 

Sample Input and Output 1: 
1.Rectangle 2.Square 3.Circle 
Area Calculator --- Choose your shape 
1 
Enter length and breadth: 
100 
40 
Area of Rectangle is:4000.00 

Sample Input and Output 2: 
1.Rectangle 2.Square 3.Circle 
Area Calculator --- Choose your shape 
2 
Enter side: 
20 
Area of Square is:400.00 

Sample Input and Output 3: 
1.Rectangle 2.Square 3.Circle 
Area Calculator --- Choose your shape 
3 
Enter Radius: 
5 
Area of Circle is:78.54

41. Area of a Shape (Runtime Polymorphism) 
We are enhancing the Area of a Shape to support calculation of area for Hexagon. 

Area of a Hexagon needs to be calculated, but the formula to calculate area is not known at the time of implementation. Hence, we are required to create the class Hexagon and not implement any method for calculating the area. 
Copy and paste all the classes available in the previous “Area of a Shape” program. Create a new class named Hexagon as per the specifications mentioned below. 
Note: 
Create a class called Hexagon that extends Shape 
Data members: 
side – of type Integer. 
Constructor: 
Create a constructor that initializes the side. (1-argument constructor).  
Call the super class constructor to initialize the shapeName as "Hexagon". 
Include appropriate getters and setters in all the given classes. 
Create a class Main to capture the input details from the user and display the calculated area to the user. 
 
Sample Input and Output 1: 
A. Rectangle 
B. Square 
C. Circle 
D. Hexagon 
Area Calculator --- Choose your shape 
D 
Enter Side: 
20 
Area of Hexagon is: 0.00 

42. Cricket Commentary Automation 
Hope you would have used a cricket website that provides a ball by ball text commentary. Write a program to automate the text messages for each delivery. 
Initially we must automate the below two display variations: 
Option 1: Batsman and Bowler details of the delivery 
Option 2: Number of runs scored in the delivery 
Based on user’s input, either the Option 1 or Option 2 details will be displayed to the user. 
 Note: 
Create a class named Delivery. 
There are no attributes in this class. 
 Include the following methods in the Delivery class. 
•	void displayDeliveryDetails(String bowler, String batsman) --- In this method, print the last names of the bowler and batsman of that particular delivery. 
•	void displayDeliveryDetails(Long runs) --- In this method, display the run details of that delivery. If the number of runs scored in that delivery is 6 or 4 then display “It is a Sixer.” or “It is a boundary.” along with the number of runs, else print only the number of runs. 
Create a Main class to read the user inputs and invoke the displayDeliveryDetails() with appropriate parameters. 

Sample Input and Output 1: 
Menu 
1.Player details of the delivery 
2.Run details of the delivery 
1 
Enter the bowler name 
Ravichandran Aswin 
Enter the batsman name 
Virat Kohli 
Player details of the delivery: 
Bowler : Ashwin 
Batsman : Kohli 
  
Sample Input and Output 2: 
Menu 
1.Player details of the delivery 
2.Run details of the delivery 
2 
Enter the number of runs 
2 
Number of runs scored in the delivery : 2 
 Sample Input and Output 3: 
Menu 
1.Player details of the delivery 
2.Run details of the delivery 
2 
Enter the number of runs 
4 
Number of runs scored in the delivery : 4 
It is a boundary. 











