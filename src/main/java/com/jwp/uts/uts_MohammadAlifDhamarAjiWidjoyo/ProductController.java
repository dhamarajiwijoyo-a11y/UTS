package UTSJWP.uts_MohammadAlifDhamarAjiWidjoyo.src.main.java.com.jwp.uts.uts_MohammadAlifDhamarAjiWidjoyo;
import java.time.LocalDate;
import java.util.List;

import javax.smartcardio.ResponseAPDU;

@RestController
@RequestMapping("/UTS")
public class ProductController {


    private static final String ResponseEntity = null;
    @Autowired
    private ProductService productService;

    // GET /students - ambil semua data
    @GetMapping(value = "")
    public List<Product> getAllpProducts() {
        return productService.getAllProducts();
    }

    // GET /students/{nim} - ambil 1 mahasiswa
    @GetMapping("/{id}")
    public ResponseEntity<?> getPoductByid(@PathVariable Integer id) {
        Product product = productService.getProductByid(id);
        if (product != null) {
            return ResponseEntity.ok(product);
        } else {
            return ResponseEntity.status(404).body("Product not found");
        }
    }

    // POST /students - tambah mahasiswa baru
    @PostMapping
    public ResponseEntity<?> addProduct(@RequestBody ProductRequest request) {
        Product product = new Product();

        // Ambil 2 digit terakhir tahun sekarang, contoh: 2025 -> 25
        int tahunMasuk = LocalDate.now().getYear() % 100;

        // Generate NIM otomatis: tahunMasuk + 3 digit urutan
        Integer generatedid = ProductService.generateAutoid(tahunMasuk);
        product.setid(generatedid);

        product.setname(request.getname());
        product.setcategory(LocalDate.parse(request.getcategory()));
        product.setprice(request.getprice());

        Product saved = productService.addProduct(product);
        return ResponseEntity.ok("Student added successfully with NIM: " + saved.getid());
    }
}

