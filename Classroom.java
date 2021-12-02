public class Classroom {
    
    public static void main(String[] args) {
    
    // Sydney reçoit une référence à une nouvelle instance de la classe Wilder
        Wilder sydney = new Wilder("Sydney", false); 
        sydney.setAware(false);
    // instance method
        System.out.println(sydney.whoAmI());
    
    // Marlon reçoit une référence à une nouvelle instance de la classe Wilder
        Wilder marlon = new Wilder("Marlon", true); 
        marlon.setAware(true);
    // instance method
        System.out.println(marlon.whoAmI());
    
    // Joyce reçoit une référence à une nouvelle instance de la classe Wilder
        Wilder joyce = new Wilder("Joyce", false); 
        joyce.setAware(false);
    // instance method
        System.out.println(joyce.whoAmI());
    
    
    
    
    }
    }
    