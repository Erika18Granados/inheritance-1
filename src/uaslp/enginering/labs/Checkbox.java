package uaslp.enginering.labs;

public class Checkbox extends Control{
    private String label;
    public Checkbox(String label) {
        this.label = label;
    }
    public void draw() {
        System.out.print(label);
    }
}
