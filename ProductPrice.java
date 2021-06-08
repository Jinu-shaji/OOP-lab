import java.util.*;

class Product{
    int pcode;
    String pname;
    double price;

    void setData(int code,String name,double prc ){
        pcode=code;
        pname=name;
        price=prc;       
    }
    void getData(){
        System.out.print("Product name : "+pname);
        System.out.println("Product code : "+pcode);
        System.out.println("Product price : "+price);
    }
    void lowPrice(Product p1,Product p2){

        if(price<=p1.price && price<=p2.price)
            System.out.println(pname+" has the smallest price ("+price+"Rs.)");  
        else if (p1.price<=price && p1.price<=p2.price)  
            System.out.println(p1.pname+" has the smallest price ("+p1.price+"Rs.)");  
        else  
        //prints c if the above conditions are false  
            System.out.println(p2.pname+" has the smallest price ("+p1.price+"Rs.)");  
    }
}
class ProductPrice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int code;
        double price;
        String name;
        Product p1=new Product();
        Product p2=new  Product();
        Product p3=new  Product();
        System.out.println("1st PRODUCT");
        System.out.println("Enter the Product name : ");
        name=sc.nextLine();
        System.out.println("Enter the Product code : ");
        code=sc.nextInt();
        System.out.println("Enter the Product price : ");
        price=sc.nextDouble();
        p1.setData(code, name, price);

        System.out.println("2nd PRODUCT");
        System.out.print("Enter the Product name : ");
        name=sc.nextLine();
        System.out.println("Enter the Product code : ");
        code=sc.nextInt();
        System.out.println("Enter the Product price : ");
        price=sc.nextDouble();
        p2.setData(code, name, price);

        System.out.println("3rd PRODUCT");
        System.out.print("Enter the Product name : ");
        name=sc.nextLine();
        System.out.println("Enter the Product code : ");
        code=sc.nextInt();
        System.out.println("Enter the Product price : ");
        price=sc.nextDouble();
        p3.setData(code, name, price);

        System.out.println("Product 1 ");
        p1.getData();
        System.out.println("Product 2 ");
        p2.getData();
        System.out.println("Product 3 ");
        p3.getData();

        p1.lowPrice(p2, p3);

    }
}