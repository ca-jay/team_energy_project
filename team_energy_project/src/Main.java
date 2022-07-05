
import java.util.LinkedHashMap;
import java.util.Map;



public class Main {
	  public static void main(String[] args) {
		  

//			TOP GUN MAVERICK 
//			Q1:T Q2:f  q3:f q4:f q5:f q6:f q7:f q8:f q9:f q10:f
		    Movie TopGun = new Movie(); 
		    TopGun.setName("Top Gun: Maverick");
		    TopGun.setGenre("Action");
		    TopGun.setReleased(2022);
		    String[] castTopGun = {"Tom Cruise", "Miles Teller", "Val Kilmer"};
		    TopGun.setCast(castTopGun);

		    
		    
//			2. Doctor Strange: Multiverse of Madness
//			Q1:f Q2:f  q3:t q4:f q5:t q6:t q7:f q8:f q9:f q10:f
		    Movie DoctorStrange = new Movie(); 		    	    
		    DoctorStrange.setName("Doctor Strange: Multiverse of Madness");
		    DoctorStrange.setGenre("Fantasy");
		    DoctorStrange.setReleased(2022);
		    String[] castDoctorStrange = {"Benedict Cumberbatch", "Elizabeth Olsen", "Xochitl Gomez"};
		    DoctorStrange.setCast(castDoctorStrange);

		    
//			3. Jurassic World: Dominion
//			Q1:T Q2:f  q3:t q4:f q5:f q6:f q7:f q8:f q9:f q10:f
		    Movie JurassicWorld = new Movie(); 	    	    
		    JurassicWorld.setName("Jurassic World: Dominion");
		    JurassicWorld.setGenre("Sci-fi");
		    JurassicWorld.setReleased(2022);
		    String[] castJurassicWorld = {"Chris Pratt", "Jeff Goldblum", "Bryce Dallas Howard"};
		    JurassicWorld.setCast(castJurassicWorld);

		    	    
//			4. The Batman
//		    Q1:T Q2:f  q3:t q4:f q5:t q6:t q7:f q8:f q9:f q10:t
		    Movie TheBatman = new Movie(); 		        
		    TheBatman.setName("The Batman");
		    TheBatman.setGenre("Action");
		    TheBatman.setReleased(2022);
		    String[] castTheBatman = {"Robert Pattinson", "Zoe Kravitz", "Paul Dano"};
		    TheBatman.setCast(castTheBatman);

		    
//			5. Lightyear
//		    Q1:f Q2:t  q3:t q4:t q5:f q6:f q7:f q8:t q9:f q10:f
		    Movie Lightyear = new Movie(); 
		    Lightyear.setName("Lightyear");
		    Lightyear.setGenre("Comedy");
		    Lightyear.setReleased(2022);
		    String[] castLightyear = {"Chris Evans", "Taika Waititi", "Keke Palmer"};
		    Lightyear.setCast(castLightyear);

		    
//			6. Uncharted
//			Q1:t Q2:f  q3:f q4:f q5:f q6:f q7:f q8:f q9:f q10:t
		    Movie Uncharted = new Movie(); 
		    Uncharted.setName("Uncharted");
		    Uncharted.setGenre("Adventure");
		    Uncharted.setReleased(2022);
		    String[] castUncharted = {"Tom Holland", "Mark Wahlberg", "Sophia Taylor Ali"};
		    Uncharted.setCast(castUncharted);

		    	    
//		    7. Death on the Nile
//		    Q1:f Q2:f  q3:f q4:f q5:t q6:f q7:t q8:f q9:t q10:t 
		    Movie DeathOnTheNile = new Movie(); 
		    DeathOnTheNile.setName("Death on the Nile");
		    DeathOnTheNile.setGenre("Mystery");
		    DeathOnTheNile.setReleased(2022);
		    String[] castDeathOnTheNile = {"Gal Gadot", "Tom Bateman", "Annette Benning"};
		    DeathOnTheNile.setCast(castDeathOnTheNile);

		    
//			8.  Dog
//			Q1:t Q2:t  q3:f q4:t q5:f q6:f q7:f q8:f q9:f q10:f 
		    Movie Dog = new Movie(); 
		    Dog.setName("Dog");
		    Dog.setGenre("Comedy");
		    Dog.setReleased(2022);
		    String[] castDog = {"Channing Tatum", "Jane Adams", "Kevin Nash"};
		    Dog.setCast(castDog);

		    
//			9. Elvis
//			Q1:f Q2:t  q3:f q4:f q5:f q6:f q7:t q8:f q9:f q10:f 
		    Movie Elvis = new Movie(); 	     
		    Elvis.setName("Elvis");
		    Elvis.setGenre("Comedy");
		    Elvis.setReleased(2022);
		    String[] castElvis = {"Austin Butler", "Olivia DeJonge", "Tom Hanks"};
		    Elvis.setCast(castElvis);
		    
		    
//			10. Father of the Bride
//			Q1:f Q2:t  q3:f q4:t q5:f q6:f q7:f q8:f q9:t q10:f 
		    Movie FatherOfTheBride = new Movie(); 
		    FatherOfTheBride.setName("Father of the Bride");
		    FatherOfTheBride.setGenre("Romance");
		    FatherOfTheBride.setReleased(2022);
		    String[] castFatherOfTheBride = {"Andy Garcia", "Gloria Estefan", "Adria Arjona"};
		    FatherOfTheBride.setCast(castFatherOfTheBride);

		    
		  Questions q = new Questions(); 
		  LinkedHashMap<String, Integer> top_list = new LinkedHashMap<String, Integer>();
		  top_list = q.askQuestions(); 
		 
		  int i = 0;		  
		  String[] displayArr = new String[3];
		  for(Map.Entry<String, Integer> mapElement : top_list.entrySet()) {
			  String key = (String)mapElement.getKey();
			  displayArr[i] = key; 			  
			  i++;
		  }
		  

		  Movie[] allMovies = {TopGun, DoctorStrange, JurassicWorld, TheBatman, Lightyear, Uncharted, DeathOnTheNile, Dog, Elvis, FatherOfTheBride};
		  Movie[] movieArr = new Movie[3];
		  int z = 0; 
		  for(int j=0; j<displayArr.length; j++) {
			  for(int k=0; k<allMovies.length; k++) {
				  if(displayArr[j]==allMovies[k].getName()) {
					  movieArr[z] = allMovies[k];
					  z++;
				  }
			  }
		  }

		  System.out.println("\n\n\nYOUR RECOMMENDATIONS");
		  System.out.println("\n=========================\n\n");
		  int displayNum;
		  for(int x=0; x<movieArr.length;x++) {
			  displayNum = x+1;
			  System.out.println("#" + displayNum + " " + movieArr[x].getName());
			  System.out.println("Genre: " + movieArr[x].getGenre());
			  System.out.println("Released: " + movieArr[x].getReleased());
			  System.out.print("Cast: ");
			  for(int m=0; m<movieArr[x].getCast().length; m++) {
				  if(m<movieArr[x].getCast().length-1) {
					  System.out.print(movieArr[x].getCast()[m] + ", "); 
				  }else {
					  System.out.print(movieArr[x].getCast()[m]); 
				  }
				  
			  }
			  System.out.println("\n\n");
		  }

	    

	  }
	}