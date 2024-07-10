// define the TrafficLight class
public class TrafficLight {
    // Step 1: Define attributes for color and duration
    private String color;
    private int duration;
    // Step 2: Add constructor
    public TrafficLight(String color, int duration){
        this.color = color;
        this.duration = duration;
    }
    // Getter for Color
    public String getColor(){
        return color;
    }
    // Getter for duration
    public int getDuration(){
        return duration;
    }
    // Step 3: Method to change the color
    public void changeColor(String newColor){
        this.color = newColor;
    }
    // Step 4: Method to check if the light is red
    public boolean isRed(){
        return color.equalsIgnoreCase("red");
    }
    // Step 4: Method to check if light is green
    public boolean isGreen(){
        return color.equalsIgnoreCase("green");
    }
}
