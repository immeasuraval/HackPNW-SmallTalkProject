import java.util.*;

public class Main {
    public static void main(String[] args) {
        //create Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        //declare variables
        int met;
        int closeness;
        ArrayList<ArrayList> whereMet = new ArrayList<>();
        ArrayList<String> howClose = new ArrayList<>(); //stores questions for each category
        
        //add to whereMet ArrayList
        ArrayList<ArrayList> school = new ArrayList<>();
        ArrayList<ArrayList> work = new ArrayList<>();
        ArrayList<ArrayList> clubs = new ArrayList<>();
        ArrayList<ArrayList> sports = new ArrayList<>();
        ArrayList<ArrayList> other = new ArrayList<>();
        whereMet.add(school);
        whereMet.add(work);
        whereMet.add(clubs);
        whereMet.add(sports);
        whereMet.add(other);
        
        //add to each ArrayList in whereMet
        ArrayList<String> justMet1 = new ArrayList<>();
        ArrayList<String> justMet2 = new ArrayList<>();
        ArrayList<String> justMet3 = new ArrayList<>();
        ArrayList<String> justMet4 = new ArrayList<>();
        ArrayList<String> justMet5 = new ArrayList<>();
        
        ArrayList<String> acquaintances1 = new ArrayList<>();
        ArrayList<String> acquaintances2 = new ArrayList<>();
        ArrayList<String> acquaintances3 = new ArrayList<>();
        ArrayList<String> acquaintances4 = new ArrayList<>();
        ArrayList<String> acquaintances5 = new ArrayList<>();
        
        ArrayList<String> friends1 = new ArrayList<>();
        ArrayList<String> friends2 = new ArrayList<>();
        ArrayList<String> friends3 = new ArrayList<>();
        ArrayList<String> friends4 = new ArrayList<>();
        ArrayList<String> friends5 = new ArrayList<>();
        
        ArrayList<String> closeFriends1 = new ArrayList<>();
        ArrayList<String> closeFriends2 = new ArrayList<>();
        ArrayList<String> closeFriends3 = new ArrayList<>();
        ArrayList<String> closeFriends4 = new ArrayList<>();
        ArrayList<String> closeFriends5 = new ArrayList<>();
        
        ArrayList<String> bestFriends1 = new ArrayList<>();
        ArrayList<String> bestFriends2 = new ArrayList<>();
        ArrayList<String> bestFriends3 = new ArrayList<>();
        ArrayList<String> bestFriends4 = new ArrayList<>();
        ArrayList<String> bestFriends5 = new ArrayList<>();
        
        school.add(justMet1);
        school.add(acquaintances1);
        school.add(friends1);
        school.add(closeFriends1);
        school.add(bestFriends1);
        
        work.add(justMet2);
        work.add(acquaintances2);
        work.add(friends2);
        work.add(closeFriends2);
        work.add(bestFriends2);
        
        clubs.add(justMet3);
        clubs.add(acquaintances3);
        clubs.add(friends3);
        clubs.add(closeFriends3);
        clubs.add(bestFriends3);
        
        sports.add(justMet4);
        sports.add(acquaintances4);
        sports.add(friends4);
        sports.add(closeFriends4);
        sports.add(bestFriends4);
        
        other.add(justMet5);
        other.add(acquaintances5);
        other.add(friends5);
        other.add(closeFriends5);
        other.add(bestFriends5);
        
        //add questions to ArrayLists
        justMet1.add("What classes are you taking?");
        justMet1.add("What clubs are you in?");
        justMet1.add("Do you play any sports?");
        acquaintances1.add("What’s your favorite class/teacher and why?");
        acquaintances1.add("Do you like to listen to music when you study?");
        acquaintances1.add("What are you learning/doing in [insert class]?");
        friends1.add("Do you like your classmates?");
        friends1.add("If you could improve one thing about the school, what would it be?");
        friends1.add("What’s the best/worst school lunch?");
        closeFriends1.add("What’s a goal you have for yourself this year?");
        closeFriends1.add("What’s your favorite memory from school?");
        closeFriends1.add("What do you want to accomplish in the future?");
        bestFriends1.add("Do you have a crush on anyone?");
        bestFriends1.add("If you could read the mind of anyone at school, who would it be and why?");
        bestFriends1.add("How would you rate your stress levels lately?");
        
        justMet2.add("How long have you been at this job?");
        justMet2.add("Why’d you choose this job?");
        justMet2.add("What do you like to do outside of work?");
        acquaintances2.add("What’s your favorite part of the company?");
        acquaintances2.add("What was your college major?");
        acquaintances2.add("What jobs have you held before this one, if any?");
        friends2.add("What do you think of your co-workers?");
        friends2.add("Honest opinion of the company atmosphere/environment?");
        friends2.add("What are some good, convenient lunch options nearby?");
        closeFriends2.add("What could be improved about the company?");
        closeFriends2.add("What was your childhood dream job?");
        closeFriends2.add("Honest opinion of your boss/manager?");
        bestFriends2.add("Do you see yourself here in 5-10 years?");
        bestFriends2.add("If you could right now, would you switch to a different company?");
        bestFriends2.add("What’s your happiest memory working at the company?");

        justMet3.add("How long have you been playing?");
        justMet3.add("What’s your favorite part of your sport?");
        justMet3.add("Favorite athlete/musician?");
        acquaintances3.add("How long do you spend on your sport/instrument each week?");
        acquaintances3.add("What’s the hardest part about your sport/instrument?");
        acquaintances3.add("What’s your favorite snack?");
        friends3.add("If you could choose a different sport/instrument, what would it be?");
        friends3.add("Do you watch games/performances of your sport/instrument or do you only play?");
        friends3.add("What skill area of your sport/instrument do you feel you need to work on the most?");
        closeFriends3.add("Have you ever gotten hurt from your sport?");
        closeFriends3.add("Do you see yourself continuing your sport/instrument in 5 or 10 years?");
        closeFriends3.add("If you could invent your own sport/instrument, what would it be like?");
        bestFriends3.add("Describe a time you felt disappointed in your performance.");
        bestFriends3.add("What’s a challenge you’ve faced in your sport/instrument?");
        bestFriends3.add("What’s a common assumption/misconception/prejudice people hold about your sport/instrument?");
        
        justMet4.add("Why’d you come/go to the event?");
        justMet4.add("Pizza with or without pineapples?");
        justMet4.add("Do you prefer Apple or Samsung?");
        acquaintances4.add("What’s your favorite holiday?");
        acquaintances4.add("Favorite way to spend an evening?");
        acquaintances4.add("Would you rather live in the city or countryside?");
        friends4.add("Do you have a hot take?");
        friends4.add("Do you have a hidden talent?");
        friends4.add("If you had a pet parrot, what would you teach it to say?");
        closeFriends4.add("Where do you want to be/see yourself in 5 years?");
        closeFriends4.add("What’s the dumbest thing you’ve done?");
        closeFriends4.add("What is something you’ve tried that you’ll never try again?");
        bestFriends4.add("Do you believe in love at first sight?");
        bestFriends4.add("What’s the scariest thing that’s happened in your life?");
        bestFriends4.add("What’s your biggest regret in life?");
        
        justMet5.add("Where did you grow up?");
        justMet5.add("Are you multilingual?");
        justMet5.add("Do you play a sport?");
        acquaintances5.add("Do you have any siblings/pets?");
        acquaintances5.add("What’s your favorite restaurant?");
        acquaintances5.add("Is there a story behind your name?");
        friends5.add("What’s your favorite book/movie/music genre?");
        friends5.add("What’s a skill or trait you would like to learn?");
        friends5.add("Do you have any pet peeves?");
        closeFriends5.add("What’s your biggest fear?");
        closeFriends5.add("What advice would you give your younger self?");
        closeFriends5.add("What’s your favorite way to destress?");
        bestFriends5.add("What’s a secret you haven’t told anyone?");
        bestFriends5.add("What's your love language?");
        bestFriends5.add("What’s your relationship with your parents like?");
        
        //ask for user input
        System.out.println("-------------------------------------------------------------");
        System.out.println("     Where did you guys meet or see each other the most?");
        System.out.println("-------------------------------------------------------------");
        System.out.println("1. School");
        System.out.println("2. Work");
        System.out.println("3. Sports/Music");
        System.out.println("4. Social Event");
        System.out.println("5. Other");
        System.out.println("");
        met = keyboard.nextInt();
        
        System.out.println("");
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("     How close are you?");
        System.out.println("----------------------------");
        System.out.println("1. Just met");
        System.out.println("2. Acquaintances");
        System.out.println("3. Friends");
        System.out.println("4. Close Friends");
        System.out.println("5. Best Friends");
        System.out.println("");
        closeness = keyboard.nextInt();
        
        //output conversation questions from ArrayList
        ArrayList<ArrayList> whereMetList = whereMet.get(met - 1);
        ArrayList<String> howCloseList = whereMetList.get(closeness - 1);
        
        System.out.println("");
        System.out.println("");
        System.out.println("--------------------------------");
        System.out.println("     Conversation Questions");
        System.out.println("--------------------------------");
        for(int i = 0; i < howCloseList.size(); i++) {
            String question = howCloseList.get(i);
            
            System.out.println((i + 1) + ". " + question);
        }
    }
}