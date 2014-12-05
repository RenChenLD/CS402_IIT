
public class Thing {
	String name;
	Thing[] things;
	public Thing(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		if(this.getClass().getSimpleName().toString().equals("Thing"))
			return name;
		else
			{
			StringBuffer sb= new StringBuffer().append(name).append(' ').append(this.getClass().getSimpleName().toString());
			return sb.toString();
			}
		
	}
}
