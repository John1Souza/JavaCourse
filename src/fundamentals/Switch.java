package fundamentals;

import org.w3c.dom.ls.LSOutput;

public class Switch {

    public static void main(String[] args) {
        String faixa = "brown";

        switch (faixa.toLowerCase()){
        case "black":
            System.out.println("I have knowledge of Bassai-dai...");
        case "brown":
            System.out.println("I have knowledge of Tekki Shodan...");
        case "purple":
            System.out.println("I have knowledge of Tekki Shodan...");
        case "green":
            System.out.println("I have knowledge of Tekki Shodan...");
        case "orange":
            System.out.println("I have knowledge of Tekki Shodan...");
        case "red":
            System.out.println("I have knowledge of Tekki Shodan...");
        case "yellow":
            System.out.println("I have knowledge of Tekki Shodan...");
            break;
        default:
            System.out.println("I don't have knowledge about Karate...");
        }

        System.out.println("Fim!");

        int idade = 3;
        switch (idade){
            case 3:
                System.out.println("knows how to program");
            case 2:
                System.out.println("knows how to speak");
            case 1:
                System.out.println("knows how to walk");
            case 0:
                System.out.println("knows how to breath");
        }
    }


}
