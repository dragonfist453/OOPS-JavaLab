import java.util.Scanner;
public class ComplexNumber {
        private int real;
        private int imaginary;
        private int getReal(){
            return real;
        }
        private int getImaginary() {
            return imaginary;
        }
        private ComplexNumber add(ComplexNumber c1, ComplexNumber c2){
            //ComplexNumber result = new ComplexNumber();
            this.real = c1.getReal() + c2.getReal();
            this.imaginary = c1.getImaginary() + c2.getImaginary();
            return this;
        }
        private ComplexNumber subtract(ComplexNumber c1,ComplexNumber c2){
            //ComplexNumber result = new ComplexNumber();
            this.real = c1.getReal() - c2.getReal();
            this.imaginary = c1.getImaginary() - c2.getImaginary();
            return this;
        }
        private ComplexNumber(){
            real = 0;
            imaginary = 0;
        }
        private ComplexNumber(int r,int i) {
            real = r;
            imaginary = i;
        }
        private ComplexNumber(int v,boolean isReal) {
            if(isReal) {
                real = v;
                imaginary = 0;
            }
            else{
                real = 0;
                imaginary = v;
            }
        }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Input real part of first complex number");
        int c1_real = input.nextInt();
        System.out.println("Input imaginary part of first complex number");
        int c1_imaginary = input.nextInt();
        System.out.println("Input real part of second complex number");
        int c2_real = input.nextInt();
        System.out.println("Input imaginary part of second complex number");
        int c2_imaginary = input.nextInt();
        ComplexNumber c1 = new ComplexNumber(c1_real,c1_imaginary);
        ComplexNumber c2 = new ComplexNumber(c2_real,c2_imaginary);
        display(c1,c2);
    }
    private static void display(ComplexNumber c1,ComplexNumber c2) {
        //Sum
        ComplexNumber sum = new ComplexNumber();
        System.out.println("Sum of "+c1.getReal()+"+"+c1.getImaginary()+"i and "+c2.getReal()+"+"+c2.getImaginary()+"i is "+sum.add(c1,c2).real+"+"+sum.add(c1,c2).imaginary+"i");

        //Difference
        ComplexNumber difference = new ComplexNumber();
        System.out.println("Difference of "+c1.getReal()+"+"+c1.getImaginary()+"i and "+c2.getReal()+"+"+c2.getImaginary()+"i is "+difference.subtract(c1,c2).real+"+"+difference.subtract(c1,c2).imaginary+"i");
    }
}
