public class DragonPokemon extends Pokemon {
    public String poketype2;


    public DragonPokemon() {
        super();
        this.poketype1 = "Dragon";
        this.mortality=Isalive(this.hp);
    }
    public DragonPokemon(String name, int i, String poketype2, double hp, double attack, double defense, double sp_ack, double sp_def, double speed, String skill1, String skill2, String skill3, String skill1type, String skill2type, String skill3type, double skill1power, double skill2power, double skill3power){
        this.name = name;
        this.index = i;
        this.poketype2 = poketype2;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.sp_ack = sp_ack;
        this.sp_def = sp_def;
        this.speed = speed;
        this.skill1 = skill1;
        this.skill2 = skill2;
        this.skill3 = skill3;
        this.skill1type = skill1type;
        this.skill2type = skill2type;
        this.skill3type = skill3type;
        this.skill1power = skill1power;
        this.skill2power = skill2power;
        this.skill3power = skill3power;
        this.mortality = Isalive(this.hp);
    }

    public Boolean Isalive(double health){
        return (health>0);
    }
}