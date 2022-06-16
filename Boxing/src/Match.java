public class Match {
    Fighter f1;
    Fighter f2;
    int maxWeight;
    int minWeight;

    public Match(Fighter f1, Fighter f2, int maxWeight, int minWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    public void run(){
        if (isCheck()){
            double random = Math.random()*100;
            if (50<random){
                System.out.println(this.f1.name + " basliyor.\n=======================");
                while (this.f1.health>0 && this.f2.health>0){
                    System.out.println("----------Yeni Round---------");
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWinner()){
                        break;
                    }
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWinner()){
                        break;
                    }
                }
            } else if (50>=random) {
                System.out.println(this.f2.name + " basliyor.\n=======================");
                while (this.f1.health>0 && this.f2.health>0){
                    System.out.println("----------Yeni Round---------");
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWinner()){
                        break;
                    }
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWinner()){
                        break;
                    }
                }
            }
        }else {
            System.out.println("Sporcularin sikletleri uymuyor!");
        }
    }

    public boolean isCheck(){
        return (this.f1.weight>=minWeight && this.f1.weight<= maxWeight) && (this.f2.weight>= minWeight && this.f2.weight<=maxWeight);
    }

    public boolean isWinner(){
        if (this.f2.health <=0){
            System.out.println("Kazanan " + this.f1.name);
            return true;
        } else if (this.f1.health<=0) {
            System.out.println("Kazanan " + this.f2.name);
            return true;
        }else
            return false;
    }
}
