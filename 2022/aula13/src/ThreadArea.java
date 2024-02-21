public class ThreadArea extends Thread{

    private double lado;

    public ThreadArea(double lado) {
        this.lado = lado;
    }

    @Override
    public void run() {

        // (3√3*s^2)/ 2
        double area = (3 * Math.sqrt(3) *  Math.pow(lado,2))/2 ;
        System.out.println("Area: " + area);

    }


}
