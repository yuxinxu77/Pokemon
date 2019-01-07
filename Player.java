import java.util.ArrayList;

public class Player extends PokemonGame {
    public Integer choiceindex_1;
    public Integer choiceindex_2;
    public Integer choiceindex_3;
    public ArrayList<Pokemon> optionlist = new ArrayList<Pokemon>();
    public ArrayList<Pokemon> choicelist = new ArrayList<Pokemon>();

    public Player(){
        //Instantiate 10 Pokemon
        DragonPokemon pokemon1 = new DragonPokemon("Dragonite", 1, "Flying", 386, 403, 317, 328, 328, 284, "Dragon Tail", "Dragon Rush", "Outrage", "Dragon", "Dragon", "Dragon", 60, 100, 120);

        DragonPokemon pokemon2 = new DragonPokemon("Garchomp", 2, "Ground", 420, 394, 317, 284, 295, 333, "Dragon Rush", "Outrage", "Dragon Claw", "Dragon", "Dragon", "Dragon", 100, 120, 80);

        DragonPokemon pokemon3 = new DragonPokemon("Altaria", 3, "Flying", 354, 262, 306, 262, 339, 284, "Dragon Breath", "Dragon Rush", "Dragon Pulse", "Dragon", "Dragon", "Dragon", 60, 100, 85);

        DragonPokemon pokemon4 = new DragonPokemon("Salamence", 4, "Flying", 394, 405, 284, 350, 284, 328, "Dragon Breath", "Dragon Tail", "Dragon Claw", "Dragon", "Dragon", "Dragon", 60, 60, 80);

        DragonPokemon pokemon5 = new DragonPokemon("Giratina", 5, "Ghost", 504, 328, 372, 328, 372, 306, "Dragon Breath", "Dragon Claw", "Outrage", "Dragon", "Dragon", "Dragon", 60, 80, 120);

        DragonPokemon pokemon6 = new DragonPokemon("Palkia", 6, "Water", 384, 372, 328, 438, 372, 328, "Dragon Breath", "Dragon Claw", "Spacial Rend", "Dragon", "Dragon", "Dragon", 60, 80, 100);

        DragonPokemon pokemon7 = new DragonPokemon("Dialga", 7, "Steel", 404, 372, 372, 438, 328, 306, "Dragon Breath", "Dragon Claw", "Roar of Time", "Dragon", "Dragon", "Dragon", 60, 80, 150);

        DragonPokemon pokemon8 = new DragonPokemon("Rayquaza", 8, "Flying", 414, 438, 306, 438, 306, 317, "Dragon Pulse", "Dragon Claw", "Outrage", "Dragon", "Dragon", "Dragon", 85, 80, 120);

        DragonPokemon pokemon9 = new DragonPokemon("Ampharos", 9, "Electric", 384, 273, 295, 361, 306, 229, "Dragon Pulse", "Dragon Pulse", "Outrage", "Dragon", "Dragon", "Dragon", 85, 85, 120);

        DragonPokemon pokemon10 = new DragonPokemon("Latias", 10, "Psychic", 264, 284, 306, 350, 394, 350, "Dragon Breath", "Dragon Pulse", "Outrage", "Dragon", "Dragon", "Dragon", 60, 85, 120);


        //Form an Arraylist of 10 Pokemon
        optionlist.add(pokemon1);
        optionlist.add(pokemon2);
        optionlist.add(pokemon3);
        optionlist.add(pokemon4);
        optionlist.add(pokemon5);
        optionlist.add(pokemon6);
        optionlist.add(pokemon7);
        optionlist.add(pokemon8);
        optionlist.add(pokemon9);
        optionlist.add(pokemon10);
    }

}
