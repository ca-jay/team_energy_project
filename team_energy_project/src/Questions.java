import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Questions extends Movie{
	
	
	public HashMap<String, Boolean> questions;
	
	
	public void setAttributes(HashMap<String, Boolean> theQuestions) {
		
		this.questions = theQuestions;
		
	}
	
	
	public HashMap<String, Boolean> getAttributes() {
		
		return this.questions;
		
	}

	
	public HashMap<String, Integer> askQuestions() {
		
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
		Scanner ofUser = new Scanner(System.in); //I used the same scanner throughout
		String userName = ofUser.nextLine(); //this is for user input as it's used throughout the program
		System.out.println("Hello " + userName + " please answer the following questions to assist in our recommendation(s) for you.");
		
		//each movie is incremented based on user input to each question through their corresponding variable assigned above
		System.out.println("Do you like action-packed movies?");
		userName = ofUser.nextLine();
		userName = userName.toLowerCase();
		if (userName.equals("yes")) {
			v1 ++;
			v3 ++;
			v4 ++;
			v6 ++;
			v8 ++;
			
		}
			
		System.out.println("Do you like happy stories?");
		if (userName.equals("yes")) {
			v5 ++;
			v8 ++;
			v9 ++;
			v10 ++;
		
		}
		
		userName = ofUser.nextLine();
		userName = userName.toLowerCase();
		
		System.out.println("Do you enjoy fantasy?");
		if (userName.equals("yes")) {
			v2 ++;
			v4 ++;
			v5 ++;
			
		}
		
		userName = ofUser.nextLine();
		userName = userName.toLowerCase();
		
		System.out.println("Do you like to laugh the whole way through a movie?");
		if (userName.equals("yes")) {
			v5 ++;
			v8 ++;
			v10 ++;
		}
		
		userName = ofUser.nextLine();
		userName = userName.toLowerCase();
		
		System.out.println("Do you enjoy dark movies?"); 
		if (userName.equals("yes")) {
			v2 ++;
			v4 ++;
			v7 ++;
			
		}
		
		userName = ofUser.nextLine();
		userName = userName.toLowerCase();
		
		System.out.println("Are you a fan of super heroes?");
		if (userName.equals("yes")) {
			v2 ++;
			v4 ++;
			
		}
		
		userName = ofUser.nextLine();
		userName = userName.toLowerCase();
		
		System.out.println("Is history interesting to you?");
		if (userName.equals("yes")) {
			v7 ++;
			v9 ++;
			
		}
		
		userName = ofUser.nextLine();
		userName = userName.toLowerCase();
		
		System.out.println("Do you enjoy animation?");
		if (userName.equals("yes")) {
			v5 ++;
		}
		
		userName = ofUser.nextLine();
		userName = userName.toLowerCase();
		
		System.out.println("Does a good movie need to be romantic?");
		if (userName.equals("yes")) {
			v7 ++;
			v10 ++;
		}
		
		userName = ofUser.nextLine();
		userName = userName.toLowerCase();
		
		System.out.println("Do you enjoy a good mystery?");
		if (userName.equals("yes")) {
			v4 ++;
			v7 ++;
			
		}
		
		userName = ofUser.nextLine();
		userName = userName.toLowerCase();
		
		ofUser.close();
		
		int[] movieArr = {v1, v2, v3, v4, v5, v6, v7, v8, v9, v10};
		
		for(int i=0; i<movieArr.length; i++) {
			System.out.println(movieArr[i]);
		}
		
		HashMap<String, Integer> topMovies = new HashMap<String, Integer>();
		
//		topMovies = chooseGreatest(movieArr);


		HashMap<String, Integer> map = new HashMap<String, Integer>();
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
	
	
//	public List<Integer> chooseGreatest(int[] list) {
//		
//		List<Integer> greatest = new ArrayList<Integer>();
//		
//		for(int i=0; i<list.length; i++) {
//			for(int j=0; j<list.length; j++) {
//				
//				if(list[i]<list[j]) {
//					j = list.length;
//				}else if(j==list.length-1) {
//					greatest.add(list[i]);
//					list[i] = 0; 
//				}		
//			}
//		}
//		
//		
//		if(greatest.size()<3) {
//			chooseGreatest(list);
//		}else {
//			return greatest; 
//		}
//		
//		return greatest; 
//		
//	}
	
	
	public HashMap<String, Integer> chooseGreatest(HashMap<String, Integer> list) {
		
		HashMap<String, Integer> secondList = new HashMap<String, Integer>();
		secondList = list;
		HashMap<String, Integer> newList = new HashMap<String, Integer>();		
		
		
		int value;
		int value2;
		
		int j=0;
		while(j<3) {
	
		HashMap.Entry<String, Integer> entry = null; 
		
        for (HashMap.Entry<String, Integer> currentEntry :
            list.entrySet()) {
        	String key = (String)currentEntry.getKey();
        	value = (int)currentEntry.getValue();
        	if(entry!=null) {
        		value2 = entry.getValue();
        	}else {
        		value2 = 0;
        	}
           if (entry == null || (value > value2)
                     ) {
               entry = currentEntry; 

           }
        }
        
        String new_key = (String)entry.getKey();
		int new_value = (int)entry.getValue();
        
        newList.put(new_key, new_value);
        list.remove(new_key, new_value);
        j++;
		}
		
        
        return newList;
        
	}
       
       
////		for(HashMap.Entry<String, Integer> mapElement : list.entrySet()) {
////			
////			String key = (String)mapElement.getKey();
////			int value = (int)mapElement.getValue();
////					
////					for(HashMap.Entry<String, Integer> mapElement2: secondList.entrySet()) {
////						j++; 
////						
////						String key2 = (String)mapElement2.getKey();
////						int value2 = (int)mapElement2.getValue();
////						
////						if(value<value2) {
////							break;
////							
////						}else if(j == 9) {
////							System.out.println(key);
////							newList.put(key, value);
////							list.put(key, 0);
////						}
////					}
////			
////			
////		}
////		
//		
//		if(newList.size()<3) {
//			chooseGreatest(list);
//			
//		}else {
//			return newList;
//		}
//
//		return newList;
//		
//	}



	
	
	
	
	
	
}

