/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

/**
 * The user profile for the OnlineVids system. The user has a userID
 * and a favourite genre that must be one of the choices in the
 * genres array. This code is to be used for SYST 17796 midterm exam.
 * Students are reminded to add themselves as modifiers when editing the
 * code.
 * @author dancye, 2019
 */
import java.util.Scanner;
public class UserProfile {

    private String userID;//the userID
    private String genre;// the user's preferred genre of movie
    private String[] genres = {"Comedy", "Drama", "Action", "Mystery"};//available genres of movies
    
    /**
     * A constructor that takes in the userID and the favourite genre
     * @param givenID the ID to assign to this user
     * @param givenGenre the users favourite genre
     */
    public UserProfile(String givenID, String givenGenre)
    {
        userID = givenID;
        genre= givenGenre;
    }

    /**
     * A getter for the userID
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * A getter for the genre
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
}



     class TestUserProfile {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scn.nextLine();

        
        System.out.println("Please choose your favourite genre from the following list:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery","Thriller","Horror","Rom-Com","Western","Foreign","Documentary"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

        int choice = scn.nextInt();
        String genre;

        if (choice >= 1 && choice <= genres.length) {
            genre = genres[choice - 1];
        } else {
            genre = "Unknown";
        }

        // Create user profile
        UserProfile userProfile = new UserProfile(name, genre);
        System.out.println("User profile created:");
        System.out.println(userProfile.getUserID());
        System.out.println(userProfile.getGenre());
    }
    
}

