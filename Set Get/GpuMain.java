public class GpuMain
{
    public static void main(String[] args)
    {
        GpuComponent G1 = new GpuComponent();

        G1.setName("GeForce RTX 5090");
        G1.setBrand("NVIDIA");
        G1.setPrice(5000);
        G1.setWarrantyYears(3);

        G1.display();
    }
}