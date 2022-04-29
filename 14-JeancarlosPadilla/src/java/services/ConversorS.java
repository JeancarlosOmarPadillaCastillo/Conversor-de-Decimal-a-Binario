
package services;




public class ConversorS {   
   
    public static String Binario = "";
    
    public static void calcular(int Decimal){
        
        if(Decimal<=255){
            Binario = Integer.toBinaryString(Decimal);
        }else{
            Binario="ERROR!";
        }
                
    }
    
    
}
