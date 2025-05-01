public class GpuComponent
{
    String name;
    String brand;
    double price;
    int warrantyYears;

    public GpuComponent(){
        System.out.println("Empty Cons Called!\n");
    }
    //Set method
    public void setName(String n)
    {
        name = n;
    }

    public void setBrand(String b)
    {
        brand = b;
    }

    public void setPrice(double p)
    {
        price = p;
    }

    public void setWarrantyYears(int w)
    {
        warrantyYears = w;
    }

    //Get method
    public String getName()
    {
        return name;
    }

    public String getBrand()
    {
        return brand;
    }

    public double getPrice()
    {
        return price;
    }

    public int getWarrantyYears()
    {
        return warrantyYears;
    }

    public void display()
    {
        System.out.println("GPU Details:");
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Warranty: " + warrantyYears + " years");
    }
}