public class FlyingPokemon extends Pokemon {
    public String poketype2;

    public FlyingPokemon() {
        super();
        this.poketype1 = "Flying";
    }
    public void initialize(String name, String type2,double hp, double attack, double defense, double sp_ack, double sp_def, double speed, String skill1type, String skill2type, String skill3type,double skill1power,double skill2power,double skill3power) {
        this.name = name;
        this.poketype2 = type2;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.sp_ack = sp_ack;
        this.sp_def = sp_def;
        this.speed = speed;
        this.skill2type = skill1type;
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

    public void Pokemon4() {
        initialize("Salamence", "Dragon", 394, 405, 284, 350, 284, 328, "Dragon", "Dragon", "Dragon",60,60,80);
        this.index = 4;
        this.skill1 = "Dragon Breath"; //Dragon  60;100
        this.skill2 = "Dragon Tail"; //Dragon 60;90
        this.skill3 = "Dragon Claw"; //Dragon 80;100
    }
}
