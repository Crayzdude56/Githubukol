import java.util.Scanner;
public class Metoda {
    Scanner sc = new Scanner(System.in);
    int vypiscislo;
        int i = 1;

        public void ukol3(){

            System.out.println("napis cislo");
            int vypiscislo = sc.nextInt();
            System.out.print(vypiscislo);

            if ( vypiscislo < 0){

                System.out.println("Cislo je zaporne");
            }

            if ( vypiscislo == 0){

                System.out.println("0");
            }

            if ( vypiscislo > 12){

                System.out.println("Moc velke cislo");
            }
            if ( vypiscislo == 11){

                System.out.println("Cislo je jedenact");
            } if ( vypiscislo == 10){

                System.out.println("Cislo je deset");
            } if ( vypiscislo == 9){

                System.out.println("Cislo je devet");
            } if ( vypiscislo == 8){

                System.out.println("Cislo je osm");
            } if ( vypiscislo == 7){

                System.out.println("Cislo je sedm");
            } if ( vypiscislo == 6 ){

                System.out.println("Cislo je sest");
            } if ( vypiscislo == 5){

                System.out.println("Cislo je pet");
            } if ( vypiscislo == 4){

                System.out.println("Cislo je ctyri");
            } if ( vypiscislo == 3){

                System.out.println("Cislo je tri");
            } if ( vypiscislo == 2){

                System.out.println("cislo je dva");
            } if ( vypiscislo == 1){

                System.out.println("Cislo je jedna");
            }




        }

        public void ahojsvete() {
            while(i<=30){
                System.out.println(i+" Ahoj světe");
                i++;
            }
        }

        public void nasobky5(){
            int i = 1;
            while(i <=20){
                System.out.println(i*5);
                i++;
            }

        }

        public void ukol5(){
            boolean jePrvo = true;
            int vypiscislo = sc.nextInt();
            for (int i = 2; i < Math.sqrt(vypiscislo); i++){
                if (vypiscislo % i == 0){
                    jePrvo = false;
                    break;
                }

            }
            if (jePrvo && vypiscislo > 1){
                System.out.println("Cislo je prvocislo");
            }

            else {
                System.out.println("Neni prvocislo");
            }
        }
}
