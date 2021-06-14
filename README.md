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






