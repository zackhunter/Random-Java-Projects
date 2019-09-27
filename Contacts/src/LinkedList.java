

public class LinkedList 
{
	/** Represents the first Node */
	private Node first;
	public class Node
	{
		/** Represents the data */
		private Contact data;
		/** Represents the next Node */
		private Node next;
		/** Constructor
		 * @param c the Contact
		 */
		public Node(Contact c)
		{
			data = c;
			next = null;
		}
		/** Constructor 
		 * @param c the contact
		 * @param n the node
		 */
		public Node(Contact c, Node n)
		{
			data = c;
			next = n;
		}
		/** creates a string of the node
		 * @return the string of the node
		 */
		@Override
		public String toString()
		{
			String newLine = System.getProperty("line.separator");
			return data.toString() + newLine;//still need to write the toSTring method for contact and it should fix it
		}
	}

	/** Constructor */
	public LinkedList()
	{
		first = null;
	}
	/** Finds whether or not the linkedList in empty
	 * @return true if it is empty or false if otherwise */
	public boolean isEmpty()
	{
		return first == null;
	}
	/** Retrieves the size of the linkedList
	 * @return the size of the linkedList */
	public int size()
	{
		return size(first);
	}
	/** Retrieves the size of the linkedList
	 * @param n the node
	 * @return the size of the linkedList */
	private int size(Node n)
	{
		if(n == null)
		{
			return 0;
		}
		else
		{
			return size(n.next) + 1;
		}
	}
	/** Retrieves a node at a specified index
	 * @param i the index of the node
	 * @return the node */
	public Contact get(int i)
	{
		if(i<0 || i>=size())
		{
			return null;
		}
		return get(i, 0, first);
	}
	/** Retrieves a node at a specified index
	 * @param i the index of the node
	 * @param count the count relative to the index, i
	 * @param n the node
	 * @return the node */
	private Contact get(int i, int count, Node n)
	{
		if(n == null) 
		{
			return null;
		}
		else if(count == i)
		{
			return n.data;
		}
		else 
		{
			return get(i, count + 1, n.next);
		}
	}
	/** sets a Node to a specified index
	 * @param i the index being specified
	 * @param c the Contact being input in to the linkedList
	 */
	public void set(int i, Contact c) 
	{
		if(i < 0 || i >= size())
		{
			System.out.println("Index out of bounds.");
		}
		else 
		{
			Node n = first;
			for(int j = 1; j <= i; j++)
			{
				n = n.next;
			}
			n.data = c;
		}
	}
	/** adds a Node the linked list
	 * @param s the string being added
	 */
	public void add(Contact s)
	{
		first = add(s, first);
	}
	/** adds a Node the linked list
	 * @param s the string being added
	 * @param n the node being added
	 * @return the new node being added
	 */
	private Node add(Contact s, Node n)
	{
		
		if(n == null)
		{
			//System.out.println("yo");
			return new Node(s);
		}
		else
		{
			//System.out.println("Hello");
			n.next = add(s, n.next);
			return n;
		}
	}
	/** adds a Node the linked list
	 * @param s the string being added
	 * @param i the index to add the node at
	 */
	/*
	public void add (String s, int i)
	{	
		if (i <0 || i > size())
		{
			System.out.println("Invalid");
		}
		else
		{
			if (i == 0)
			{
				Node n = first;
				first = new Node(s,n);
			}
			else
			{
				Node p = first;
				
				for (int j = 1;j<i;j++)
				{
					p = p.next;
				}
				
				Node n = p.next;
				p.next = new Node(s,n);
				
				
				
			}
		}
	}
	*/
	public Node add (Contact s, int i)
	{	
		if (i <0 || i > size())
		{
			System.out.println("Invalid");
			return null;
		}
		else
		{
			if (i == 0)
			{
				Node n = first;
				first = new Node(s,n);
				return first;
			}
			else
			{
				/*
				Node p = first;
				
				for (int j = 1;j<i;j++)
				{
					p = p.next;
				}
				
				Node n = p.next;
				p.next = new Node(s,n);
				*/
				Node p = first;
				p.next = add(s, p.next);
				return p;
				
				
			}
		}
	}
	/** removes a Node the linked list
	 * @param i the index to remove the node at
	 * @return the string of the node being removed
	 */
	public Contact remove(int i)
	{
		if(i<0 || i>=size())
		{
			return null;
			}
		return remove(i, 0, first);
	}
	/** removes a Node the linked list
	 * @param i the index to remove the node at
	 * @param count the starting index to look at
	 * @param n the node being removed
	 * @return the string of the node being removed
	 */
	private Contact remove(int i, int count, Node n)
	{
		if(n == null) 
		{
			return null;
		}
		else if(i == 0)
		{
			first = n.next;
			return n.data;
		}
		else if(count + 1 == i)
		{
			Contact ret = n.next.data;
			if(n.next != null)
			{
				n.next = n.next.next;
			}
			return ret;
		}
		else 
		{
			return remove(i, count+1, n.next);
		}
	}	
	/** removes a Node the linked list
	 * @param s the String that is being searched for and removed
	 * @return the string of the node being removed
	 */
	public Contact remove(Contact s)
	{
		
		int index = 0;
		Node current = first;
		while (current != null) 
		{
			if (current.data.equals(s)) 
			{
				remove(index);
				return s;
			}
			index++;
			current = current.next;
		}
		return null;	
		
		//return remove(s) ? s : null;
	}
		/*
		public int indexOf(String s)
		{
			int index = 0;
			Node current = first;
			while (current != null) {
				if (current.data.equals(s)) 
				{
					return index;
				}
				index++;
				current = current.next;
			}
			return -1;
		}
		*/
	/*
	private Node goTo(int index) 
	{
		Node current = first;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current;
	}
	*/
	/** creates a string of all the nodes
	 * @param n the node being input to the string
	 * @return the string of all the nodes
	 */
	public String getThisString(Node n)
	{
		if (n != null)
		{
			return n + getThisString(n.next);
		}
		return "";
	}
	/** creates a string of all the nodes
	 * @return the string of all the nodes
	 */
	@Override
	public String toString()
	{
		String str = getThisString(first);
		return str;
	}
	/** creates a LinkedList with the searched last names
	 * @param lName the last name being searched
	 * @return a LinkedList of contacts
	 */
	public LinkedList search(String lName)
	{
		LinkedList theList = new LinkedList();
		Node current = first;
		while (current != null) 
		{
			if (current.data.getLastName().equals(lName)) 
			{
				theList.add(current.data);
			}
			current = current.next;
		}
		return theList;
	}
	/** creates a LinkedList with the searched zip codes
	 * @param z the zip code being searched for
	 * @return a LinkedList of contacts
	 */
	public LinkedList search(int z)
	{
		LinkedList theList = new LinkedList();
		Node current = first;
		while (current != null) 
		{
			if (current.data.getZip() == z) 
			{
				theList.add(current.data);
			}
			current = current.next;
		}
		return theList;
	}
}