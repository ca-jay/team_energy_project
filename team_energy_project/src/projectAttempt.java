
//EDIT TO THE KYLE_DEV BRANCH 




//@author Kyle Santoyo
//this is a prototype to see a basic iteration of the project in action

//EDIT TO THE KYLE_DEV BRANCH 




//@author Kyle Santoyo
//this is a prototype to see a basic iteration of the project in action
import java.util.*;

public class projectAttempt {
	public static void main(String[] args) {
		
		//if the threshold value is reached for any/all of the movies, then they will be added into the Hash map
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
		
		HashMap<Integer, String> movieListing = new HashMap<>();
		
		System.out.println("Welcome to movie recs."); //Welcome/opening prompt
		System.out.println("Please enter your first name");
		Scanner ofUser = new Scanner(System.in); //I used the same scanner throughout
		String userName = ofUser.nextLine(); //this is for user input as it's used throughout the program
		System.out.println("Hello " + userName + " please answer the following questions to assist in our recommendation(s) for you.");
		
		//in the following if statements, I only accounted for one variant of "yes", any others such as: Yes,YES,YeS, etc should not work
		//but I didn't get a chance to add/test, in part because I wasn't sure if this implementation is close to what we envisioned and 
		//I wanted to get thoughts before going forward. Someone else can implement those if they want. 
		//Feel free to modify this or take chunks of code for your implementation if you see something worth taking
		
		//each movie is incremented based on user input to each question through their corresponding variable assigned above
		System.out.println("Do you like action-packed movies?");
		userName = ofUser.nextLine();
		if (userName.equals("yes")) {
			v1 ++;
			v3 ++;
			v4 ++;
			v6 ++;
			v8 ++;
			
		}
			
		System.out.println(userName);
		
		System.out.println("Do you like happy stories?");
		if (userName.equals("yes")) {
			v5 ++;
			v8 ++;
			v9 ++;
			v10 ++;
		
		}
		userName = ofUser.nextLine();
		
		System.out.println("Do you enjoy fantasy?");
		if (userName.equals("yes")) {
			v2 ++;
			v4 ++;
			v5 ++;
			
		}
		userName = ofUser.nextLine();
		
		System.out.println("Do you like to laugh the whole way through a movie?");
		if (userName.equals("yes")) {
			v5 ++;
			v8 ++;
			v10 ++;
		}
		userName = ofUser.nextLine();
		
		System.out.println("Do you enjoy dark movies?"); 
		if (userName.equals("yes")) {
			v2 ++;
			v4 ++;
			v7 ++;
			
		}
		userName = ofUser.nextLine();
		
		System.out.println("Are you a fan of super heroes?");
		if (userName.equals("yes")) {
			v2 ++;
			v4 ++;
			
		}
		userName = ofUser.nextLine();
		
		System.out.println("Is history interesting to you?");
		if (userName.equals("yes")) {
			v7 ++;
			v9 ++;
			
		}
		userName = ofUser.nextLine();
		
		System.out.println("Do you enjoy animation?");
		if (userName.equals("yes")) {
			v5 ++;
		}
		userName = ofUser.nextLine();
		
		System.out.println("Does a good movie need to be romantic?");
		if (userName.equals("yes")) {
			v7 ++;
			v10 ++;
		}
		userName = ofUser.nextLine();
		
		System.out.println("Do you enjoy a good mystery?");
		if (userName.equals("yes")) {
			v4 ++;
			v7 ++;
			
		}
		userName = ofUser.nextLine();
		
		//once all of the questions are answered the values of each variable are sent below to see if the threshold values for any 
		//of the movies went reached. If they were, then the corresponding movie is added to the Hash map and prepped for display to the user.
		
		ofUser.close();
		
		if (v1 == 1){
			movieListing.put(1, "Top Gun-Maverick");
		}
		
		if (v2 == 3){
			movieListing.put(2, "Doctor Strange: Multiverse of Madness");
		}
		
		if (v3 == 1){
			movieListing.put(3, "Jurassic World: Dominion");
		}
		
		if (v4 == 5){
			movieListing.put(4, "The Batman");
		}
		
		if (v5 == 4){
			movieListing.put(5, "Lightyear");
		}
		
		if (v6 == 2){
			movieListing.put(6, "Uncharted");
		}
		
		if (v7 == 3){
			movieListing.put(7, "Death on the Nile");
		}
		
		if (v8 == 3){
			movieListing.put(8, "Dog");
		}
		
		if (v9 == 2){
			movieListing.put(9, "Elvis");
		}
		
		if (v10 == 3){
			movieListing.put(10, "Father of the Bride");
		}
		
		System.out.println("Recommendation(s): ");
		
		Iterator<String> advancer = movieListing.values().iterator(); //iterator to advance through the Hash map
		while(advancer.hasNext()) { //loop to print all elements in the Hash map
		      System.out.print(advancer.next());
		      System.out.print("; ");
		    } //could maybe add a part if no movies were displayed saying "sorry, we have nothing to recommend you from our list",
			  //that is, if the user input no for every question 
		//maybe add in a way to reset all of the variables 
	}
}