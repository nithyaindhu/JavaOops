/**
 * 
 */
package com.oops;

/**
 * @author HP
 *
 */
class Theatres {
	private int theatreId = 7;
	static private String theatreName = "Nithya's theatres";
	private int screens = 101;
	private String location = "trichy";
	
	Theatres()
	{
		
		theatreId = 1;
		theatreName = "Sathyam Theatres";
		screens = 12;
		location = "Tirupur";
	}
	Theatres(int theatreId)
	{
		this(theatreId, theatreName = "hi");
		//this.theatreId = theatreId;
		/*theatreName = "Sathyam Theatres";
		screens = 12;
		location = "Tirupur";*/
	}
	Theatres(int theatreId, String theatreName)
	{
		this.theatreId = theatreId;
		Theatres.theatreName = theatreName;
		/*screens = 12;
		location = "Tirupur";*/
	}
	Theatres(int theatreId, String theatreName, int screens)
	{
		this.theatreId = theatreId;
		Theatres.theatreName = theatreName;
		this.screens = screens;
		//location = "Tirupur";
	}
	Theatres(int theatreId, String theatreName, int screens, String location)
	{
		/*this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.screens = screens;*/
		this(theatreId, theatreName, screens);
		this.location = location;
	}
	
	
	protected int getTheatreId() {
		return theatreId;
	}
	protected void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	protected String getTheatreName() {
		return theatreName;
	}
	protected void setTheatreName(String theatreName) {
		Theatres.theatreName = theatreName;
	}
	protected int getScreens() {
		return screens;
	}
	protected void setScreens(int screens) {
		this.screens = screens;
	}
	protected String getLocation() {
		return location;
	}
	protected void setLocation(String location) {
		this.location = location;
	}
	
	protected void displayDetails()
	{
		System.out.println("===========================================");
		System.out.println("Theatre id is " + theatreId);
		System.out.println("Theatre name is "+ theatreName);
		System.out.println("No of Screens is " + screens);
		System.out.println("Theatre location is "+ location);
		System.out.println("===========================================");
	}
	protected Theatres returningThis()
	{
		return this;
	}
	@Override
	public String toString()
	{
		System.out.println("===================================================================");
		return "[ " + theatreId + ", "+ theatreName + ", " + screens + ", "+ location+" ]\n"
				+"===================================================================" ; 
	}
}
