
public class Venue {
//	private float date;
	public String name;
	public static float date;
	public Venue(String name, float date) {
		this.name= name;
		this.date= date;
	}
	
	private float assignDate=date-0.02f;
	
	public boolean available() {
		if(date-assignDate>0.01) {
			assignVenue();
			return true;
			
		}
		return false;
	}
	
	private void assignVenue() {
		assignDate=date;
	}
	
	@Override
    public String toString() { 
        return String.format(name ); 
    } 
	
	
	

	

}
