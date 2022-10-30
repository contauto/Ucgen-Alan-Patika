import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double[] kenarlar={0,0,0};
        double cevre=0;
        double u=0;
        double alan=0;
        for(int i=0;i<kenarlar.length;i++){
            System.out.println(i+1+". Kenarı Giriniz");
        kenarlar[i]=scanner.nextFloat();
        cevre=cevre+kenarlar[i];
        }
        u=cevre/2;
        alan=sqrt(u*(u-kenarlar[0])*(u-kenarlar[1])*(u-kenarlar[2]));
        System.out.println("Üçgenin alanı: "+alan);

    }
}
