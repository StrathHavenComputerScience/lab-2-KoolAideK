public class Lab2
{
    public static void cleanSquare()
    {
        Robot.load("square.txt");
        Robot.setDelay(0.1);

        //INSERT CODE HERE
        vacuumInLine();
        Robot.turnLeft();
        vacuumInLine();
        Robot.turnLeft();
        vacuumInLine();
        Robot.turnLeft();
        vacuumInLine();

    }

    public static void vacuum(){
        Robot.move();
        Robot.makeLight();
    }

    public static void vacuumInLine(){
        vacuum();
        vacuum();
        vacuum();
        vacuum();
        vacuum();
        Robot.move();
    }

    public static void darkenBacking(){
        Robot.makeDark();
        Robot.move();
        Robot.makeDark();
        Robot.move();
        Robot.makeDark();
        Robot.move();
        Robot.makeDark();
        Robot.move();
        Robot.makeDark();
        Robot.move();
        Robot.makeDark();
        Robot.move();
        Robot.makeDark();
        Robot.move();
        Robot.makeDark();
        Robot.move();
        Robot.makeDark();

    }

    public static void darkenSide(){
        Robot.move();
        Robot.makeDark();
        Robot.move();
        Robot.makeDark();
        Robot.move();
        Robot.makeDark();
        Robot.move();
        Robot.makeDark();
        Robot.move();
        Robot.makeDark();
        Robot.move();
        Robot.makeDark();
        Robot.turnLeft();
        Robot.turnLeft();
        Robot.move();
        Robot.move();
        Robot.move();
        Robot.move();
        Robot.move();
        Robot.move();
    }

    public static void turnRight(){
        Robot.turnLeft();
        Robot.turnLeft();
        Robot.turnLeft();
    }

    public static void nextComb(){
        Robot.turnLeft();
        Robot.move();
        Robot.move();
        Robot.turnLeft();
    }

    public static void combIt(){
        darkenSide();
        nextComb();
    }

    public static void darkenComb()
    {
        Robot.load("comb.txt");
        Robot.setDelay(0.05);

        //INSERT CODE HERE
        darkenBacking();
        turnRight();
        combIt();
        combIt();
        combIt();
        combIt();
        darkenSide();
    }

    public static void checkerRow(){
        Robot.makeDark();
        Robot.move();
        Robot.move();
        Robot.makeDark();
        Robot.move();
        Robot.move();
        Robot.makeDark();
        Robot.move();
        Robot.move();
        Robot.makeDark();
        Robot.move();
        
        
    }
public static void nextRowR(){
    turnRight();
    Robot.move();
    turnRight();
}
public static void nextRowOnRight(){
    checkerRow();
    nextRowR();
}
public static void nextRowOnLeft(){
    checkerRow();
    Robot.turnLeft();
    Robot.move();
    Robot.turnLeft();
}
    public static void makeCheckered()
    {
        Robot.load("blank.txt");
        Robot.setDelay(0.05);

        //INSERT CODE HERE
        nextRowOnRight();
        nextRowOnLeft();
        nextRowOnRight();
        nextRowOnLeft();
        nextRowOnRight();
        nextRowOnLeft();
        nextRowOnRight();
        checkerRow();
        
    }
}
