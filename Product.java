public class Product {
    int ProductCode;
    String ProductName;
    String ProductBrand;
    double ProductPrice;
    int ProductStock;

    public Product(int ProductCode, String ProductName, String ProductBrand, double ProductPrice, int ProductStock)
    {
        this.ProductCode = ProductCode;
        this.ProductName = ProductName;
        this.ProductBrand = ProductBrand;
        this.ProductPrice = ProductPrice;
        this.ProductStock = ProductStock;
    }

    public int getProductCode() {
        return ProductCode;
    }
    public void setProductCode(int productCode) {
        ProductCode = productCode;
    }

    public String getProductName() {
        return ProductName;
    }
    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getProductBrand() {
        return ProductBrand;
    }
    public void setProductBrand(String productBrand) {
        ProductBrand = productBrand;
    }

    public double getProductPrice() {
        return ProductPrice;
    }
    public void setProductPrice(double productPrice) {
        ProductPrice = productPrice;
    }

    public int getProductStock() {
        return ProductStock;
    }

    public void setProductStock(int productStock) {
        ProductStock = productStock;
    }

    public void printProduct()
    {
        System.out.println("\nProduct Code : "+this.ProductCode+"\nProduct Name : "+this.ProductName+"\nProduct Brand : "+this.ProductBrand+"\nProduct Price : "+this.ProductPrice+"\nProduct Stock : "+this.ProductStock+"\n");
    }
}
