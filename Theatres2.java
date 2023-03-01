/**
 * 
 */
package com.oops;

/**
 * @author HP
 *
 */
class Theatres2 {
	static private int theatreId = 7;
	static private String theatreName = "Nithya's theatres";
	static private int screens = 101;
	static private String location = "trichy";
	
	Theatres2()
	{
		
		theatreId = 1;
		theatreName = "Sathyam Theatres";
		screens = 12;
		location = "Tirupur";
	}
	static
	{
		theatreId = 111;
		theatreName = "Sathyam cinema Theatres";
		screens = 121;
		location = "Trichy";
	}
	@Override
	public String toString()
	{
		System.out.println("===================================================================");
		return "[ " + theatreId + ", "+ theatreName + ", " + screens + ", "+ location+" ]\n"
				+"===================================================================" ; 
	}
}
