import static org.junit.Assert.*;				
import org.junit.Test;	
public class Java_Test {
	
	@Test
	public void validate_dateEntered_correct{
		Scheduler s= new Scheduler(4.08f);
		assertEquals("8 april", Scheduler.getDate());
		
		
	}

}
