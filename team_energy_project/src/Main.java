import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//TESTING THE FIRST PUSH

//EDIT TO THE JAY_DEV BRANCH 



// MOVIE LIST
//
//1. Top Gun - Maverick
//Q1:T Q2:f  q3:f q4:f q5:f q6:f q7:f q8:f q9:f q10:f

//2. Doctor Strange: Multiverse of Madness
//Q1:f Q2:f  q3:t q4:f q5:t q6:t q7:f q8:f q9:f q10:f

//3. Jurassic World: Dominion
//Q1:T Q2:f  q3:f q4:f q5:f q6:f q7:f q8:f q9:f q10:f

//4. The Batman
//Q1:T Q2:f  q3:t q4:f q5:t q6:t q7:f q8:f q9:f q10:t

//5. Lightyear
//Q1:f Q2:t  q3:t q4:t q5:f q6:f q7:f q8:t q9:f q10:f

//6. Uncharted
//Q1:t Q2:f  q3:f q4:f q5:f q6:f q7:f q8:f q9:f q10:t

//7. Death on the Nile
//Q1:f Q2:f  q3:f q4:f q5:t q6:f q7:t q8:f q9:t q10:t 

//8.  Dog
//Q1:t Q2:t  q3:f q4:t q5:f q6:f q7:f q8:f q9:f q10:f 

//9. Elvis
//Q1:f Q2:t  q3:f q4:f q5:f q6:f q7:t q8:f q9:f q10:f 

//10. Father of the Bride
//Q1:f Q2:t  q3:f q4:t q5:f q6:f q7:f q8:f q9:t q10:f 



//QUESTIONS

//1. Do you like action-packed movies?
//2. Do you like happy stories?
//3. Do you enjoy fantasy?
//4. Do you like to laugh the whole way through a movie?
//5. Do you enjoy dark movies? 
//6. Are you a fan of super heroes?
//7. Is history interesting to you?
//8. Do you enjoy animation?
//9. Does a good movie need to be romantic?
//10. Do you enjoy a good mystery?


