package Bean;

public class Computer {

    private String ComputerName;

    public String getComputerName() {
        return ComputerName;
    }

    public void setComputerName(String computerName) {
        ComputerName = computerName;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ComputerName='" + ComputerName + '\'' +
                '}';
    }
}

