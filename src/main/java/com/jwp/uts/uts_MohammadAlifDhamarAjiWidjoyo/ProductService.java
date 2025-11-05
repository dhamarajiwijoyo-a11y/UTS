package UTSJWP.uts_MohammadAlifDhamarAjiWidjoyo.src.main.java.com.jwp.uts.uts_MohammadAlifDhamarAjiWidjoyo;


import java.util.ArrayList;
import java.util.List;

@Service
public abstract class ProductService<id> {
    private List<Product> products = new ArrayList<>();
    private ProductService() {
    }
    public ProductService(final int sequence) {
        this.sequence = sequence;
    }

    public UTSJWP.uts_MohammadAlifDhamarAjiWidjoyo.src.main.java.com.jwp.uts.uts_MohammadAlifDhamarAjiWidjoyo.Product getProduct() {
        return ProductService();
    }


    protected abstract Product ProductService();


    private int sequence = 1; // untuk 3 digit urutan NIM
    private List<Product> getproduct;
    private Product product;

    // Tambah student baru
    public Product addproduct(final Product product) {
        final Integer id = generateAutoid();
        ((Product) product).setid(id);
        final Product Product = new Product();
        product.add(product);
        return product;
    }

    private Integer generateAutoid() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'generateAutoid'");
    }

    // Ambil semua student
    public List<Product> getAllProducts() {
        return (List<UTSJWP.uts_MohammadAlifDhamarAjiWidjoyo.src.main.java.com.jwp.uts.uts_MohammadAlifDhamarAjiWidjoyo.Product>) getproduct;
    }

    // Cari student berdasarkan NIM
    /**
     * @param nim
     * @return
     */
    public Product getProductById(final Integer id) {
        try {
            return products.stream()
                .filter(s -> s.getid().equals(id))
                .findFirst()
                .orElse(null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((products == null) ? 0 : products.hashCode());
        result = prime * result + sequence;
        result = prime * result + ((getproduct == null) ? 0 : getproduct.hashCode());
        result = prime * result + ((product == null) ? 0 : product.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProductService other = (ProductService) obj;
        if (products == null) {
            if (other.products != null)
                return false;
        } else if (!products.equals(other.products))
            return false;
        if (sequence != other.sequence)
            return false;
        if (getproduct == null) {
            if (other.getproduct != null)
                return false;
        } else if (!getproduct.equals(other.getproduct))
            return false;
        if (product == null) {
            if (other.product != null)
                return false;
        } else if (!product.equals(other.product))
            return false;
        return true;
    }
    // Generate NIM otomatis: 23 + 3 digit urutan
    private String generateAutoNim() {
        final String tahunMasuk = "23";
        final String urutan = String.format("%03d", sequence++);
        return tahunMasuk + urutan;
    }

    public UTSJWP.uts_MohammadAlifDhamarAjiWidjoyo.src.main.java.com.jwp.uts.uts_MohammadAlifDhamarAjiWidjoyo.Product getStudentByid(
            final Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudentByid'");
    }

    public UTSJWP.uts_MohammadAlifDhamarAjiWidjoyo.src.main.java.com.jwp.uts.uts_MohammadAlifDhamarAjiWidjoyo.Product getProductByid(
            final Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProductByid'");
    }

    public UTSJWP.uts_MohammadAlifDhamarAjiWidjoyo.src.main.java.com.jwp.uts.uts_MohammadAlifDhamarAjiWidjoyo.Product addProduct(
            final Product product2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addProduct'");
    }

    public static Integer generateAutoid(final int tahunMasuk) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'generateAutoid'");
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(final int sequence) {
        this.sequence = sequence;
    }
}
