
import java.util.InputMismatchException;
import java.util.Scanner;
public class App {

    static int cantidadLadosPrisma;
    static double alturaPrisma, longitudLadosPrisma;
    static double radioCilindro,alturaCilindro;
    static int cantidadLadosPiramide;
    static double alturaPiramide, longitudLadosPiramide;
    static double radioCono;
    static double alturaCono;
    static double radioEsfera;
    static double radioMayorTroncoCono, radioMenorTroncoCono, alturaTroncoCono,generatrizTroncoCono;
    static double  apotemaPiramideTroncoPiramide, alturaTroncoPiramide, areaBaseMayorTroncoPiramide, areaBaseMenorTroncoPiramide;
    static  double aristaTetraedro;
    static double aristaHexaedro;
    static double aristaOctaedro;
    static double aristaDodecaedro;
    static double aristaIcosaedro;
    static double alturaOrtoedro, longitudbOrtoedro, profundidadCOrtoedro;
    static double alturaEsfe,radioMayorEsfe_r1, radioMenorEsfe_r2, radioEsfe_R;
    static double radioHuso, anguloNHuso;
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
         int opcion = 0;
        int intentos = 0;
        int oportunidades = 3;
        int intentos1=3,intentos2=3,intentos3=3;

        System.out.println("************************************************************************ ");
        System.out.println("BIENVENIDO AL SISTEMA DE CALCULO PARA LOS DIFERENTES CUERPOS GEOMETRICOS");
        System.out.println("*************************************************************************");
        System.out.println("ELIGE UNA OPCION: ");
        System.out.println("*********************************");
        System.out.println("1-  ** Prisma                  **");
        System.out.println("2-  ** Cilindro.               **");
        System.out.println("3-  ** Piramide                **" );
        System.out.println("4-  ** Cono                    **" );
        System.out.println("5-  ** Esfera                  **" );
        System.out.println("6-  ** Tronco De Cono          **" );
        System.out.println("7-  ** Trono piramide          ** ");
        System.out.println("8-  ** Tetraedro               ** ");
        System.out.println("9-  ** Hexaedro                ** ");
        System.out.println("10- ** Octaedro                ** ");
        System.out.println("11- ** Dodecaedro              ** ");
        System.out.println("12- ** Icosaedro               ** ");
        System.out.println("13- ** Ortoedro                ** ");
        System.out.println("14- ** Circunferencia esferica **" );
        System.out.println("15- ** Huso Esferico           **" );
        System.out.println("16- ** Salir                   ** ");
        System.out.println("");
        
        while(intentos <3){
            try{
                System.out.println("Ingrese la opcion que desee:");
                 opcion = Integer.parseInt(entrada.nextLine());
                
                if(opcion > 0 && opcion <= 16){
                    System.out.println("Numero valido");
                    break;
                }else{
                    throw new Exception("Numero no valido");
                }
                        
                
            }catch(InputMismatchException e){
                intentos++;
                System.out.println("Error!! debe ingresar un numero entero que lo encuentre entre las opciones");
               
            }catch(NumberFormatException e){
                intentos++;
                System.out.println("Error!! debe ingresar un numero entero que lo encuentre entre las opciones");
               
            }catch(Exception e){
                intentos++;
                System.out.println("Error!! debe ingresar un numero entero que lo encuentre entre las opciones");
              
            }
        if(intentos == 3){
            System.out.println("La cantidad de intentos se han agotado");
        }
        
        }

