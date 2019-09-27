
public class Contact
{
	/** Represents the first name */
	private String firstName;
	/** Represents the last name */
	private String lastName;
	/** Represents the phone number */
	private String phoneNumber;
	/** Represents the address */
	private String address;
	/** Represents the city */
	private String city;
	/** Represents the zip code */
	private int zip;
	/** Constructor 
	 * @param f the first name
	 * @param l the last name
	 * @param p the phone number
	 * @param a the address
	 * @param c the city
	 * @param z the zip code
	 */
	public Contact(String f, String l, String p, String a, String c, int z)
	{
		firstName = f;
		lastName = l;
		phoneNumber = p;
		address = a;
		city = c;
		zip = z;
	}
	/** sets a part of the contact
	 * @param f the first name
	 */
	public void setFirstName(String f)
	{
		firstName = f;
	}
	/** sets a part of the contact
	 * @param l the last name
	 */
	public void setLastName(String l)
	{
		lastName = l;
	}
	/** sets a part of the contact
	 * @param p the phone number
	 */
	public void setPhoneNumber(String p)
	{
		phoneNumber = p;
	}
	/** sets a part of the contact
	 * @param a the address
	 */
	public void setAddress(String a)
	{
		address = a;
	}
	/** sets a part of the contact
	 * @param c the city
	 */
	public void setCity(String c)
	{
		city = c;
	}
	/** sets a part of the contact
	 * @param z the zip code
	 */
	public void setZip(int z)
	{
		zip = z;
	}
	/** gets a part of the contact
	 * @return the first name
	 */
	public String getFirstName()
	{
		return firstName;
	}
	/** gets a part of the contact
	 * @return the last name
	 */
	public String getLastName()
	{
		return lastName;
	}
	/** gets a part of the contact
	 * @return the phone number
	 */
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	/** gets a part of the contact
	 * @return the address
	 */
	public String getAddress()
	{
		return address;
	}
	/** gets a part of the contact
	 * @return the city
	 */
	public String getCity()
	{
		return city;
	}
	/** gets a part of the contact
	 * @return the zip
	 */
	public int getZip()
	{
		return zip;
	}
	/** creates a string of the contact
	 * @return the string of the contact
	 */
	public String toString()
	{
		return getFirstName() + "," + getLastName() + "," + getPhoneNumber() + "," + getAddress() + "," + getCity() 
			   + "," + getZip();
		
	}
	/** finds if two Contacts are equal
	 * @param c the Contact being compared to
	 * @return the whether or not they are equal
	 */
	public boolean equals(Contact c)
	{
		
		if (getLastName().equals(c.getLastName()))
		{
			if (getFirstName().equals(c.getFirstName()))
			{
				return true;
			}	
		}
		return false;
	}
	/** finds which of the two contacts are greater than the other
	 * @param c the Contact being compared to
	 * @return a positive or negative integer
	 */
	public int compareTo(Contact c)
	{
		if (this.getLastName().equals(c.getLastName()))
		{
			return this.getFirstName().compareTo(c.getFirstName());
		}
		return this.getLastName().compareTo(c.getLastName());
	}
}












