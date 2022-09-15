public class ComplexNumber {
    int real;
    int img;
    public ComplexNumber(int real, int img){
        this.real = real;
        this.img = img;
    }

    public void print(){
        System.out.println(real + " + " + img + "i");
    }

    public void setReal(int real){
        this.real = real;
    }

    public void setImaginary(int img){
        this.img = img;
    }

    public void add(ComplexNumber c2){
        this.real = this.real + c2.real;
        this.img = this.img + c2.img;
    }

    public void multiply(ComplexNumber c2){

        int newReal = (this.real * c2.real) - (this.img * c2.img);
        int newImg = (this.real * c2.img) + (this.img * c2.real);
        this.real = newReal;
        this.img = newImg;
    }

    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2){
        int newReal = c1.real + c2.real;
        int newImg = c1.img + c2.img;
        ComplexNumber c4 = new ComplexNumber(newReal, newImg);
        return c4;
    }
    
}
