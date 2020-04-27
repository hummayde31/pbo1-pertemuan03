package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 25000;
        double uangDiDompet = 25000;

        if(uangDiDompet<totalBelanja){
            System.out.println("Uang kurang, kurangin jajan anda");
        }else{
            System.out.println("Uang cukup, berelaan lah");
        }
    }
}
