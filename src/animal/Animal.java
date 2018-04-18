package animal;

import animal.classification.Type;
import interfaces.IAquatic;
import interfaces.IAvian;
import interfaces.IMessage;
import java.util.ArrayList;

/**
 *
 * @author Diogo Pessoa
 */
abstract class Animal implements IAvian, IAquatic, IMessage {

    final private int animalID;
    final private String name;
    final private String dob;
    final private char gender;
    final private String dateArrival;
    final private int[] parents;
    private Type subType;
    private int exibitNumber;
    private boolean vaccine = false;
    private ArrayList<Medication> medication = new ArrayList<Medication>();

    //private ArrayList<Animal> offSpring = new ArrayList<Animal>(); // OLhar com Mark
    public Animal(int animalID, String name, char gender, String dob, String dateArrival, int[] parents, Type subType) {
        this.animalID = animalID;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.dateArrival = dateArrival;
        this.parents = parents;
        this.subType = subType;
    }

    public Animal(int animalID, String name, char gender, String dob, String dateArrival, int[] parents) {
        this.animalID = animalID;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.dateArrival = dateArrival;
        this.parents = parents;
    }
//    public void setOffSpring(ArrayList offSpring) {
//        this.offSpring = offSpring;
//    }

    public void setExibitNumber(int exibitNumber) {
        this.exibitNumber = exibitNumber;
    }

    public void setVaccine(boolean vaccine) {
        this.vaccine = vaccine;
    }

    public void setMedication(ArrayList<Medication> medication) {
        this.medication = medication;
    }

    public int getAnimalID() {
        return animalID;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public char getGender() {
        return gender;
    }

    public String getDateArrival() {
        return dateArrival;
    }

    public int getExibitNumber() {
        return exibitNumber;
    }

    public int[] getParents() {
        return parents;
    }

    public Type getSubtype() {
        return subType;
    }

    public void setSubtype(Type subType) {
        this.subType = subType;
    }

    @Override
    public boolean isAbleToFly() {
        return getSubtype() == Type.AVIAN || this instanceof Avian;
    }

    @Override
    public boolean isAbleToSwin() {
        return getSubtype() == Type.AQUATIC || this instanceof Aquatic;
    }

    @Override
    public void displayMessage(String message) {
        System.out.println(message);
    }

}
