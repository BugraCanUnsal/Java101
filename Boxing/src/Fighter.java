public class Fighter {
    String name;
    int damage;
    int weight;
    int health;
    int dodge;

    public Fighter(String name, int damage, int weight, int health, int dodge) {
        this.name = name;
        this.damage = damage;
        this.weight = weight;
        this.health = health;
        if (dodge> 100 && dodge<0){
            this.dodge = 0;
        }else this.dodge = dodge;
    }

    public int hit(Fighter foe){
        if (foe.isDodged()){
            System.out.println(foe.name + " gelen hasardan kacindi.");
            return foe.health;
        }
        foe.health-=this.damage;
        System.out.println(this.name + "-->" + foe.name  + " " +this.damage + " hasar vurdu.");
        System.out.println(foe.name + "'nin cani " + foe.health + " kaldi." );
        return foe.health;
    }

    public boolean isDodged(){
        double random = Math.random() * 100;
        return random <= this.dodge;
    }
}
