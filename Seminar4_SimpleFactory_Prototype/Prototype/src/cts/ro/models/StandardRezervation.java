package cts.ro.models;

public class StandardRezervation extends Rezervation {
    private Boolean isIndoor;

    public StandardRezervation() {
    }

    public StandardRezervation(String name, int hour, int day, int numberOfPeople, Boolean isIndoor) {
        super(name, hour, day, numberOfPeople);
        this.isIndoor = isIndoor;
    }

    public Boolean getIndoor() {
        return isIndoor;
    }

    public void setIndoor(Boolean indoor) {
        isIndoor = indoor;
    }

    @Override
    public Rezervation createCopy(int day) {
        StandardRezervation standardRezervation = new StandardRezervation();
        standardRezervation.setIndoor(this.getIndoor());
        standardRezervation.setName(super.getName());
        standardRezervation.setHour(super.getHour());
        standardRezervation.setNumberOfPeople(super.getNumberOfPeople());

        if (day < 31 && day > 1) {
            standardRezervation.setDay(day);
        } else {
            standardRezervation.setDay(super.getDay());
        }

        return standardRezervation;
    }
}
