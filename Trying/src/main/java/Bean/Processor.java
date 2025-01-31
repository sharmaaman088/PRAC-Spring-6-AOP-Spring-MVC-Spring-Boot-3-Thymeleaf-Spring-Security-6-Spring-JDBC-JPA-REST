package Bean;

public class Processor {
    private String ProcessorName;

    public String getProcessorName() {
        return ProcessorName;
    }

    public void setProcessorName(String processorName) {
        ProcessorName = processorName;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "ProcessorName='" + ProcessorName + '\'' +
                '}';
    }
}
