package cc.codecourse.petclinic.model;

import java.time.LocalDate;

public class Pet  {
    private PeyType peyType;
    private Owner owner;
    private LocalDate birthDate;

    public PeyType getPeyType() {
        return peyType;
    }

    public void setPeyType(PeyType peyType) {
        this.peyType = peyType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
