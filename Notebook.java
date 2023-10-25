

class Notebook {
    private String model;
    private int ozu;
    private int volumeZd;
    private String operationSystem;
    private String color;

    public Notebook(String model, int ozu, int volumeZd, String operationSystem, String color) {
        this.model = model;
        this.ozu = ozu;
        this.volumeZd = volumeZd;
        this.operationSystem = operationSystem;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getOzu() {
        return ozu;
    }

    public int getVolumeZd() {
        return volumeZd;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Ноутбук{" +
                "модель='" + model + '\'' +
                ", озу=" + ozu +
                ", объемЖд=" + volumeZd +
                ", операционнаяСистема='" + operationSystem + '\'' +
                ", цвет='" + color + '\'' +
                '}';
    }
}