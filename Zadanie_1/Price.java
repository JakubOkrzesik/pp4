public class Price{
    
    
    public static float netto(float value, float tax){
        return value*(1+tax);
    }
    
    public static void main(String[] args){
        float value = 5;
        float tax = (float)0.12;
        
        System.out.println(netto(value, tax));
    }
}
