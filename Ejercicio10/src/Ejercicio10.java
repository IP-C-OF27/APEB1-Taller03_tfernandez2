public class Ejercicio10 {
    public static void main(String[] args) {
        
        int var1 = 25;
        int var2 = 10;
        int var3 = 100;
        int var4 = 5;
        int var5 = 2;
        boolean varBool1 = true;
        boolean varBool2 = false;
        
        boolean resultado = (((Math.sqrt(var1) * var2) >= var3) 
                && varBool1 
                || varBool2 
                || ((var2 / var4) >= var5));
        
        System.out.println("--------------------Solución al problema------------------------");
        System.out.println(resultado);
    }
}
