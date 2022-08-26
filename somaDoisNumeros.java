import java.util.*;

class somaDoisNumeros{
    public static Scanner sc  = new Scanner(System.in);
    public static void main (String[] args){
        int num1 = 0, int num2 = 0, int soma =0;
        System.out.println("Digite um numero");
        num1 = sc.nextInt();
        System.out.println("Digite um numero");
        num2 = sc.nextInt();
        soma = num1 + num2;
        System.out.println("Soma" + soma);
}
}