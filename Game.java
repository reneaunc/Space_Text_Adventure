public class Game{
    static String player_name;
    static int player_age;
    static String background;
    public static void main(String[] args){
        Beginning();
    }
    public static void Beginning(){
        System.out.println("Hello there Stranger, glad you're here. You've entered the universe of Cosmos");
        System.console().readLine();
        System.out.println("I'm sure you're anxious to get started but first I need to ask you some questions. What's your name?: ");
        player_name = System.console().readLine();
        System.out.println("How old are you: ");
        player_age = Integer.parseInt(System.console().readLine());
        System.out.println("Alright " + player_name + ", if you had to choose one of these colors, which would you pick?: \n 1) Blue \n 2) Red \n 3) Yellow \n 4) Green \n Choose the number beside the color you'd pick");
        int intro_choice1 = Integer.parseInt(System.console().readLine());
        System.out.println(player_name + ", If you had to be one of these animals, which would you pick?: \n 1) Monkey \n 2) Snake \n 3) Hawk \n 4) Wolf \n Choose the number beside the animal you'd be");
        int intro_choice2 = Integer.parseInt(System.console().readLine());
        System.out.println("You can only save one person from a burning building, who do you save? \n 1) Parent \n 2) Sibling \n 3) Best Friend \n 4) Unknown Child \n Choose the number next to who you'd save");
        int intro_choice3 = Integer.parseInt(System.console().readLine());
        System.out.println("Last question " + player_name + ". You see a friend of yours doing something illegal. Do you \n 1) Call the authorites \n 2) Try and talk them out of it \n 3) Ignore them \n 4) Join them \n Choose the number next to your decision");
        int intro_choice4 = Integer.parseInt(System.console().readLine());
        int choices = intro_choice1 + intro_choice2 + intro_choice3 + intro_choice4;
        if(4 <= choices && choices <= 6){
            background = "orphan";
        }
        else if(7 <= choices && choices <= 10){
            background = "star student";
        }
        else if(11<= choices && choices <= 14){
            background = "refugee";
        }
        else if((15 <= choices && choices <= 16) || choices < 4 || choices > 16){
            background = "rebel";
        }
        System.out.println("Alright " + player_name + ". You are a " + player_age + " year old new graduate of the Grand Star Academy");
        System.console().readLine();
        if(background == "orphan"){
            System.out.println("Having been found without parents, you were placed into the foster care at a young age.\n After seeing the promise you had, you were admitted into the Star Academy");
        }
        else if(background == "star student"){
            System.out.println("Always excelling in school, you were a no brainer for a spot at the academy.\n Here you continued to perform extraordinarily well, quickly rising to the top of your class.");
        }
        else if(background == "refugee"){
            System.out.println("Having been brought to Corellis at a young age by a family fleeing from war, you always strived to go back to space and reclaim the home you lost.\n The quickest wat for you to do that was graduate from the Star Academy. So that's what you did.");
        }
        else if(background == "rebel"){
            System.out.println("It's a wonder you even graduated. A rule-breaker in every sense of the word, you've been reprimanded more times than you can count.\n But where your attitdued fails, your flying skills don't. Reckless but brave, you are a force to be reckoned with.");
        }
        System.console().readLine();
        System.out.println("No matter the how or why of you graduating from the Academy, you have done it. Congratualtions to you " + player_name +". And congratualtions to the class Academy class of 3040");
        System.console().readLine();
        System.out.println("Due to our severe needs for pilots, you will all be fitted with solar transports and sent out to the great unknown!! For honor and glory. And the salvation of the Federation!!");
        System.console().readLine();
        System.out.println("What would you like to name your new ship?: ");
        String ship_name = System.console().readLine();
        Ship your_ship = new Ship(ship_name, 2, 1, false, false, false);
        System.out.println("The world will finally get to see Captain " + player_name + " and the " + your_ship.name + " fly into action!!");
        System.console().readLine();
    }
}