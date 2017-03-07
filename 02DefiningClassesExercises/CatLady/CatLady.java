package CatLady;

public class CatLady {
    private String name;
    private String characteristic;
    private String type;

    public CatLady(String name, String characteristic, String type) {
        this.setName(name);
        this.setCharacteristic(characteristic);
        this.setType(type);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getCharacteristic() {
        return this.characteristic;
    }

    private void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public String getType() {
        return this.type;
    }

    private void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.getType() + " " + this.getName() + " " + this.getCharacteristic();
    }
}
