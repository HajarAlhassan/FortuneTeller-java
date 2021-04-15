package com.tts;
import java.util.Random;
import java.util.Scanner;

public class FortuneTeller {
    public static int nameFortune(String name,String lname) {
        Random randNum=new Random();
         int length=  name.concat(lname).length();

       return randNum.nextInt(length);
    }

    public static String colorFortune(String color) {
        String text="Your Sweet";
        String[] fortune = new String[7];
        fortune[0]= "You are brave like a LION";
        fortune[1]= "You are loyal like a DOG";
        fortune[2]= "You are magical like a UNICORN.";
        fortune[3]= "You are wild like a STALLION";
        fortune[4]= "You are strong like a TIGER";
        fortune[5]= "You are Lovely like a cat";
        fortune[6]= "You are shy  like a TURTLE";
        switch (color.toLowerCase()){
            case "RED":
                text= fortune[0];
                break;
            case "BLUE":
                text= fortune[1];
                break;
            case "VIOLET":
                text=  fortune[2];
                break;
            case "YELLOW":
                text= fortune[3];
                break;
            case "GREEN":
                text=  fortune[4];
                break;
            case "ORANGE":
                text=  fortune[5];
                break;
            case "INDIGO":
                text=  fortune[6];

        }
        return text;
    }


    public static String siblingsFortune(int siblingsnum) {
        String text="";
        String[] fortune = new String[6];
        fortune[0]= "Your ability to juggle many tasks will take you far";
        fortune[1]= "Your loyalty is a virtue, but not when it’s wedded with blind stubbornness.";
        fortune[2]= "You will inherit a large sum of money.";
        fortune[3]= "You will get an A on your next test";
        fortune[4]= "Someone special will be coming into your life shortly";
        fortune[5]= "Real Love will be coming into your life shortly";
        switch (siblingsnum){
            case 0:
                text=  fortune[0];
                break;
            case 1:
                text=  fortune[1];
                break;
            case 2:
                text=  fortune[2];
                break;
            case 3:
                text=  fortune[3];
                break;
            case 4:
                text=  fortune[4];
                break;
            default:
                text=  fortune[5];
                break;
        }
        return text;
    }

    public static String monthFortune(int month) {
        String text="";
        String[] fortune = new String[6];
        fortune[0]= "A lifetime of happiness lies ahead of you.";
        fortune[1]= "A good friendship is often more important than a passionate romance.";
        fortune[2]= "A smooth long journey! Great expectations.";
        fortune[3]= "Allow compassion to guide your decisions.";
        fortune[4]= "Be careful or you could fall for some tricks today.";
        fortune[5]= "At the touch of love, everyone becomes a poet.";
        switch (month){
            case 1:
            case 2:
                text=  fortune[0];
                break;
            case 3:
            case 4:
                text=  fortune[1];
                break;
            case 5:
            case 6:
                text=  fortune[2];
                break;
            case 7:
            case 8:
                text=  fortune[3];
                break;
            case 9:
            case 10:
                text=  fortune[4];
                break;
            case 11:
            case 12:
                text=  fortune[5];
                break;
        }
        return text;
    }
    public static void main(String[] args) {

        String[] roygbiv={"RED","ORANGE","GREEN","BLUE","INDIGO","VIOLET"};
        String fName;
        String lName;
        String input;
        int age=0;
        int month=0;
        String favColor;
        int siblings=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hello!!!!!");
        System.out.println("Do you want to have little fun????");
        String play=scanner.nextLine();
        while(play.equalsIgnoreCase("yes")||play.equalsIgnoreCase("y")){
        System.out.println("Enter your first name please:");
         fName=scanner.nextLine();
            if(fName.equalsIgnoreCase("Quit")||fName.equalsIgnoreCase("q"))  break;
        System.out.println("Enter your last name please:");
          lName=scanner.nextLine();
            if(lName.equalsIgnoreCase("Quit")||lName.equalsIgnoreCase("q"))  break;
        System.out.println("Enter your age please:");
            input=scanner.nextLine();
        age=Integer.parseInt(input);
            if(input.equalsIgnoreCase("Quit")||input.equalsIgnoreCase("q"))  break;
        System.out.println("Enter your birth month please:");
        input=scanner.nextLine();
        month=Integer.parseInt(input);
            if(input.equalsIgnoreCase("Quit")||input.equalsIgnoreCase("q"))  break;
        System.out.println("Enter your ROYGBIV color please,\nIf you don't know what ROYGBIV color enter HELP!");
            favColor=scanner.nextLine();
            if(input.equalsIgnoreCase("Quit")||input.equalsIgnoreCase("q"))  break;
            if(favColor.equalsIgnoreCase("help")){
                System.out.println("This is the list of ROYGBIV color:");
               System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.");
                System.out.println("Now Enter your ROYGBIV color please:");
                favColor=scanner.nextLine();
           }

            String text=fName+" "+lName+"Welcome To Future Teller!\n I Shall Tell Your Fortune!\n" +
                    "For "+age+" % you are: "+colorFortune(favColor)+" Looking into my crystal ball, your lucky number is ("+nameFortune(fName,lName)+").\n I see that...."+siblingsFortune(siblings)+"! You will be the guy/girl who will be able to solve any problem anyone throws at you!\n You are also very serious about your future!\n" +
                    " (Remember, this test is just for fun. Do not take this personally! Thank you!) \nGOOD LUCK WITH WHATEVER LIFE HOLDS FOR YOU!\n" ;

            System.out.println(text);
            System.out.println("Do you want to play again????");
            play=scanner.nextLine();

        }


        }

    }


