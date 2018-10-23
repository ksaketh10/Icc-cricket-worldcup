
public class Group {
	private String team1;
	private String team2;
	private String team3;
//	private float date;
	private int count=0;
	
	public Group(String t1,String t2, String t3) {
		this.team1=t1;
		this.team2=t2;
		this.team3=t3;
//		this.date=date;
	}
	
	public void getMatch() {
		if (count==0){
				System.out.printf(team1+" "+team2+"  " +"Venue:");
				count++;
		}
		else if (count==1){
			System.out.printf(team2+" "+team3+"  " +"Venue:");
			count++;
		}
		else if(count==2){
			System.out.printf(team1+" "+team3+"  " +"Venue:");
			count++;
		}
		else
			System.out.println( "matches overflow");
	
		 }

}
