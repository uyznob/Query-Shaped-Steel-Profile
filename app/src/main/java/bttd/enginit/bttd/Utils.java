package bttd.enginit.bttd;

import static java.lang.Math.pow;
import static java.lang.Math.round;

final class Utils {


    // Declare constants
    private final static double PI = 3.14159265359;

    // Rectangle section
    public static double area1(double h, double w){
        return round(h*w*100.0)/100.0;
    }
    public static double ix1(double h, double w){
        return round(w*pow(h,3)/12*100.0)/100.0;
    }
    public static double iy1(double h, double w){
        return round(h*pow(w,3)/12*100.0)/100.0;
    }

    // Circle section
    public static double area2(double d){
        return round(PI*pow(d,2)/4*100.0)/100.0;
    }
    public static double ix2(double d){
        return round(PI*pow(d,4)/64*100.0)/100.0;
    }
    public static double iy2(double d){
        return round(PI*pow(d,4)/64*100.0)/100.0;
    }

    // Pipe section
    public static double area3(double d, double t){
        return round((PI/4*(pow(d,2)-pow(d-2*t,2)))*100.0)/100.0;
    }
    public static double ix3(double d, double t){
        return round((PI/64*(pow(d,4)-pow(d-2*t,4)))*100.0)/100.0;
    }
    public static double iy3(double d, double t){
        return round((PI/64*(pow(d,4)-pow(d-2*t,4)))*100.0)/100.0;
    }

    // Tube section
    public static double area4(double h, double w, double t){
        return round((w*h-(w-2*t)*(h-2*t))*100.0)/100.0;
    }
    public static double ix4(double h, double w, double t){
        return round((w*pow(h,3)/12-(w-2*t)*pow((h-2*t),3)/12)*100.0)/100.0;
    }
    public static double iy4(double h, double w, double t){
        return round((h*pow(w,3)/12-(h-2*t)*pow((w-2*t),3)/12)*100.0)/100.0;
    }

    // I section
    public static double area5(double h, double w, double tw, double tf){
        return round(((h-2*tf)*tw+2*w*tf)*100.0)/100.0;
    }
    public static double ix5(double h, double w, double tw, double tf){
        return round((tw*pow(h-2*tf,3)/12+w*pow(tf,3)/6+2*w*tf*pow(h/2-tf/2,2))*100.0)/100.0;
    }
    public static double iy5(double h, double w, double tw, double tf){
        return round((tf*pow(w,3)/6+(h-2*tf)*pow(tw,3)/12)*100.0)/100.0;
    }

    // Channel section
    public static double area6(double h, double w, double tw, double tf){
        return round((2*w*tf+(h-2*tf)*tw)*100.0)/100.0;
    }
    public static double ix6(double h, double w, double tw, double tf){
        return round((tw*pow(h,3)/12+(w-tw)*pow(tf,3)/6+2*(w-tw)*tf*pow(h/2-tf/2,2))*100.0)/100.0;
    }
    public static double iy6(double h, double w, double tw, double tf){
        return round((h*pow(tw,3)/12+tf*pow(w-tw,3)/6+2*tf*(w-tw)*pow(w/2,2))*100.0)/100.0;
    }

    // Double angle section
    public static double area7(double h, double w, double d, double t){
        return round(2*(h*t+(w-t)*t)*100.0)/100.0;
    }
    public static double ix7(double h, double w, double d, double t){
        return round(((w-t)*pow(t,3)/6+t*pow(h,3)/6+2*h*t*pow((h/2-t/2),2))*100.0)/100.0;
    }
    public static double iy7(double h, double w, double d, double t){
        return round((h*pow(t,3)/6+2*h*t*pow(d/2+t/2,2)+t*pow(w-t,3)/6+2*(w-t)*t*pow(d/2+w/2+t/2,2))*100.0)/100.0;
    }

    // Prevent the class from being constructed
    private Utils() {}
}
