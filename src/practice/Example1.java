package practice;

class Demo{
    int a;
    int b;
    private int c=45;
    int names[] = new int[2];
    static int e=66;

    //shallow copy constructor
    Demo(Demo d){
        this.a = d.a;
        this.b = d.b;
        //this.names = d.names;
        for(int i=0; i<names.length;i++){
            this.names[i] = d.names[i];
        }
    }

    public int getC(){
        return c;
    }

    public void setC(int c){
        this.c=c;
    }

    Demo(int a, int b){
        this.a = a;
        this.b = b;
    }
     
}

public class Example1 {

    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
        int names[];
        Demo d = new Demo(a,b);
        d.names[0] = 17;
        d.names[1] = 23;
        System.out.println("d1==="+d.a + " " +d.b+" "+Demo.e);
        Demo d2 = new Demo(d); //copy
        System.out.println("d2==="+d2.a + " " +d2.b);
        d.names[0] = 26;
        for(int i=0; i< d.names.length;i++){
            System.out.println("D===="+d.names[i]);
        }
        for(int i=0; i< d2.names.length;i++){
            System.out.println("D2===="+d2.names[i]);
        }
        Demo d1 = new Demo(30,40);
        System.out.println(d.a + " "+d.b);
        d1.setC(17);
        System.out.println(d1.a+" "+d1.b+ " "+d1.getC() + " "+Demo.e);

    }
    
}
