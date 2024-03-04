/*
overall goal: 
    make an interactive calendar where a user can add events to a specific date.
    users are able to select any date and see what events are on it on the side.
    present day is highlighted.
    dates with events are highlighted in a different color.
    if a date is not the current or has no events, it will be white or gray (I choose).
    when a date that has no events is selected, display "no events :("

day 1: 
    learning swing and laying out the different parts of the project.
    researched different projects that have made a calendar, to see different approach.
    calendar view on the left and event view on right
    calendare view will have drop down menu on top layer and dates on bottom
    event view will have event creation on top layer and event details on bottom
    made a mockup of what it should look like.

 */
import java.awt.*;
import java.time.*;
import javax.swing.*;

public class testGUI extends JFrame{
    /* creates the window */
    public testGUI() {
        setTitle("Calendar");
        setSize(720,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(createCalendarPanel(LocalDate.now()));
        setVisible(true);
    }
    public JPanel createCalendarPanel(LocalDate date){
        JPanel calPan = new JPanel();
        calPan.setLayout(new GridLayout(6,7));
        return calPan;
    }
    /* runs the constructor */
    public static void main(String[] args){
        new testGUI();
    }
}