public class QuadraticEquation {
    //ax2+bx+c
    private double a,b,c;
    public QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }
    public double getDiscriminant(){
        return b*b-4*a*c;
    }
    public double getRoot1(){
        return (-b+Math.sqrt(getDiscriminant()))/2/a;
    }
    public double getRoot2(){
        return (-b-Math.sqrt(getDiscriminant()))/2/a;
    }
    public static void main(String[] args) {
        QuadraticEquation a = new QuadraticEquation(1,2,3);
        if(a.getDiscriminant()>=0){
            System.out.println("2 root is: "+a.getRoot1()+" and "+a.getRoot2());
        }else System.out.println("No root");
    }
}
