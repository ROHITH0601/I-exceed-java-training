class demoBlock
 {
 
    {
        System.out.println("Instance the block is called and it is block level");
    }
    static{
        System.out.println("inside the static block of the execution");
    }
 
    demoBlock() // constructor
    {
        System.out.println("Inside constructor");
    }
 
     public static void main(String[] args) {
       // new demoBlock();
        System.out.println("Inside the main method");
     }
 }
