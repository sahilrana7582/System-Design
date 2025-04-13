import java.util.ArrayList;
import java.util.List;

public class ProductCatergory {

    private String categoryId;
    private String categoryName;
    private String categoryDescription;
    private List<Product> products = new ArrayList<>();

    public ProductCatergory(String categoryId, String categoryName, String categoryDescription) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public String toString() {
        return "ProductCatergory{" +
                "categoryId='" + categoryId + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", categoryDescription='" + categoryDescription + '\'' +
                '}';
    }
}
