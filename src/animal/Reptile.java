package animal;

import animal.classification.Subtype;


/**
 *
 * @author Diogo Pessoa
 */
public class Reptile extends Animal{

    private boolean shedSkin;
    
    public Reptile(){
        
    }

    public Reptile (String name, char gender, String dob, String dateArrival, Subtype subType) {
        super(name, gender, dob, dateArrival, subType);
    }

    public Reptile (String name, char gender, String dob, String dateArrival) {
        super(name, gender, dob, dateArrival);
    }
    
    public boolean isSheddingSkin() {
        return shedSkin;
    }

    public void setShedSkin(boolean shedSkin) {
        this.shedSkin = shedSkin;
    }
}