import java.util.Scanner;
public class atletas {
    public static void main(String[] args) throws Exception {
         
    Scanner sc=new Scanner(System.in);
   
    int numAtletas;
    
    double somaPesos = 0;
    
    double AlturaMaxima =0;
    
    String AtletaMaisAlto = "" ;

    int ContadorHomens = 0;

    int ContadorMulheres = 0;

    double SomaAlturaMulheres = 0;

    System.out.println("=========================================");
    System.out.println("Qual a quantidade de atletas ?");
    

    numAtletas=sc.nextInt();
    sc.nextLine();
    System.out.println("----------------------------------------");
   
    for(int i =  0; i < numAtletas; i++){
    System.out.println("Informe os Dados do atleta " + ( i + 1 ) + " : " );
    
     
        System.out.println("Iforme o nome :" );
        String nome = sc.nextLine();
      
        //-----SEXO------
        String sexo;
            while (true) {
                System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
                System.out.println("Informe o sexo do atleta M/F:");
                sexo = sc.nextLine();
                
                if (sexo.equalsIgnoreCase("M")) {
                    ContadorHomens++;
                    break;
                } else if (sexo.equalsIgnoreCase("F")) {
                    ContadorMulheres++;
                    break;
                } else {
                    System.out.println("Sexo inválido! Favor digitar F ou M:");
                }
            }

        //-----ALTURA-----
        double Altura;
        while (true) {
         System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
         System.out.println("Informe a Altura do atleta");
         Altura = sc.nextDouble();
      
         if (Altura > 0) {if (Altura > AlturaMaxima) {
            AlturaMaxima = Altura;
            AtletaMaisAlto = nome;
         } if (sexo.equalsIgnoreCase("F")) {
            SomaAlturaMulheres += Altura;
         }
             break;
            } else{
             System.out.println("Valor invalido! Favor digitar um valor positivo:");
            }
        }

        //---------PESO-------
        double Peso;
       while (true) {
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("Informe o Peso do atleta");
        Peso = sc.nextDouble();
       
        if (Peso > 0) {
            somaPesos += Peso;
            break;
           } else{
            System.out.println("Valor invalido! Favor digitar um valor positivo:");
           }
          
     }
     sc.nextLine();
     System.out.println("==============================");
    }
     
    //---------RELATORIO---------

    
    System.out.println("\n### RELATÓRIO ###");
    System.out.println("------------------------------");
 
   //-------CALCULO PESO--------
    double MediaPeso = somaPesos / numAtletas;
   
   //------CALCULO PORCENTAGEM HOMENS-------
    double porcentagemHomens = ((double) ContadorHomens / numAtletas) * 100;
    
   //------CALCULO ALTURA MULHERES------
    String mediaAlturaMulheresMsg;
    if (ContadorMulheres > 0) {
        double mediaAlturaMulheres = SomaAlturaMulheres / ContadorMulheres;
        mediaAlturaMulheresMsg = "Altura média das mulheres: " + mediaAlturaMulheres + " metros ";
    }else{
        mediaAlturaMulheresMsg = "Não há mulheres entre os atletas.";
    }


    System.out.println("Peso médio dos atletas:" + MediaPeso + "kg" );
    System.out.printf("Atleta mais alto: %s com %.2f metros%n", AtletaMaisAlto, AlturaMaxima);  
    System.out.printf("Porcentagem de homens: %.1f %%%n", porcentagemHomens);
    System.out.println(mediaAlturaMulheresMsg);
    sc.close();

    }
}
