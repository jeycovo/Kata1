package kata1;

import java.util.Date;

public class Person {
    //ALT -ENTER conseguir las bibliotecas que te hacen falta
    
    private final String name;
    private final Date birthdate;
    
    public Person (String name, Date birthdate){
        this.name = name;
        this.birthdate = birthdate;
    }
    
    public String getName() {
        return name;
    }    
    
    public Date getBirthdate(){
        return birthdate;
    }
    
    // getTime obtiene el tiempo en milisegundos
    public int getAge(){
        return (int) ((new Date().getTime() - birthdate.getTime())/31536000000L);
    }
    
    //ALT -INS genera getter    
    
}