public class Main {
	  public static void main(String[] args) {
		  
		  Questions q = new Questions(); 
		  HashMap<String, Integer> top_list = new HashMap<String, Integer>();
		  top_list = q.askQuestions(); 
		  
		  System.out.println("\n\nYour Movie Recommendations:\n\n");
		  
		  int i = 0;
		  
		  for(Map.Entry mapElement : top_list.entrySet()) {
			  i++;
			  
			  String key = (String)mapElement.getKey();
			  int value = (int)mapElement.getValue();
			  
			  System.out.println("#" + i + " " + key);
			  
		  }
//		  for(int i=0; i<top_list.size(); i++) {
//			  System.out.println("#" + i+1 + " " + top_list.get(i));
//		  }
//		  
	    // Create a HashMap object called capitalCities
//	    HashMap<String, Boolean> temp_map = new HashMap<String, Boolean>();
//
//	    //TOP GUN MAVERICK
//	    //Q1:T Q2:f  q3:f q4:f q5:f q6:f q7:f q8:f q9:f q10:f
//	    Movie TopGun = new Movie(); 
//	    temp_map.put("Q1", true);
//	    temp_map.put("Q2", false);
//	    temp_map.put("Q3", false);
//	    temp_map.put("Q4", false);
//	    temp_map.put("Q5", false);
//	    temp_map.put("Q6", false);
//	    temp_map.put("Q7", false);
//	    temp_map.put("Q8", false);
//	    temp_map.put("Q9", false);
//	    temp_map.put("Q10", false);
//	    
//	    TopGun.setName("Top Gun: Maverick");
//	    TopGun.setGenre("Action");
//	    TopGun.setReleased(2022);
//	    String[] castTopGun = {"Tom Cruise", "Miles Teller", "Val Kilmer"};
//	    TopGun.setCast(castTopGun);
//	    TopGun.setQuestions(temp_map);
//	    
//	    temp_map.clear();
//	    
//	    
//	    
//		//2. Doctor Strange: Multiverse of Madness
//	    //Q1:f Q2:f  q3:t q4:f q5:t q6:t q7:f q8:f q9:f q10:f
//	    Movie DoctorStrange = new Movie(); 
//	    temp_map.put("Q1", false);
//	    temp_map.put("Q2", false);
//	    temp_map.put("Q3", true);
//	    temp_map.put("Q4", false);
//	    temp_map.put("Q5", true);
//	    temp_map.put("Q6", true);
//	    temp_map.put("Q7", false);
//	    temp_map.put("Q8", false);
//	    temp_map.put("Q9", false);
//	    temp_map.put("Q10", false);
//	    	    
//	    DoctorStrange.setName("Doctor Strange: Multiverse of Madness");
//	    DoctorStrange.setGenre("Fantasy");
//	    DoctorStrange.setReleased(2022);
//	    String[] castDoctorStrange = {"Benedict Cumberbatch", "Elizabeth Olsen", "Xochitl Gomez"};
//	    DoctorStrange.setCast(castDoctorStrange);
//	    DoctorStrange.setQuestions(temp_map);
//	    
//	    temp_map.clear(); 
//	    
//	    
//	    
//	    //3. Jurassic World: Dominion
//	    //Q1:T Q2:f  q3:t q4:f q5:f q6:f q7:f q8:f q9:f q10:f
//	    Movie JurassicWorld = new Movie(); 
//	    temp_map.put("Q1", true);
//	    temp_map.put("Q2", false);
//	    temp_map.put("Q3", true);
//	    temp_map.put("Q4", false);
//	    temp_map.put("Q5", false);
//	    temp_map.put("Q6", false);
//	    temp_map.put("Q7", false);
//	    temp_map.put("Q8", false);
//	    temp_map.put("Q9", false);
//	    temp_map.put("Q10", false);
//	    	    
//	    JurassicWorld.setName("Jurassic World: Dominion");
//	    JurassicWorld.setGenre("Sci-fi");
//	    JurassicWorld.setReleased(2022);
//	    String[] castJurassicWorld = {"Chris Pratt", "Jeff Goldblum", "Bryce Dallas Howard"};
//	    JurassicWorld.setCast(castJurassicWorld);
//	    JurassicWorld.setQuestions(temp_map);
//	    
//	    temp_map.clear(); 
//	    
//	    
//	    
//	    //4. The Batman
//    	//Q1:T Q2:f  q3:t q4:f q5:t q6:t q7:f q8:f q9:f q10:t
//	    Movie TheBatman = new Movie(); 
//	    temp_map.put("Q1", true);
//	    temp_map.put("Q2", false);
//	    temp_map.put("Q3", true);
//	    temp_map.put("Q4", false);
//	    temp_map.put("Q5", true);
//	    temp_map.put("Q6", true);
//	    temp_map.put("Q7", false);
//	    temp_map.put("Q8", false);
//	    temp_map.put("Q9", false);
//	    temp_map.put("Q10", true);
//	        
//	    TheBatman.setName("The Batman");
//	    TheBatman.setGenre("Action");
//	    TheBatman.setReleased(2022);
//	    String[] castTheBatman = {"Robert Pattinson", "Zoe Kravitz", "Paul Dano"};
//	    TheBatman.setCast(castTheBatman);
//	    TheBatman.setQuestions(temp_map);
//	    
//	    temp_map.clear(); 
//	    
//	    
//	    
//	    //5. Lightyear
//        //Q1:f Q2:t  q3:t q4:t q5:f q6:f q7:f q8:t q9:f q10:f
//	    Movie Lightyear = new Movie(); 
//	    temp_map.put("Q1", false);
//	    temp_map.put("Q2", true);
//	    temp_map.put("Q3", true);
//	    temp_map.put("Q4", true);
//	    temp_map.put("Q5", false);
//	    temp_map.put("Q6", false);
//	    temp_map.put("Q7", false);
//	    temp_map.put("Q8", true);
//	    temp_map.put("Q9", false);
//	    temp_map.put("Q10", false);
//	    	    
//	    Lightyear.setName("Lightyear");
//	    Lightyear.setGenre("Comedy");
//	    Lightyear.setReleased(2022);
//	    String[] castLightyear = {"Chris Evans", "Taika Waititi", "Keke Palmer"};
//	    Lightyear.setCast(castLightyear);
//	    Lightyear.setQuestions(temp_map);
//	    
//	    temp_map.clear(); 
//	    
//	    
//	    
//	    //6. Uncharted
//	    //Q1:t Q2:f  q3:f q4:f q5:f q6:f q7:f q8:f q9:f q10:t
//	    Movie Uncharted = new Movie(); 
//	    temp_map.put("Q1", true);
//	    temp_map.put("Q2", false);
//	    temp_map.put("Q3", false);
//	    temp_map.put("Q4", false);
//	    temp_map.put("Q5", false);
//	    temp_map.put("Q6", false);
//	    temp_map.put("Q7", false);
//	    temp_map.put("Q8", false);
//	    temp_map.put("Q9", false);
//	    temp_map.put("Q10", true);
//	        
//	    Uncharted.setName("Uncharted");
//	    Uncharted.setGenre("Adventure");
//	    Uncharted.setReleased(2022);
//	    String[] castUncharted = {"Tom Holland", "Mark Wahlberg", "Sophia Taylor Ali"};
//	    Uncharted.setCast(castUncharted);
//	    Uncharted.setQuestions(temp_map);
//	    
//	    temp_map.clear(); 
//	    
//	    
//	    
//	    //7. Death on the Nile
//	    //Q1:f Q2:f  q3:f q4:f q5:t q6:f q7:t q8:f q9:t q10:t 
//	    Movie DeathOnTheNile = new Movie(); 
//	    temp_map.put("Q1", false);
//	    temp_map.put("Q2", false);
//	    temp_map.put("Q3", false);
//	    temp_map.put("Q4", false);
//	    temp_map.put("Q5", true);
//	    temp_map.put("Q6", false);
//	    temp_map.put("Q7", true);
//	    temp_map.put("Q8", false);
//	    temp_map.put("Q9", true);
//	    temp_map.put("Q10", true);
//	     
//	    DeathOnTheNile.setName("Death on the Nile");
//	    DeathOnTheNile.setGenre("Mystery");
//	    DeathOnTheNile.setReleased(2022);
//	    String[] castDeathOnTheNile = {"Gal Gadot", "Tom Bateman", "Annette Benning"};
//	    DeathOnTheNile.setCast(castDeathOnTheNile);
//	    DeathOnTheNile.setQuestions(temp_map);
//	    
//	    temp_map.clear(); 
//	    
//	    
//	    
//	    //8.  Dog
//	    //Q1:t Q2:t  q3:f q4:t q5:f q6:f q7:f q8:f q9:f q10:f 
//	    Movie Dog = new Movie(); 
//	    temp_map.put("Q1", true);
//	    temp_map.put("Q2", true);
//	    temp_map.put("Q3", false);
//	    temp_map.put("Q4", true);
//	    temp_map.put("Q5", false);
//	    temp_map.put("Q6", false);
//	    temp_map.put("Q7", false);
//	    temp_map.put("Q8", false);
//	    temp_map.put("Q9", false);
//	    temp_map.put("Q10", false);
//	     
//	    Dog.setName("Dog");
//	    Dog.setGenre("Comedy");
//	    Dog.setReleased(2022);
//	    String[] castDog = {"Channing Tatum", "Jane Adams", "Kevin Nash"};
//	    Dog.setCast(castDog);
//	    Dog.setQuestions(temp_map);
//	    
//	    temp_map.clear(); 
//	    
//	    
//	    
//	    //9. Elvis
//	    //Q1:f Q2:t  q3:f q4:f q5:f q6:f q7:t q8:f q9:f q10:f 
//	    Movie Elvis = new Movie(); 
//	    temp_map.put("Q1", false);
//	    temp_map.put("Q2", true);
//	    temp_map.put("Q3", false);
//	    temp_map.put("Q4", false);
//	    temp_map.put("Q5", false);
//	    temp_map.put("Q6", false);
//	    temp_map.put("Q7", true);
//	    temp_map.put("Q8", false);
//	    temp_map.put("Q9", false);
//	    temp_map.put("Q10", false);
//	     
//	    Elvis.setName("Elvis");
//	    Elvis.setGenre("Comedy");
//	    Elvis.setReleased(2022);
//	    String[] castElvis = {"Austin Butler", "Olivia DeJonge", "Tom Hanks"};
//	    Elvis.setCast(castElvis);
//	    Elvis.setQuestions(temp_map);
//	    
//	    temp_map.clear();
//	    
//	    
//	    
//	    //10. Father of the Bride
//	    //Q1:f Q2:t  q3:f q4:t q5:f q6:f q7:f q8:f q9:t q10:f 
//	    Movie FatherOfTheBride = new Movie(); 
//	    temp_map.put("Q1", false);
//	    temp_map.put("Q2", true);
//	    temp_map.put("Q3", false);
//	    temp_map.put("Q4", true);
//	    temp_map.put("Q5", false);
//	    temp_map.put("Q6", false);
//	    temp_map.put("Q7", false);
//	    temp_map.put("Q8", false);
//	    temp_map.put("Q9", true);
//	    temp_map.put("Q10", false);
//	     
//	    FatherOfTheBride.setName("Father of the Bride");
//	    FatherOfTheBride.setGenre("Romance");
//	    FatherOfTheBride.setReleased(2022);
//	    String[] castFatherOfTheBride = {"Andy Garcia", "Gloria Estefan", "Adria Arjona"};
//	    FatherOfTheBride.setCast(castFatherOfTheBride);
//	    FatherOfTheBride.setQuestions(temp_map);
//	    
//	    temp_map.clear();
//	    
	    

	    

	  }
	}