public class Wilder {
        // attributs
        private String firstname;
        private boolean aware;
    
        // constructors
        public Wilder (String firstname, boolean aware){
            this.firstname = firstname;
            this.aware = false;
        }
    
        // getters
        public String getFirstname() {
            return this.firstname;
        }
        
        public boolean isAware() {
            return this.aware;
        }
        
        // setters
        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }
        
    
        public void setAware(boolean aware) {
            this.aware = aware;
        }
    
        // instance method
        
        public String whoAmI() {
            if (this.isAware() == true){
                return ("Mon nom est " + this.getFirstname() + " et je suis aware");
            }else {
                return ("Mon nom est " + this.getFirstname() + " et je ne suis pas aware");
                
        }
               
            
    }
    
}
