class CPU{
    double price;
    RAM robj;
    Processor pobj;
    CPU(double p,String rmemory,String rmanufacturer,String pmanufacturer,int pcores){
        price=p;
        robj=new RAM(rmemory,rmanufacturer);
        pobj=new Processor(pcores,pmanufacturer);
    }
    class Processor{
        int pcores;
        String pmanufacturer;
        Processor(int pcores,String pmanufacturer){
            this.pcores=pcores;
            this.pmanufacturer=pmanufacturer;
        }
        void pDisplay(){
            System.out.println("Processor Core = "+pcores);
            System.out.println("Processor manufacturer = "+pmanufacturer);
        }
    }
    static class RAM{
        String rmemory;
        String rmanufacturer;
        RAM(String rmemory, String rmanufacturer){
            this.rmemory=rmemory;
            this.rmanufacturer=rmanufacturer;
        }
        void rDisplay(){
            System.out.println("RAM Memory = "+rmemory);
            System.out.println("RAM manufacturer = "+rmanufacturer);
        }
    }
    void display(){
        System.out.println("CPU Price = "+price);
        robj.rDisplay();
        pobj.pDisplay();
    }
}
class CPUMain {
    public static void main(String args[]) {
        CPU c=new CPU(2600,"16 GB","Samsung","Intel",4);
        c.display();

    }
}