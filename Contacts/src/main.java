import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class main
{
	public static void main(String[] args)
	{
		int numOfLines = 0;
		ArrayList<String []> everything = new ArrayList<String []>();
		try
		{
			BufferedReader r = new BufferedReader(new FileReader(new File("addresses.txt")));
			String str;
			//str = r.readLine();
			while ((str = r.readLine()) != null) 
			{
				String[] holder =str.split(",");
		        everything.add(holder);
		        numOfLines++;
			}
			r.close();
		}
		catch(IOException e)
		{
			System.out.println("File was not found.");
		}
		LinkedList theList = new LinkedList();
		for (int i = 0; i < numOfLines; i++)
		{
			String [] oneLine = everything.get(i);
			String fName = oneLine[0];
			String lName = oneLine[1];
			String pNum = oneLine[2];
			String add = oneLine[3];
			String city = oneLine[4];
			String z = oneLine[5];
			int zip = Integer.parseInt(z);
			theList.add(new Contact(fName,lName,pNum,add,city,zip));
		}
		
		//the menu
		boolean keepLooping = true;
		while(keepLooping)
		{
			System.out.println("1. Enter 1 to create a new contact.");
			System.out.println("2. Enter 2 to remove a contact by last name.");
			System.out.println("3. Enter 3 to remove a contact by its index.");
			System.out.println("4. Enter 4 to search for contacts by last name.");
			System.out.println("5. Enter 5 to search for contacts by zip code.");
			System.out.println("6. Enter 6 to modify a contact.");
			System.out.println("7. Enter 7 to display all contacts.");
			System.out.println("8. Enter 8 to display all contacts sorted by last name then first name.");
			System.out.println("9. Enter 9 to quit.");
			Scanner in = new Scanner(System.in);
			System.out.print("Enter your choice (1-9): ");
			if(!in.hasNextInt())
			{
				System.out.println("Invalid entry try again!");
			}
			else
			{
				int option = in.nextInt();
				if (option == 1)
				{
					System.out.print("Enter first name: ");
					String f = in.nextLine();
					System.out.print("Enter last name: ");
					String l = in.nextLine();
					System.out.print("Enter phone number: ");
					String p = in.nextLine();
					System.out.print("Enter address: ");
					String a = in.nextLine();
					System.out.print("Enter city: ");
					String c = in.nextLine();
					boolean keepLooping2 = true;
					int z = 0;
					while (keepLooping2)
					{
						System.out.print("Enter zipCode: ");
						if (!in.hasNextInt())
						{
							System.out.println("Invalid entry try again!");
						}
						else
						{
							z = in.nextInt();
							keepLooping2 = false;
						}
					}
					theList.add(new Contact(f,l,p,a,c,z));
				}
				else if (option == 2)
				{
					System.out.print("Enter first name: ");
					String f = in.nextLine();
					System.out.print("Enter last name: ");
					String l = in.nextLine();
					Contact con = new Contact(f,l,"","","",0);
					Contact removed = theList.remove(con);
				}
				else if (option == 3)
				{
					boolean keepLooping2 = true;
					while (keepLooping2)
					{
						System.out.println("Enter the index you want removed: ");
						if (!in.hasNextInt())
						{
							System.out.println("Invalid entry try again!");
						}
						else
						{
							int index = in.nextInt();
							if (index < 0 || index > theList.size())
							{
								System.out.println("Invalid entry try again!");
							}
							else
							{
								Contact removed = theList.remove(index);
								keepLooping2 = false;
							}
						}
					}
				}
				else if (option == 4)
				{
					System.out.print("Enter last name: ");
					String l = in.nextLine();
					System.out.println(theList.search(l));
				}
				else if (option == 5)
				{
					boolean keepLooping2 = true;
					while (keepLooping2)
					{
						System.out.print("Enter zip code: ");
						if (!in.hasNextInt())
						{
							System.out.println("Invalid entry try again!");
						}
						else
						{
							int z = in.nextInt();
							System.out.println(theList.search(z));
							keepLooping2 = false;
						}
					}
				}
				else if (option == 6)
				{
					System.out.println(theList);
					
					boolean keepLooping2 = true;
					while (keepLooping2)
					{
						System.out.println("Which contact would you like to modify (lowest index is 1): ");
						if(!in.hasNextInt())
						{
							System.out.println("Invalid entry try again!");
						}
						else
						{
							int index = in.nextInt();
							System.out.println("1. Enter 1 to modify the first name.");
							System.out.println("2. Enter 2 to remove a contact by last name.");
							System.out.println("3. Enter 3 to remove a contact by its index.");
							System.out.println("4. Enter 4 to search for contacts by last name.");
							System.out.println("5. Enter 5 to search for contacts by zip code.");
							System.out.println("6. Enter 6 to modify a contact.");
							System.out.print("Enter your option (1-6): ");
							if(!in.hasNextInt())
							{
								System.out.println("Invalid entry try again!");
							}
							else
							{
								int opt = in.nextInt();
								keepLooping2 = false;
								if (opt == 1)
								{
									System.out.print("Enter first name: ");
									String s = in.nextLine();
									Contact con = theList.get(index);
									con.setFirstName(s);
									theList.set(index, con);
								}
								else if (opt == 2)
								{
									System.out.print("Enter last name: ");
									String s = in.nextLine();
									Contact con = theList.get(index);
									con.setLastName(s);
									theList.set(index, con);
								}
								else if (opt == 3)
								{
									System.out.print("Enter phone number: ");
									String s = in.nextLine();
									Contact con = theList.get(index);
									con.setPhoneNumber(s);
									theList.set(index, con);
								}
								else if (opt == 4)
								{
									System.out.print("Enter address: ");
									String s = in.nextLine();
									Contact con = theList.get(index);
									con.setAddress(s);
									theList.set(index, con);
								}
								else if (opt == 5)
								{
									System.out.print("Enter city: ");
									String s = in.nextLine();
									Contact con = theList.get(index);
									con.setCity(s);
									theList.set(index, con);
								}
								else if (opt == 6)
								{
									System.out.print("Enter first name: ");
									int s = in.nextInt();
									Contact con = theList.get(index);
									con.setZip(s);
									theList.set(index, con);
								}
								else
								{
									System.out.println("Invalid entry try again!");
									keepLooping2 = true;
								}
							}
						}
						
					}
				}
				else if (option == 7)
				{
					System.out.println(theList);
				}
				else if (option == 8)
				{
					
				}
				else if (option == 9)
				{
					writeList("addresses.txt",theList);
					keepLooping = false;
				}
				else
				{
					System.out.println("Invalid entry try again!");
				}
			}	
		}
	}	
	/** writes the question objects to the file */
	public static void writeList(String fileName, LinkedList l)
	{
		try
		{
			PrintWriter writer = new PrintWriter(fileName);
				writer.println(l);
				//writer.println(questions.get(i).getCorrectAnswer());
			
			writer.close();
		}
		catch(FileNotFoundException fnf) 
		{
			System.out.println("File was not found");
		}
	}
}
