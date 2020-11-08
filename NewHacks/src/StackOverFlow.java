import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;



public class StackOverFlow {
	
	public static long secondsPassed;
	public static long displayMinutes;
	public void timer() throws InterruptedException{
		boolean z=true;
		while(z) {
		    boolean x=true;
		    boolean y=false;
		    boolean a=false;
		    displayMinutes=24;
		    long startTime=System.currentTimeMillis();
		    System.out.println((displayMinutes+1)+"::00");
		    while(x)
		    {
		        TimeUnit.SECONDS.sleep(1);
		        long timePassed=System.currentTimeMillis()-startTime;
		        secondsPassed=60-(timePassed/1000);//makes timer count down instead of up
		        if(secondsPassed==0)//when secondsPassed ==0 it restarts timer
		        {
	
		            startTime=System.currentTimeMillis();
		           
		        }
		        if(secondsPassed==59 && y) {//"y" was made false first because at 24::59 it wouldve made a minute pass which we dont want
		        	displayMinutes--;
		        	
		        }
		        if(secondsPassed==59 && !y) {//Makes "y" true, was put after the other if statements because after this loop it'll be 24:58 which wont trigger other if statement
		        	y=true;
		        }
		        if(displayMinutes==0 && secondsPassed==0)//Plays Bruh sound effect #3
		        {
		        	String filepath = "C:\\Users\\Tahir\\eclipse-workspace\\NewHacks\\Bruh\\bruh#3.wav";
		    		Bruh musicObject = new Bruh();
		    		musicObject.playMusic(filepath);
		        }
		        
	
		    System.out.println(displayMinutes+"::"+secondsPassed);
		    if(displayMinutes==0 && secondsPassed==0 && !a) {//makes timer go to 5 minutes after 25 minute timer done, also makes "a" true so that this if statement doesnt trigger when timer reaches 0 again
		    	displayMinutes=4;
		    	a=true;
		    }
		    if(displayMinutes==0 && secondsPassed==0 && a)//"a" was made true in last if statement so after 5 minute timer goes down it resets the entire loop and makes timer go back to 25 minutes
		    x=false;
		    }
			}
		
	}
	public long getSeconds() {
		return(secondsPassed);
	}
	public long getMinutes() {
		return(displayMinutes);
	}
	public static void main(String[] args) throws InterruptedException 
	{
		
		boolean z=true;
		while(z) {
		    boolean x=true;
		    boolean y=false;
		    boolean a=false;
		    long displayMinutes=24;
		    long startTime=System.currentTimeMillis();
		    System.out.println((displayMinutes+1)+"::00");
		    while(x)
		    {
		        TimeUnit.SECONDS.sleep(1);
		        long timePassed=System.currentTimeMillis()-startTime;
		        secondsPassed=60-(timePassed/1000);//makes timer count down instead of up
		        if(secondsPassed==0)//when secondsPassed ==0 it restarts timer
		        {
	
		            startTime=System.currentTimeMillis();
		           
		        }
		        if(secondsPassed==59 && y) {//"y" was made false first because at 24::59 it wouldve made a minute pass which we dont want
		        	displayMinutes--;
		        	
		        }
		        if(secondsPassed==59 && !y) {//Makes "y" true, was put after the other if statements because after this loop it'll be 24:58 which wont trigger other if statement
		        	y=true;
		        }
		        if(displayMinutes==0 && secondsPassed==0)//Plays Bruh sound effect #3
		        {
		        	String filepath = "C:\\Users\\Tahir\\eclipse-workspace\\NewHacks\\Bruh\\bruh#3.wav";
		    		Bruh musicObject = new Bruh();
		    		musicObject.playMusic(filepath);
		        }
		        
	
		    System.out.println(displayMinutes+"::"+secondsPassed);
		    if(displayMinutes==0 && secondsPassed==0 && !a) {//makes timer go to 5 minutes after 25 minute timer done, also makes "a" true so that this if statement doesnt trigger when timer reaches 0 again
		    	displayMinutes=4;
		    	a=true;
		    }
		    if(displayMinutes==0 && secondsPassed==0 && a)//"a" was made true in last if statement so after 5 minute timer goes down it resets the entire loop and makes timer go back to 25 minutes
		    x=false;
		    }
			}
		    }
	
}