        switch(opcion){
            case 1:
               do{
                   try{
                 System.out.println("Ingrese la cantidad de lados del prisma:");
                 int cantidadLadosPrisma = Integer.parseInt(entrada.nextLine());
                 if(cantidadLadosPrisma >0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
               
               do{
                   try{
                 System.out.println("Ingrese la altura del prisma:");
                 double alturaPrisma = Double.parseDouble(entrada.nextLine());
                 if(alturaPrisma >0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
               
               do{
                   try{
                 System.out.println("Ingrese la longitud de los lados del prisma:");
                 double longitudLadosPrisma = Double.parseDouble(entrada.nextLine());
                 if(longitudLadosPrisma >0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
               
               
               calcularAreas( cantidadLadosPrisma, alturaPrisma, longitudLadosPrisma);
                
                break;
                
            case 2:
                do{
                   try{
                 System.out.println("Ingrese el radio del cilindro:");
                 Double radioCilindro = Double.parseDouble(entrada.nextLine());
                 if(radioCilindro >0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
               
               do{
                   try{
                 System.out.println("Ingrese la altura del cilindro:");
                 Double alturaCilindro = Double.parseDouble(entrada.nextLine());
                 if(alturaCilindro >0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
               
              calcularAreasCilindro( radioCilindro, alturaCilindro);
                
                break;
                
            case 3:
                 do{
                   try{
                 System.out.println("Ingrese la cantidad de los lados de la piramide:");
                 int cantidadLadosPiramide = Integer.parseInt(entrada.nextLine());
                 if(cantidadLadosPiramide >0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
               
                do{
                   try{
                 System.out.println("Ingrese la altura de la piramide:");
                 Double alturaPiramide= Double.parseDouble(entrada.nextLine());
                 if(alturaPiramide >0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
               
                do{
                   try{
                 System.out.println("Ingrese la longitud de los lados de la piramide:");
                 Double longitudLadosPiramide = Double.parseDouble(entrada.nextLine());
                 if(longitudLadosPiramide >0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
                calcularAreasPiramide(cantidadLadosPiramide, alturaPiramide, longitudLadosPiramide);
                break;
                
            case 4:
                do{
                   try{
                 System.out.println("Ingrese el radio del cono:");
                 Double radioCono = Double.parseDouble(entrada.nextLine());
                 if(radioCono >0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
               
               do{
                   try{
                 System.out.println("Ingrese la altura del cono:");
                 double alturaCono = Double.parseDouble(entrada.nextLine());
                 if(alturaCono >0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
                calcularAreasCono( radioCono, alturaCono);
               break;
               
            case 5:
                
                do{
                   try{
                 System.out.println("Ingrese el radio de la esfera:");
                 double radioEsfera = Double.parseDouble(entrada.nextLine());
                 if(radioEsfera >0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
                calcularareasEsfera( radioEsfera);
                break;
                
            case 6:
                do{
                   try{
                 System.out.println("Ingrese el radio Mayor del tronco de cono:");
                 double radioMayorTroncoCono = Double.parseDouble(entrada.nextLine());
                 if(radioMayorTroncoCono >0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
               
               do{
                   try{
                 System.out.println("Ingrese el radio menor del tronco de cono:");
                 double radioMenorTroncoCono = Double.parseDouble(entrada.nextLine());
                 if(radioMenorTroncoCono >0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
               
               do{
                   try{
                 System.out.println("Ingrese la altura del tronco de cono:");
                 double alturaTroncoCono = Double.parseDouble(entrada.nextLine());
                 if(alturaTroncoCono >0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
               
               do{
                   try{
                 System.out.println("Ingrese la generatriz del tronco de cono:");
                 double generatrizTroncoCono = Double.parseDouble(entrada.nextLine());
                 if(generatrizTroncoCono >0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
                calcularAreasTroncoDeCono(radioMayorTroncoCono, radioMenorTroncoCono,alturaTroncoCono, generatrizTroncoCono);
                break;
                
            case 7:
                
                 do{
                   try{
                 System.out.println("Ingrese el apotema de la piramide o altura de las caras laterales:");
                 double apotemaPiramideTroncoPiramide = Double.parseDouble(entrada.nextLine());
                 if(apotemaPiramideTroncoPiramide >0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
               
                do{
                   try{
                 System.out.println("Ingrese la altura del tronco de piramide:");
                 double alturaTroncoPiramide= Double.parseDouble(entrada.nextLine());
                 if(alturaTroncoPiramide >0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
               
                do{
                   try{
                 System.out.println("Ingrese el area de la base mayor del tronco de piramide:");
                 double areaBaseMayorTroncoPiramide = Double.parseDouble(entrada.nextLine());
                 if(areaBaseMayorTroncoPiramide >0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
               
                do{
                   try{
                 System.out.println("Ingrese el area de la base menor del tronco de piramide:");
                 double areaBaseMenorTroncoPiramide = Double.parseDouble(entrada.nextLine());
                 if(areaBaseMenorTroncoPiramide >0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
               
               calcularAreasTroncoPiramide( apotemaPiramideTroncoPiramide, alturaTroncoPiramide, areaBaseMayorTroncoPiramide, areaBaseMenorTroncoPiramide);
            
                break;
                
            case 8:
                do{
                   try{
                 System.out.println("Ingrese la arista o valor de la orilla del tetraedro:");
                 double aristaTetraedro = Double.parseDouble(entrada.nextLine());
                 if(aristaTetraedro >0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
               calcularAreasTetraedro( aristaTetraedro);
               break;
               
            case 9:
                do{
                   try{
                 System.out.println("Ingrese la arista o valor de la orilla del Hexaedro:");
                 double aristaHexaedro = Double.parseDouble(entrada.nextLine());
                 if(aristaHexaedro >0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
               calcularAreasHexaedro( aristaHexaedro);  
               
               break;
               
            case 10:
                do{
                   try{
                 System.out.println("Ingrese la arista o valor de la orilla del Octaedro:");
                 double aristaOctaedro = Double.parseDouble(entrada.nextLine());
                 if(aristaOctaedro >0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
                calcularAreasOctaedro( aristaOctaedro);
                
               break; 
               
            case 11:
                do{
                   try{
                 System.out.println("Ingrese la arista o valor de la orilla del Dodecaedro:");
                 double aristaDodecaedro = Double.parseDouble(entrada.nextLine());
                 if(aristaDodecaedro >0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
                calcularAreasDodecaedro( aristaDodecaedro);
                break;
                
            case 12:
                do{
                   try{
                 System.out.println("Ingrese la arista o valor de la orilla del Icosaedro:");
                 double aristaIcosaedro= Double.parseDouble(entrada.nextLine());
                 if(aristaIcosaedro >0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }

                calcularAreasIcosaedro( aristaIcosaedro);
                break;
                
            case 13:
                 do{
                   try{
                 System.out.println("Ingrese la altura del ortoedro:");
                 double alturaOrtoedro= Double.parseDouble(entrada.nextLine());
                 if(alturaOrtoedro >0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
               
                do{
                   try{
                 System.out.println("Ingrese la longitud B del ortoedro:");
                 double longitudbOrtoedro= Double.parseDouble(entrada.nextLine());
                 if(longitudbOrtoedro>0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
               
                do{
                   try{
                 System.out.println("Ingrese la profundidad C del ortoedro:");
                 double profundidadCOrtoedro= Double.parseDouble(entrada.nextLine());
                 if(profundidadCOrtoedro>0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
                calcularAreasOrtoedro( alturaOrtoedro,longitudbOrtoedro, profundidadCOrtoedro );
                break;
                
            case 14:
                do{
                   try{
                 System.out.println("Ingrese la altura de la Zona Esferica:");
                 double alturaEsfe= Double.parseDouble(entrada.nextLine());
                 if(alturaEsfe>0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
               
               do{
                   try{
                 System.out.println("Ingrese el radioMayor de la esfera r1:");
                 double radioMayorEsfe_r1= Double.parseDouble(entrada.nextLine());
                 if(radioMayorEsfe_r1>0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
               
               do{
                   try{
                 System.out.println("Ingrese el radio menor de la esfera r2:");
                 double radioMenorEsfe_r2= Double.parseDouble(entrada.nextLine());
                 if(radioMenorEsfe_r2>0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
               
               do{
                   try{
                 System.out.println("Ingrese el radio de la esfera R:");
                 double radioEsfe_R= Double.parseDouble(entrada.nextLine());
                 if(radioEsfe_R>0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
               
               calcularRadioEsfera( alturaEsfe,radioMayorEsfe_r1, radioMenorEsfe_r2, radioEsfe_R  );
                
                break;
                
            case 15:
                do{
                   try{
                 System.out.println("Ingrese el radio del huso esferico:");
                 double radioHuso= Double.parseDouble(entrada.nextLine());
                 if(radioHuso>0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
               
               do{
                   try{
                 System.out.println("Ingrese el angulo del huso esferico:");
                 double anguloNHuso= Double.parseDouble(entrada.nextLine());
                 if(anguloNHuso>0){
                     System.out.println("");
                     break;
                 }else{
                     throw new Exception("Numero invalido");
                 }
                 }catch(InputMismatchException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
               }catch(NumberFormatException e){
                intentos1--;
                System.out.println("Error!! debe ingresar un valor entero, positivo y diferente de cero");
               
            }catch(Exception e){
                intentos1--;
                System.out.println("Error!! debe ingresar valor entero, positivo y diferente de cero");
              
            }      
                 
               }while(intentos1 > 0);
               if(intentos1 == 0){
                   System.out.println("La cantidad de intentos se ha agotado");
               }
               calcularAreasHusoEsferico( radioHuso, anguloNHuso); 
                break;
                
            case 16:
                mostrarDespedida();
                break;
                
                



        }entrada.close();
        
    }
    //metodos

    public static void calcularAreas(int cantidadLadosPrisma, double alturaPrisma, double longitudLadosPrisma){
        double areaLateralPrisma, areaTotalPrisma, volumenPrisma;
         double perimetroBasePrisma, areaBasePrisma, apotemaPrisma;
         
         perimetroBasePrisma = cantidadLadosPrisma * longitudLadosPrisma;  
         areaLateralPrisma = perimetroBasePrisma * alturaPrisma;
         double alfa = (Math.PI / 180) * (360 / cantidadLadosPrisma);
         apotemaPrisma = longitudLadosPrisma / (2 * Math.tan (alfa)/2); 
         areaBasePrisma = (perimetroBasePrisma * apotemaPrisma) /2;
         areaTotalPrisma = areaLateralPrisma + 2 * areaBasePrisma;  
         volumenPrisma = areaBasePrisma * alturaPrisma;
         
         System.out.print("Area lateral del prisma es: " + areaLateralPrisma +  "Unidades caudradas");
         System.out.println("");
         System.out.print("Area total del prisma es : " + areaTotalPrisma +  "Unidades cuadradas");
         System.out.println("");
         System.out.println("volumen del prisma es: " + volumenPrisma +  "Unidades cuadradas");  
         System.out.println("");
         
        }
     public static void calcularAreasCilindro(double radioCilindro, double alturaCilindro){
        double perimetroBaseCilindro;
        double areaLateralCilindro, areaBaseCilindro;
        double volumenCilindro, areaTotalCilindro;
        
        perimetroBaseCilindro = (2 * Math.PI * radioCilindro);      
        areaLateralCilindro = perimetroBaseCilindro * alturaCilindro;
        areaBaseCilindro = Math.PI * (radioCilindro * radioCilindro);        
        areaTotalCilindro = perimetroBaseCilindro * (alturaCilindro + radioCilindro);        
        volumenCilindro = areaBaseCilindro * alturaCilindro;
        
        System.out.println("El area lateral es: " + areaLateralCilindro);
        System.out.println("");
        System.out.println("El area total es: " + areaTotalCilindro);
        System.out.println("");
        System.out.println("El volumen es: " + volumenCilindro);
        System.out.println(""); 
         
    }
    public static void calcularAreasPiramide(int cantidadLadosPiramide, double alturaPiramide, double longitudLadosPiramide){
        
        double areaLateralPiramide, perimetroBasePiramide, apotemaPiramidePiramide;
        double  apotemaPiramide, areaTotalPiramide, areaBasePiramide;
        double volumenPiramide;
        double alfa;
        
        perimetroBasePiramide = cantidadLadosPiramide * longitudLadosPiramide;
        alfa = (Math.PI / 180) *(360 / cantidadLadosPiramide);      
        apotemaPiramide = longitudLadosPiramide / (2 * Math.tan(alfa)/2);       
        apotemaPiramide = (alturaPiramide * alturaPiramide) + (apotemaPiramide * apotemaPiramide);        
        areaLateralPiramide = (perimetroBasePiramide * apotemaPiramide) / 2;         
        areaBasePiramide =(perimetroBasePiramide * apotemaPiramide) / 2;      
        areaTotalPiramide = areaLateralPiramide + areaBasePiramide;      
        volumenPiramide = (areaBasePiramide * alturaPiramide) / 3;
        
         System.out.println("El area lateral es: " + areaLateralPiramide);
         System.out.println("");
         System.out.println("El area total es: " + areaTotalPiramide);
         System.out.println("");
         System.out.println("El volumen es: " + volumenPiramide);
         System.out.println(""); 
         
     }
     public static void calcularAreasCono(double radioCono, double alturaCono){
        double areaLateralCono, perimetroBaseCono, generatrizCono;
        double areaBaseCono, areaTotalCono;
        double volumenCono;
        
        generatrizCono = Math.sqrt( radioCono * radioCono + alturaCono * alturaCono);
        perimetroBaseCono = Math.PI * radioCono;
        areaLateralCono = perimetroBaseCono * generatrizCono;
        areaBaseCono = Math.PI * (radioCono * radioCono);
        areaTotalCono = Math.PI * radioCono * (generatrizCono + radioCono);
        volumenCono = (areaBaseCono * alturaCono)/3;
        
        System.out.println("Area Lateral: " + areaLateralCono);
        System.out.println("");
        System.out.println("Area Toatal: " + areaTotalCono);
        System.out.println("");
        System.out.println("El volumen es: " + volumenCono);
        System.out.println("");
     }
      public static void calcularareasEsfera(double radioEsfera){
          
        double areaTotalEsfera,volumenEsfera;
        
        areaTotalEsfera = 4 * Math.PI * (radioEsfera * radioEsfera);
        volumenEsfera = 4/3 * Math.PI * (radioEsfera * radioEsfera * radioEsfera);
        
        System.out.println("El area de la esfera es: " + areaTotalEsfera);
        System.out.println("");
        System.out.println("el volumen de la esfera es: " + volumenEsfera);
        System.out.println("");
         
   }
    public static void calcularAreasTroncoDeCono(double radioMayorTroncoCono,double radioMenorTroncoCono, double alturaTroncoCono, double generatrizTroncoCono){
       double areaLateralTroncoCono;
       double  areaTotalTroncoCono, areaBaseMayorTroncoCono;
       double areaBaseMenorTroncoCono, volumenTroncoCono;
       
       areaLateralTroncoCono = Math.PI * generatrizTroncoCono * (radioMayorTroncoCono + radioMenorTroncoCono);
       areaBaseMayorTroncoCono = Math.PI * (radioMayorTroncoCono * radioMayorTroncoCono);
       areaBaseMenorTroncoCono = Math.PI * (radioMenorTroncoCono * radioMenorTroncoCono);
       areaTotalTroncoCono = areaLateralTroncoCono+ areaBaseMayorTroncoCono + areaBaseMenorTroncoCono;
       volumenTroncoCono= 1/3 *  Math.PI * alturaTroncoCono * ((radioMayorTroncoCono * radioMayorTroncoCono) + (radioMenorTroncoCono * radioMenorTroncoCono) + (radioMayorTroncoCono * radioMenorTroncoCono));
       
       System.out.println("El area lateral del tronco de cono es: " + areaLateralTroncoCono);
       System.out.println("");
       System.out.println("El areaTotal del tronco de cono es: " + areaTotalTroncoCono);
       System.out.println("");
       System.out.println("El volumen del tronco de cono es: " + volumenTroncoCono);
       System.out.println("");
                 
                
   }
    public static void calcularAreasTroncoPiramide( double apotemaPiramideTroncoPiramide,double alturaTroncoPiramide, double areaBaseMayorTroncoPiramide,double areaBaseMenorTroncoPiramide){
       double areaLateralTroncoPiramide, areaTrapecioTroncoPiramide;
       double areaTotalTroncoPiramide;
       double  volumenTroncoPiramide;
       
       areaTrapecioTroncoPiramide= ((areaBaseMayorTroncoPiramide + areaBaseMenorTroncoPiramide) * apotemaPiramideTroncoPiramide)/2;
       areaLateralTroncoPiramide = (areaTrapecioTroncoPiramide * 5);
       areaTotalTroncoPiramide = areaLateralTroncoPiramide + areaBaseMenorTroncoPiramide + areaBaseMayorTroncoPiramide;
       volumenTroncoPiramide = 1/3 * alturaTroncoPiramide* (areaBaseMayorTroncoPiramide + areaBaseMenorTroncoPiramide + Math.sqrt(areaBaseMayorTroncoPiramide + areaBaseMenorTroncoPiramide));
       
       System.out.println("El area lateral del trono de piramide es: " + areaLateralTroncoPiramide);
       System.out.println("");
       System.out.println("El area total del tronco de piramide es: " + areaTotalTroncoPiramide);
       System.out.println("");
       System.out.println("El volumen del troco de piramide es: " + volumenTroncoPiramide);
       System.out.println("");
                
   }
    
    public static void calcularAreasTetraedro(double aristaTetraedro){
       double areaTotalTetraedro, alturaTetraedro, volumenTetraedro;
       
       areaTotalTetraedro = (aristaTetraedro * aristaTetraedro) * Math.sqrt(3);
       volumenTetraedro = (Math.sqrt(2) / 12) * (aristaTetraedro * aristaTetraedro * aristaTetraedro);
       alturaTetraedro = aristaTetraedro * (Math.sqrt(6) /3);
       
       System.out.println("El area del tetraedro es: " + areaTotalTetraedro);
       System.out.println("");
       System.out.println("El volumen del tetraedro es: " + volumenTetraedro);
       System.out.println("");
       System.out.println("La altura del tretraedro es: " + alturaTetraedro);
       System.out.println("");
    
   }
    public static void calcularAreasHexaedro(double aristaHexaedro){
       double areaHexaedro, volumenHexaedro, diagonalHexaedro;
       
        areaHexaedro = 6 * (aristaHexaedro * aristaHexaedro);
        volumenHexaedro= (aristaHexaedro * aristaHexaedro * aristaHexaedro);
        diagonalHexaedro = aristaHexaedro * (Math.sqrt(3));
        
        System.out.println("El area del hexaedro es: " + areaHexaedro);
        System.out.println("");
        System.out.println("El volumen del hexaedro es: " + volumenHexaedro);
        System.out.println("");
        System.out.println("La diagonal del hexaedro es: " + diagonalHexaedro);
        System.out.println("");
   }
     public static void calcularAreasOctaedro(double aristaOctaedro){
       double areaOctaedro, volumenOctaedro;
       
       areaOctaedro = 2 * (aristaOctaedro * aristaOctaedro) * Math.sqrt(3);
       volumenOctaedro = Math.sqrt(2)/3 * (aristaOctaedro * aristaOctaedro * aristaOctaedro);
       
       System.out.println("El area del octaedro es: " + areaOctaedro);
       System.out.println("");
       System.out.println("El volumen del octaedro es: " + volumenOctaedro);
       System.out.println("");
                 

   }
     public static void calcularAreasDodecaedro(double aristaDodecaedro){
        double areaDodecaedro, volumenDodecaedro;
        
        areaDodecaedro = (3 * (aristaDodecaedro * aristaDodecaedro)) * Math.sqrt(25 + (10 * Math.sqrt(5)));
        volumenDodecaedro = (Math.pow(aristaDodecaedro, 3)) / 4 * (15 + 7 * Math.sqrt(5));
        
        System.out.println ("El area del dodecaedro es: " + areaDodecaedro);
        System.out.println("");
        System.out.println("El volumen del dodecaedro es: " + volumenDodecaedro);
        System.out.println("");

        
   }
      public static void calcularAreasIcosaedro(double aristaIcosaedro){
       double areaIcosaedro, volumenIcosaedro;
       
       areaIcosaedro = 2 * (aristaIcosaedro * aristaIcosaedro) * Math.sqrt(3);
       volumenIcosaedro = (Math.sqrt(2)/3) * (aristaIcosaedro * aristaIcosaedro * aristaIcosaedro);
       
       System.out.println("El area del Icosaedro es: " + areaIcosaedro);
       System.out.println("");
       System.out.println("El volumen del Icosaedro es: " + volumenIcosaedro);
       System.out.println("");

   }
      public static void calcularAreasOrtoedro(double alturaOrtoedro,double longitudbOrtoedro,double profundidadCOrtoedro ){
       
       double areaOrtoedro;
       double  diagonalOrtoedro, volumenOrtoedro;
       
       areaOrtoedro = 2 * ((alturaOrtoedro * longitudbOrtoedro) + (alturaOrtoedro * profundidadCOrtoedro) + (longitudbOrtoedro * profundidadCOrtoedro));
       diagonalOrtoedro = Math.sqrt ((alturaOrtoedro * alturaOrtoedro) + (longitudbOrtoedro * longitudbOrtoedro) + (profundidadCOrtoedro * profundidadCOrtoedro));
       volumenOrtoedro = alturaOrtoedro * longitudbOrtoedro * profundidadCOrtoedro;
       
       System.out.println("El area del Ortoedro es: " + areaOrtoedro);
       System.out.println("");
       System.out.println("La diagonal del Ortoedro es: " + diagonalOrtoedro);
       System.out.println("");
       System.out.println("El volumen del Ortoedro es: " + volumenOrtoedro);
       System.out.println("");
        
       
   }
      public static void calcularRadioEsfera( double alturaEsfe,double radioMayorEsfe_r1,double radioMenorEsfe_r2,double radioEsfe_R  ){
       double areaEsfe;
       double volumenEsfe;
       double volumenCasquete, areaCasquete;
        
       areaEsfe = (2 * Math.PI * radioEsfe_R * alturaEsfe);
       volumenEsfe = (Math.PI * alturaEsfe * ((alturaEsfe * alturaEsfe) + (3 * (radioMayorEsfe_r1 * radioMayorEsfe_r1)) + (3 *     (radioMenorEsfe_r2 * radioMenorEsfe_r2)))) / 6;
       
       areaCasquete = 2 * Math.PI * radioEsfe_R * alturaEsfe;
       volumenCasquete = ((Math.PI * (alturaEsfe * alturaEsfe)) * (3 * radioEsfe_R) - alturaEsfe);
       
        System.out.println("El area de la zona esferica es: " + areaEsfe);
        System.out.println("");
        System.out.println("El volumen de la Zona esferica es: " + volumenEsfe);
        System.out.println("");
        System.out.println("El area del casquete esferico es: " + areaCasquete);
        System.out.println("");
        System.out.println("El volumen del casquete esferico es: " + volumenCasquete);
        System.out.println("");
               
   }
       public static void calcularAreasHusoEsferico(double radioHuso, double anguloNHuso){
       double areaHusoEsferico, volumencuñaEsferica;
       
       areaHusoEsferico =  (4 * Math.PI * (radioHuso * radioHuso) * anguloNHuso) / 360;
       volumencuñaEsferica = (Math.PI * (radioHuso * radioHuso * radioHuso) * anguloNHuso) / 270;
       
       System.out.println("El area del huso esferico es: " + areaHusoEsferico);
       System.out.println("");
       System.out.println("El volumen de la cuña esferica es: " + volumencuñaEsferica);
       System.out.println("");
      
   }
    public static void mostrarDespedida(){
       System.out.println("GRACIAS POR UTILIZAR NUESTROS SERVICIOS");
       System.out.println("");
   }
      
    
    
    


}
