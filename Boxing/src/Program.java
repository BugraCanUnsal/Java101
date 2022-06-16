public class Program {
    public static void main(String[] args) {
        Fighter a = new Fighter("A",10,100,100,22);
        Fighter b = new Fighter("B",10,100,100,22);

        Match msg = new Match(a,b,120,90);

        msg.run();
    }
}
