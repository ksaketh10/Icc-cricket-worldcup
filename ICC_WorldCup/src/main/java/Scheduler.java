
public class Scheduler {
	private Group A= new Group("India","Australia","Bangladesh");
	private Group B= new Group("SriLanka","WestIndies","Zimbabwe");
	private Group C= new Group("Pakistan","England","Afganistan");
	private Group D= new Group("NewZealand","SouthAfrica","Ireland");
	private Venue v1= new Venue("Melbourne",date);
	private Venue v2= new Venue("Sydney",date);
	private Venue v3= new Venue("Brisbane",date);
	private Venue v4= new Venue("Perth",date);
	private Venue v5= new Venue("Hobart",date);
	private Venue v6= new Venue("Canberra",date);
	
	public Scheduler(float date) {
		this.date= date;
	}
	private static float date;
	private Venue getVenue() {
		if(v1.available()) {
			return v1;
			}
		else if(v2.available()) {
			return v2;
			}
		else if(v3.available()) {
			return v3;
			}
		else if(v4.available()) {
			return v4;
			}
		else if(v5.available()) {
			return v5;
			}
		else if(v6.available()) {
			return v6;
			}
		return null;
		}
	
	public void assignMatchGroups() {
		for(int i=0;i<3;i++) {
		A.getMatch();
		System.out.print(getVenue()+"  "+ "date: " + getDate()+"\n");
		B.getMatch();
		System.out.print(getVenue()+"  "+ "date: " + getDate()+"\n");
		date=date+0.01f;
		Venue.date= Venue.date+0.01f;
		
		C.getMatch();
		System.out.print(getVenue()+"  "+ "date: " + getDate()+"\n");
		D.getMatch();
		System.out.print(getVenue()+"  "+ "date: " + getDate()+"\n");
		date=date+0.01f;
		Venue.date= Venue.date+0.01f;
		}}
	
	public static String getDate() {
		String s="";
		int d;
		if(date>4.00f && date<4.31f) {
			d= (int)((date-4)*100);
			s=d+" "+"April";
			}
		if(date>=4.31) {
			d= (int)((date-4.30)*100);
			s=d+" "+"May";
		}
		return s;
	}
		

}
