/*
* Author: Zack Hunter
* Date: 1/23/2017
* Description: The program allows for the user to input values for an ArrayList and then provides several services
* 			   for the ArrayList
* */

import java.util.Scanner;
import java.util.ArrayList; 

public class ArrayListProject
{
	public static void main(String[] args)
	{
		ArrayList <Integer> list = new ArrayList <Integer> ();
		System.out.println("It's time to add 10 integers!");
		populateList(list);
		boolean looping = true;
		while (looping)
		{//the menu
			System.out.println("Menu: ");
			System.out.println("	1. Display Numbers");
			System.out.println("	2. Display Reversed");
			System.out.println("	3. Display Sum");
			System.out.println("	4. Display Average");
			System.out.println("	5. Display Maximum");
			System.out.println(" 	6. Search for a Value");
			System.out.println(" 	7. Insert New Value");
			System.out.println(" 	8. Reset Values");
			System.out.println(" 	9. Quit");
			System.out.print("Enter for an option: ");
			Scanner in = new Scanner(System.in);
			
			if (!in.hasNextInt())//if a non integer value is entered
			{
				System.out.println("That was not a valid entry");
			}
			else
			{
				int num = in.nextInt();
				if (num == 1)
				{
					displayNumbers(list);
				}
				else if (num == 2)
				{
					displayReversed(list);
				}
				else if (num == 3)
				{
					System.out.println("The sum is : " + computeSum(list));
				}
				else if (num == 4)
				{
					double average = (double)computeSum(list) / list.size();//calculates average value of the list as a double
					System.out.println("The average is: " + average);
				}
				else if (num == 5)
				{
					System.out.println("The max is: " + displayMax(list));
				}
				else if (num == 6)
				{//finds the value that is requested by the user and also checks to make sure the user inputs
				 // proper values
					boolean loopingAgain = true;
					while (loopingAgain)
					{
						System.out.print("Enter the value you want to find: ");
						Scanner input = new Scanner(System.in);
						if (!input.hasNextInt())//if a non integer value is entered
						{
							System.out.println("That was not a valid entry");
						}
						else
						{
							int x = input.nextInt();
							System.out.println();
							if (findValue(list, x) == -1)
							{
								System.out.println("Your value was not found");
							}
							else
							{
								System.out.println("The location of " + x + " is at " + findValue(list, x));
							}
							loopingAgain = false;
						}
					}
					 
				}
				else if (num == 7)
				{
					boolean loopingAgain = true;
					boolean loopingAgainAgain = true;
					while (loopingAgain)
					{
						System.out.print("Enter the position: ");
						Scanner input = new Scanner(System.in);
						if (!input.hasNextInt())//if a non integer value is entered
						{
							System.out.println("That was not a valid entry");
						}
						else
						{
							int pos = input.nextInt();
							if (pos >= 10 || pos < 0)
							{
								System.out.println("That was not a valid entry");
							}
							else
							{
								loopingAgain = false;
								while (loopingAgainAgain)
								{
									
									System.out.print("Enter the value: ");
									Scanner inp = new Scanner(System.in);
									if (!inp.hasNextInt())//if a non integer value is entered
									{
										System.out.println("That was not a valid entry");
									}
									else
									{
										int val = inp.nextInt();
										insertValue(list, pos, val);
										loopingAgainAgain = false;
									}
								}
							}							
							
						}
					}
					
					
				}
				else if (num == 8)
				{
					list.clear();
					populateList(list);
				}
				else if (num == 9)
				{
					looping = false;
				}
				else
				{
					System.out.println("You did not pick an appropriate number.");
				}
			}
			
		}
		
	}
	/**
	 * prompts the user for values and fills the array list
	 * @param theList	the array list
	 */
	public static void populateList(ArrayList <Integer> theList)
	{
		for (int i = 0 ; i < 10; i++)
		{//prompts the user for a new integer value and then populates the list with 10 integer values
			System.out.print("Enter an integer: ");
			Scanner in = new Scanner(System.in);
			if (in.hasNextInt())
			{
				theList.add(in.nextInt());
			}
			else //if a non integer value is entered
			{
				System.out.println("That was not an appropriate number, please try again.");
				i--;
			}
			
		}
	}
	/**
	 * prints out the array in the order that it was input
	 * @param theList	the array list
	 */
	public static void displayNumbers(ArrayList <Integer> theList)
	{//prints out the values of the list
		for (int i  = 0; i <theList.size(); i++)
		{
			if ( i != (theList.size() - 1))
			{
				System.out.print(theList.get(i) + ",");
			}
			else
			{
				System.out.println(theList.get(i));
			}
		}
	}
	
	/**
	 * prints out the array list in a reversed order
	 * @param theList	the array list
	 */
	public static void displayReversed(ArrayList <Integer> theList)
	{//prints out the values of the list in reversed order
		for (int i  = theList.size() - 1; i >= 0; i--)
		{
			if ( i != 0)
			{
				System.out.print(theList.get(i) + ",");
			}
			else
			{
				System.out.println(theList.get(i));
			}
		}
	}
	/**
	 * calculates and returns the sum of the array list
	 * @param theList	the array list 
	 * @return 			sum of the array list
	 */
	public static int computeSum(ArrayList <Integer> theList)
	{//return an int value of the sum of the list
		int sum = 0;
		for (int i  = 0; i <theList.size(); i++) 
		{
			sum += theList.get(i);
		}
		return sum;
	}
	/**
	 * returns the maximum value of the arrayList
	 * @param theList	the arraylist
	 * @return 			max of the arraylist	
	 */
	public static int displayMax(ArrayList <Integer> theList)
	{
		int max = theList.get(0);
		for (int i  = 1; i <theList.size(); i++) 
		{
			if (max < theList.get(i))
			{
				max = theList.get(i);
			}
		}
		return max;
	}
	/**
	 * finds the location of the input value in the array list
	 * @param theList	the array list
	 * @param value		the value that is being searched for
	 * @return 			the location of the specified value
	 */
	public static int findValue(ArrayList <Integer> theList, int value)
	{//returns an int value of the location of the value that is imputted
		for (int i  = 0; i <theList.size(); i++) 
		{
			if (theList.get(i) == value)
			{
				return i;
			}
		}
		return -1;
	}
	/**
	 * Changes the value of a specific position in the array list
	 * @param theList	the arraylist
	 * @param position	the index of the array that will be changed
	 * @param value		the new value that will be input
	 */
	public static void insertValue(ArrayList <Integer> theList,int position, int value)
	{//replaces thes value with a new value at the targetted position
		theList.set(position, value);
	}
	
	
}
