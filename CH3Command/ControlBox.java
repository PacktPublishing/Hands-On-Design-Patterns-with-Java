package CH3Command;

public class ControlBox {

    // Class Variables - Public / Final
    public static final int SLIDER_MIN = 0;
    public static final int SLIDER_MAX = 100;

    // Class Variables - Private
    private boolean poweredOn;
    private int sliderValue;

    // Constructor
    public ControlBox () {
        poweredOn = false; // default value
        sliderValue = 0;   // default value
    }

    // Accessor Methods
    public int getSliderValue() {
        return sliderValue;
    }

    public boolean hasPower () {
        return poweredOn;
    }

    // Method to turn power on
    public void powerOn() {
        poweredOn = true;
    }

    // Method to turn power off
    public void powerOff() {
        poweredOn = false;
    }

    // Method to increase slider value
    public void sliderIncrease () {
        if (hasPower()) {
            if (getSliderValue() < SLIDER_MAX) {
                sliderValue++;
                System.out.println(sliderValue); // simulate sending value to digital display
            }
        }
    }

    // Method to decrease slider value
    public void sliderDecrease () {
        if (hasPower()) {
            if (getSliderValue() > SLIDER_MIN) {
                sliderValue--;
                System.out.println(sliderValue); // simulate sending value to digital display
            }
        }
    }

}
