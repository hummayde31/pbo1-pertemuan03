package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 5300;
        double uangDiDompet = 2500;

        if(uangDiDompet<totalBelanja){
            System.out.println("Uang kurang, kurangin jajan anda");
        }else{
            System.out.println("Uang cukup, selamat menikmati");
        }
    }
}
