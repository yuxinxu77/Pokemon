import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

// READ ME   READ ME   READ ME
// This is a game of 1 player a 1 machine battling, each with 3 pokemon. Their pokemon should be chosen from the 10 pokemon printed in the beginning.
//
// First round : Player1's first pokemon VS Player2's first pokemon.
// Each pokemon has 3 skills. If player happen to type in a wrong index(other than 1-3), skill chosen will be set into 1 as default.
// If either pokemon died, the player of that side can choose from their 2 left pokemon to continue the battle.
// If player happen to type in a wrong index when choosing pokemon to battle(1-2), default will send the second pokemon in the initial order to battle.
// The game ends when either side has all 3 pokemon died.


public class PokemonBattle extends PokemonGame {
    static Integer playerchoice;
    static Integer machinechoice;
    static Integer movesfirst;

    public PokemonBattle() {
    }

    public static void main(String args[]) {
        //instantiate a player and a machine
        Person player = new Person();
        Machine machine = new Machine();

        //Assign player and machine's initial choice pokemon for battle
        playerchoice=0;
        machinechoice=0;

        //decide who get to be the first to move
        if ((player).choicelist.get(0).speed < (machine).choicelist.get(0).speed) {
            movesfirst=1; }
            else {movesfirst=0; }

        System.out.println((player).choicelist.get(0).name + " vs " + ((machine).choicelist.get(0).name));
        System.out.println("\n");

        while(((player).choicelist.get(0).mortality==true || (player).choicelist.get(1).mortality==true || (player).choicelist.get(2).mortality==true)&&((machine).choicelist.get(0).mortality==true || (machine).choicelist.get(1).mortality==true || (machine).choicelist.get(2).mortality==true)){
            if(movesfirst==0){//if player moves first
                System.out.println("Player's turn.\n");
                System.out.println("Player's pokemon: "+(player).choicelist.get(playerchoice).name);
                System.out.println((player).choicelist.get(playerchoice).skill1+"  "+(player).choicelist.get(playerchoice).skill2+"  "+(player).choicelist.get(playerchoice).skill3);
                System.out.println("Choose your move and type in its index (1-3)\nAny number that's not 1,2 or 3 will be set to 3 as default");

                //Take user input
                Scanner input = new Scanner(System.in);
                String input2 = input.next();
                Integer playermove = Integer.parseInt(input2);
                if(playermove==1){
                    System.out.println("Player's move: "+(player).choicelist.get(playerchoice).skill1);
                    (machine).choicelist.get(machinechoice).hp-=(player).choicelist.get(playerchoice).skill1power;
                    System.out.println((machine).choicelist.get(machinechoice).name+"'s hp -"+(player).choicelist.get(playerchoice).skill1power);
                }else if(playermove==2){
                    System.out.println("Player's move: "+(player).choicelist.get(playerchoice).skill2);
                    (machine).choicelist.get(machinechoice).hp-=(player).choicelist.get(playerchoice).skill2power;
                    System.out.println((machine).choicelist.get(machinechoice).name+"'s hp -"+(player).choicelist.get(playerchoice).skill2power);
                }else{
                    System.out.println("Player's move: "+(player).choicelist.get(playerchoice).skill3);
                    (machine).choicelist.get(machinechoice).hp-=(player).choicelist.get(playerchoice).skill3power;
                    System.out.println((machine).choicelist.get(machinechoice).name+"'s hp -"+(player).choicelist.get(playerchoice).skill3power);
                }

                //If either on-battling pokemon died, turn its mortality to false
                (player).choicelist.get(playerchoice).mortality=((DragonPokemon)player.choicelist.get(playerchoice)).Isalive((player).choicelist.get(playerchoice).hp);
                (machine).choicelist.get(machinechoice).mortality=((DragonPokemon)machine.choicelist.get(machinechoice)).Isalive((machine).choicelist.get(machinechoice).hp);

                if((machine).choicelist.get(1).mortality==false && (machine).choicelist.get(2).mortality==false){
                    break;
                }

                //Machine's turn
                System.out.println("\n");
                System.out.println("Machine's turn.\n");
                System.out.println("Machine's pokemon: "+(machine).choicelist.get(machinechoice).name);
                Integer machinemove = ThreadLocalRandom.current().nextInt(1, 4);
                if(machinemove==1){
                    System.out.println("Machine's move: "+(machine).choicelist.get(machinechoice).skill1);
                    (player).choicelist.get(playerchoice).hp-=(machine).choicelist.get(machinechoice).skill1power;
                    System.out.println((player).choicelist.get(playerchoice).name+"'s hp -"+(machine).choicelist.get(machinechoice).skill1power);
                }else if(machinemove==2){
                    System.out.println("Machine's move: "+(machine).choicelist.get(machinechoice).skill2);
                    (player).choicelist.get(playerchoice).hp-=(machine).choicelist.get(machinechoice).skill2power;
                    System.out.println((player).choicelist.get(playerchoice).name+"'s hp -"+(machine).choicelist.get(machinechoice).skill2power);
                }else{
                    System.out.println("Machine's move: "+(machine).choicelist.get(machinechoice).skill3);
                    (player).choicelist.get(playerchoice).hp-=(machine).choicelist.get(machinechoice).skill3power;
                    System.out.println((player).choicelist.get(playerchoice).name+"'s hp -"+(machine).choicelist.get(machinechoice).skill3power);
                }
            }
            if(movesfirst==1){//if machine moves first
                //Machine's turn
                System.out.println("Machine's turn.\n");
                System.out.println("Machine's pokemon: "+(machine).choicelist.get(machinechoice).name);
                Integer machinemove = ThreadLocalRandom.current().nextInt(1, 4);
                if(machinemove==1){
                    System.out.println("Machine's move: "+(machine).choicelist.get(machinechoice).skill1);
                    (player).choicelist.get(playerchoice).hp-=(machine).choicelist.get(machinechoice).skill1power;
                    System.out.println((player).choicelist.get(playerchoice).name+"'s hp -"+(machine).choicelist.get(machinechoice).skill1power);
                }else if(machinemove==2){
                    System.out.println("Machine's move: "+(machine).choicelist.get(machinechoice).skill2);
                    (player).choicelist.get(playerchoice).hp-=(machine).choicelist.get(machinechoice).skill2power;
                    System.out.println((player).choicelist.get(playerchoice).name+"'s hp -"+(machine).choicelist.get(machinechoice).skill2power);
                }else{
                    System.out.println("Machine's move: "+(machine).choicelist.get(machinechoice).skill3);
                    (player).choicelist.get(playerchoice).hp-=(machine).choicelist.get(machinechoice).skill3power;
                    System.out.println((player).choicelist.get(playerchoice).name+"'s hp -"+(machine).choicelist.get(machinechoice).skill3power);
                }

                //If either on-battling pokemon died, turn its mortality to false
                (player).choicelist.get(playerchoice).mortality=((DragonPokemon)player.choicelist.get(playerchoice)).Isalive((player).choicelist.get(playerchoice).hp);
                (machine).choicelist.get(machinechoice).mortality=((DragonPokemon)machine.choicelist.get(machinechoice)).Isalive((machine).choicelist.get(machinechoice).hp);

                if((player).choicelist.get(1).mortality==false && (player).choicelist.get(2).mortality==false){
                    break;
                }


                //Player's turn
                System.out.println("\n");
                System.out.println("Player's turn.\n");
                System.out.println("Player's pokemon: "+(player).choicelist.get(playerchoice).name);
                System.out.println((player).choicelist.get(playerchoice).skill1+"  "+(player).choicelist.get(playerchoice).skill2+"  "+(player).choicelist.get(playerchoice).skill3);
                System.out.println("Choose your move and type in its index (1-3)\nAny number that's not 1,2 or 3 will be set to 3 as default");

                //Take user input
                Scanner input = new Scanner(System.in);
                String input2 = input.next();
                Integer playermove = Integer.parseInt(input2);
                if(playermove==1){
                    System.out.println("Player's move: "+(player).choicelist.get(playerchoice).skill1);
                    (machine).choicelist.get(machinechoice).hp-=(player).choicelist.get(playerchoice).skill1power;
                    System.out.println((machine).choicelist.get(machinechoice).name+"'s hp -"+(player).choicelist.get(playerchoice).skill1power);
                }else if(playermove==2){
                    System.out.println("Player's move: "+(player).choicelist.get(playerchoice).skill2);
                    (machine).choicelist.get(machinechoice).hp-=(player).choicelist.get(playerchoice).skill2power;
                    System.out.println((machine).choicelist.get(machinechoice).name+"'s hp -"+(player).choicelist.get(playerchoice).skill2power);
                }else{
                    System.out.println("Player's move: "+(player).choicelist.get(playerchoice).skill3);
                    (machine).choicelist.get(machinechoice).hp-=(player).choicelist.get(playerchoice).skill3power;
                    System.out.println((machine).choicelist.get(machinechoice).name+"'s hp -"+(player).choicelist.get(playerchoice).skill3power);
                }
            }

            //If either on-battling pokemon died, turn its mortality to false
            (player).choicelist.get(playerchoice).mortality=((DragonPokemon)player.choicelist.get(playerchoice)).Isalive((player).choicelist.get(playerchoice).hp);
            (machine).choicelist.get(machinechoice).mortality=((DragonPokemon)machine.choicelist.get(machinechoice)).Isalive((machine).choicelist.get(machinechoice).hp);


            //Test whether either on-battling pokemon dead
            if((player).choicelist.get(playerchoice).mortality==false) {
                System.out.println((player).choicelist.get(playerchoice).name + " is dead");
                if ((player).choicelist.get(1).mortality==false && (player).choicelist.get(2).mortality==true) {
                    System.out.println("Player's Pokemon left: "+(player).choicelist.get(2).name);
                    playerchoice=2;
                    movesfirst=1;
                    System.out.println("Player's next choice: "+(player).choicelist.get(playerchoice).name);
                }else if((player).choicelist.get(2).mortality==false && (player).choicelist.get(1).mortality==true){
                    System.out.println("Player's Pokemon left: "+(player).choicelist.get(1).name);
                    playerchoice=1;
                    movesfirst=1;
                    System.out.println("Player's next choice: "+(player).choicelist.get(playerchoice).name);
                }else if((player).choicelist.get(1).mortality && (player).choicelist.get(2).mortality){
                    System.out.println("Player's Pokemon left: "+(player).choicelist.get(1).name+"  "+(player).choicelist.get(2).name);
                    System.out.println("Choose your next battle pokemon and type in its index(1 or 2)");
                    Scanner input = new Scanner(System.in);
                    String input3 = input.next();
                    playerchoice=Integer.parseInt(input3);
                    movesfirst=1;
                    System.out.println("Player's next choice: "+(player).choicelist.get(playerchoice).name);

                }else{
                    break;
                }
            }
            if((machine).choicelist.get(machinechoice).mortality==false){
                System.out.println((machine).choicelist.get(machinechoice).name+" is dead");
                if((machine).choicelist.get(1).mortality==false && (machine).choicelist.get(2).mortality==true){
                    System.out.println("Machine's Pokemon left: "+(machine).choicelist.get(2).name);
                    machinechoice=2;
                    movesfirst=0;
                    System.out.println("Machine's next choice: "+(machine).choicelist.get(machinechoice).name);
                }else if((machine).choicelist.get(2).mortality==false && (machine).choicelist.get(1).mortality){
                    System.out.println("Machine's Pokemon left: "+(machine).choicelist.get(1).name);
                    machinechoice=1;
                    movesfirst=0;
                    System.out.println("Machine's next choice: "+(machine).choicelist.get(machinechoice).name);
                }else if((machine).choicelist.get(1).mortality && (machine).choicelist.get(2).mortality){
                    System.out.println("Machine's Pokemon left: "+(machine).choicelist.get(1).name+"  "+(machine).choicelist.get(2).name);
                    machinechoice = ThreadLocalRandom.current().nextInt(1,3);
                    movesfirst=0;
                    System.out.println("Machine's next choice: "+(machine).choicelist.get(machinechoice).name);
                }else{
                    break;
                }
            }
        }
            System.out.println("\n");
            System.out.println("Game ends.");
            System.out.println("Player's condition:");
            System.out.println((player).choicelist.get(0).name + "| hp: " + (player).choicelist.get(0).hp);
            System.out.println((player).choicelist.get(1).name + "| hp: " + (player).choicelist.get(1).hp);
            System.out.println((player).choicelist.get(2).name + "| hp: " + (player).choicelist.get(2).hp);
            System.out.println("\n");
            System.out.println("Machine's condition:");
            System.out.println((machine).choicelist.get(0).name + "| hp: " + (machine).choicelist.get(0).hp);
            System.out.println((machine).choicelist.get(1).name + "| hp: " + (machine).choicelist.get(1).hp);
            System.out.println((machine).choicelist.get(2).name + "| hp: " + (machine).choicelist.get(2).hp);
            System.out.println("\n");

            //declare winner
            if ((machine).choicelist.get(0).mortality==false && (machine).choicelist.get(1).mortality==false && (machine).choicelist.get(2).mortality==false) {
                System.out.println("Player wins!");
            }
            else {
                System.out.println("Machine wins!");
            }
    }
}