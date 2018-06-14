package task1;

public class ClockArmAngle {

    private int hours;
    private int minutes;

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void calculateAngle() {
        int convertedHours = this.hours;
        if (convertedHours >= 12) {
            convertedHours -= 12;
        }
        double minuteArmAngle = this.minutes * 6;
        double hourArmAngle = (convertedHours * 30) + (this.minutes * 0.5);
        double angleBetweenArms = minuteArmAngle - hourArmAngle;
        if (angleBetweenArms < 0) {
            angleBetweenArms *= -1;
        }
        if (angleBetweenArms > 180) {
            angleBetweenArms = 360 - angleBetweenArms;
        }
        System.out.println("The angle between the hour and minute arms is " + angleBetweenArms + " degrees");
    }
}
