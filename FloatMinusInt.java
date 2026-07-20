public class FloatMinusInt {

    public double subtractIntFromDoubleAndReturnDouble(double floating, int integer) {
        double myDouble = floating - integer;
        return myDouble;
        
    }

    public int subtractIntFromDoubleAndReturnInt(double floating, int integer) {
        double value2 = floating - integer;
        int myInt = (int) value2;
        return myInt;
    }
     public static void main(String[] args) {
         FloatMinusInt fmi = new FloatMinusInt();
        System.out.println(fmi.subtractIntFromDoubleAndReturnDouble(5.5, 2));
        System.out.println(fmi.subtractIntFromDoubleAndReturnInt(5.5, 2));
    }

}