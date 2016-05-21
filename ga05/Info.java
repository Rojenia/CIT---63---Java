public class Info
{
	//PersonalInfo's fields
	private String name;
	private String address;
	private String phoneNumber;
    private String age;
	
	/************************
	* setName method sets 
	* name.
	* @param nombre stores
	* value in name field
	*************************/
	public void setName(String nombre)
	{
		name = nombre;
	}
	
	/****************************
	* setAddress method sets the 
	* address.
	* @param direccion stores value
	* in address
	******************************/
	public void setAddress(String direccion)
	{
		address = direccion;
	}
	
	
	public void setPhone(String digits)
	{
		phoneNumber = digits;
	}
	public void setAge(String years)
	{
		age = years;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
        return address;
	}
	
	public String getPhone()
	{
		return phoneNumber;
	}
	
	public String getAge()
	{
		return age;
	}
	
}