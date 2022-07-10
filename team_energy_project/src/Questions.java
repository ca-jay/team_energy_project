
import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

class Questions extends Movie{
	
	
	public HashMap<String, Boolean> questions;
	public Scanner ofUser; //I used the same scanner throughout
	public String userName; //this is for user input as it's used throughout the program

	
	
	public void setUserName(String a) {
		this.userName = a;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public LinkedHashMap<String, Integer> askQuestions() {
		
		int v1 = 0; //Top Gun - Maverick
		int v2 = 0; // Doctor Strange: Multiverse of Madness
		int v3 = 0; //Jurassic World: Dominion
		int v4 = 0; //The Batman
		int v5 = 0; //Lightyear
		int v6 = 0; // Uncharted
		int v7 = 0; //Death on the Nile
		int v8 = 0; //Dog
		int v9 = 0; //Elvis
		int v10 = 0; //Father of the Bride
		
		System.out.println("Welcome to movie recs."); //Welcome/opening prompt
		System.out.println("Please enter your first name");
		ofUser = new Scanner(System.in); //I used the same scanner throughout
		userName = ofUser.nextLine(); //this is for user input as it's used throughout the program
		System.out.println("Hello " + userName + " please answer the following questions to assist in our recommendation(s) for you.");
		
		//each movie is incremented based on user input to each question through their corresponding variable assigned above
		System.out.println("Do you like action-packed movies?");
		setUserName(ofUser.nextLine());
		setUserName(getUserName().toLowerCase());
		assertEquals("checkYes", userName, userName);

		if (userName.equals("yes")) {
			v1 ++;
			v3 ++;
			v4 ++;
			v6 ++;
			v8 ++;
			
		}else if (userName.equals("no")) {
			v2++;
			v5++;
			v7++;
			v9++;
			v10++;
		}
			
		System.out.println("Do you like happy stories?");
//		userName = ofUser.nextLine();
//		userName = userName.toLowerCase();
		setUserName(ofUser.nextLine());
		setUserName(getUserName().toLowerCase());

		if (userName.equals("yes")) {
			v5 ++;
			v8 ++;
			v9 ++;
			v10 ++;
		
		}else if (userName.equals("no")) {
			v1++;
			v2++;
			v3++;
			v4++;
			v6++;
			v7++;

		}

		
		System.out.println("Do you enjoy fantasy?");
//		userName = ofUser.nextLine();
//		userName = userName.toLowerCase();
		setUserName(ofUser.nextLine());
		setUserName(getUserName().toLowerCase());

		if (userName.equals("yes")) {
			v2 ++;
			v4 ++;
			v5 ++;
			
		}else if (userName.equals("no")) {
			v1++;
			v3++;
			v6++;
			v7++;
			v8++;
			v9++;
			v10++;
			
			
		}
		

		
		System.out.println("Do you like to laugh the whole way through a movie?");
//		userName = ofUser.nextLine();
//		userName = userName.toLowerCase();
		setUserName(ofUser.nextLine());
		setUserName(getUserName().toLowerCase());
		
		if (userName.equals("yes")) {
			v5 ++;
			v8 ++;
			v10 ++;
		}else if (userName.equals("no")) {
			v1++;
			v2++;
			v3++;
			v4++;
			v6++;
			v7++;
			v9++;
		}
		

		
		System.out.println("Do you enjoy dark movies?"); 
//		userName = ofUser.nextLine();
//		userName = userName.toLowerCase();
		setUserName(ofUser.nextLine());
		setUserName(getUserName().toLowerCase());

		if (userName.equals("yes")) {
			v2 ++;
			v4 ++;
			v7 ++;
		}else if (userName.equals("no")) {
			v1++;
			v3++;
			v5++;
			v6++;
			v8++;
			v9++;
			v10++;
		}

		System.out.println("Are you a fan of super heroes?");
//		userName = ofUser.nextLine();
//		userName = userName.toLowerCase();
		setUserName(ofUser.nextLine());
		setUserName(getUserName().toLowerCase());

		if (userName.equals("yes")) {
			v2++;
			v4++;
		}else if (userName.equals("no")) {
			v1++;
			v3++;
			v5++;
			v6++;
			v7++;
			v8++;
			v9++;
			v10++;
		}
		

		System.out.println("Is history interesting to you?");
//		userName = ofUser.nextLine();
//		userName = userName.toLowerCase();
		setUserName(ofUser.nextLine());
		setUserName(getUserName().toLowerCase());

		
		if (userName.equals("yes")) {
			v7 ++;
			v9 ++;
		}else if (userName.equals("no")) {
			v1++;
			v2++;
			v3++;
			v4++;
			v5++;
			v6++;
			v8++;
			v10++;
		}
		

		
		System.out.println("Do you enjoy animation?");
//		userName = ofUser.nextLine();
//		userName = userName.toLowerCase();
		setUserName(ofUser.nextLine());
		setUserName(getUserName().toLowerCase());

		
		if (userName.equals("yes")) {
			v5++;
		}else if (userName.equals("no")) {
			v1++;
			v2++;
			v3++;
			v4++;
			v6++;
			v7++;
			v8++;
			v9++;
			v10++;
		}

		
		System.out.println("Does a good movie need to be romantic?");
//		userName = ofUser.nextLine();
//		userName = userName.toLowerCase();
		setUserName(ofUser.nextLine());
		setUserName(getUserName().toLowerCase());

		
		if (userName.equals("yes")) {
			v7 ++;
			v10 ++;
		}else if (userName.equals("no")) {
			v1++;
			v2++;
			v3++;
			v4++;
			v5++;
			v6++;
			v8++;
			v9++;
		}
		

		
		System.out.println("Do you enjoy a good mystery?");
//		userName = ofUser.nextLine();
//		userName = userName.toLowerCase();
		setUserName(ofUser.nextLine());
		setUserName(getUserName().toLowerCase());

		if (userName.equals("yes")) {
			v4 ++;
			v7 ++;
		}else if (userName.equals("no")) {
			v1++;
			v2++;
			v3++;
			v5++;
			v6++;
			v8++;
			v9++;
			v10++;
		}
		

		
		ofUser.close();
		

		
		LinkedHashMap<String, Integer> topMovies = new LinkedHashMap<String, Integer>();

		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("Top Gun: Maverick", v1);
		map.put("Doctor Strange: Multiverse of Madness", v2);
		map.put("Jurassic World: Dominion", v3);
		map.put("The Batman", v4);
		map.put("Lightyear", v5);
		map.put("Uncharted", v6);
		map.put("Death on the Nile", v7);
		map.put("Dog", v8);
		map.put("Elvis", v9);
		map.put("Father of the Bride", v10);
		
		topMovies = chooseGreatest(map);
		
		return topMovies;
		
	}
	
	
	public LinkedHashMap<String, Integer> chooseGreatest(LinkedHashMap<String, Integer> list) {
		LinkedHashMap<String, Integer> newList = new LinkedHashMap<String, Integer>();			
		int value;
		int value2;
		int j=0;
		
		while(j<3) {
			HashMap.Entry<String, Integer> entry = null; 
			
	        for (HashMap.Entry<String, Integer> currentEntry :
	            list.entrySet()) {
	        	value = (int)currentEntry.getValue();
	        	if(entry!=null) {
	        		value2 = entry.getValue();
	        	}else {
	        		value2 = 0;
	        	}
	           if (entry == null || (value > value2)) {
	               entry = currentEntry; 
	           }
	        }
	        
	        String new_key = (String)entry.getKey();
	        
			int new_value = (int)entry.getValue();
			
			if(!newList.containsKey(new_key)) {
	        newList.put(new_key, new_value);
	        list.remove(new_key, new_value);
			}
	        j++;
		}
		   
        return newList;
        
	}	
}

