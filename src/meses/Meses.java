
package meses;

import java.util.Scanner;


public class Meses {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dias,mes;
        
        //ENTRADA
        System.out.print("Mês: ");
        mes = leitor.nextInt();
        
        
        //PROCESSAMENTO
        if (mes == 2 ){
            dias = 28;
        }else{
            if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
            dias = 30;
            }else{
            dias = 31;
            }
        }
        
   
        //SAIDA
        System.out.println(dias);
        
        
    }
    
}
