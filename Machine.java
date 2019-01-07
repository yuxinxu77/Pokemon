import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Machine extends Player {
    public ArrayList<Integer> excludelist = new ArrayList<>();

    public Machine(){
        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        this.choiceindex_1 = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        excludelist.add(this.choiceindex_1);
        this.choiceindex_2 = GetRandomWithExclusion(1,10,excludelist);
        excludelist.add(this.choiceindex_2);
        this.choiceindex_3 = GetRandomWithExclusion(1,10,excludelist);

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

        System.out.print("System's choices: " +this.choicelist.get(0).name+" " +choicelist.get(1).name+" " +choicelist.get(2).name);
        System.out.print("\n");
        System.out.print("\n");
    }

    public int GetRandomWithExclusion(int min, int max, ArrayList<Integer> exclusion) {
        int Random = ThreadLocalRandom.current().nextInt(min, max + 1);
        while (this.Contain(Random, exclusion) == true) {
            if (Random ==10){
                Random = 1;
            }
            else{Random++;}
        }
        return Random;
    }

    //whether the excludelist contains the random number
    public Boolean Contain(int num, ArrayList<Integer> exclusion){
        Boolean contain = false;
        for (int exclude : exclusion){
            if(num == exclude){
                contain = true;
            }
        }
        return contain;
    }
}
