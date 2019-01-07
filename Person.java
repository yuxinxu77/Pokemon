import java.util.Scanner;

public class Person extends Player{

    public Person(){

        //Take user input
        Scanner input = new Scanner(System.in);
        //Print out all Pokemon choices and their corresponding index
        for (int i = 0; i < 10; i++) {
            System.out.println(optionlist.get(i).name + " " + (i + 1));
        }

        //ask user to choose 1st Pokemon
        System.out.println("Choose your Pokemon from under, 3 out of 10. Choose your first Pokemon and input its index.");
        String input2 = input.next();
        this.choiceindex_1 = Integer.parseInt(input2);


        //ask user to choose 2nd Pokemon
        System.out.println("Go ahead and choose your second Pokemon and type in its index.");
        String input3 = input.next();
        this.choiceindex_2 = Integer.parseInt(input3);

        //ask user to choose 3rd Pokemon
        System.out.println("Choose your last Pokemon and type in its index.");
        String input4 = input.next();
        this.choiceindex_3 = Integer.parseInt(input4);


        //form player's choice list, with order following user's choices
        for (int i = 0; i < 10; i++) {
            if (i == choiceindex_1-1) {
                choicelist.add(optionlist.get(i));
            }
        }

        for (int i = 0; i < 10; i++) {
            if (i == choiceindex_2-1) {
                choicelist.add(optionlist.get(i));
            }
        }

        for (int i = 0; i < 10; i++) {
            if (i == choiceindex_3-1) {
                 choicelist.add(optionlist.get(i));
            }
        }

        System.out.print("Your choices: " +this.choicelist.get(0).name+" " +choicelist.get(1).name+" " +choicelist.get(2).name);
        System.out.print("\n");
        System.out.print("\n");
        }
}