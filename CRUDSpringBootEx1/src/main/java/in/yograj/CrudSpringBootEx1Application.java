package in.yograj;

import in.yograj.dto.Product;
import in.yograj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CrudSpringBootEx1Application {
    private static ProductService productService;

    @Autowired
    public CrudSpringBootEx1Application(ProductService productService){
        this.productService=productService;
    }
    public static void main(String[] args) {

        ConfigurableApplicationContext container = SpringApplication.run(CrudSpringBootEx1Application.class, args);

       Product p=new Product();
        p.setName("Mobile S24");
        p.setPrize(45000.0);
        System.out.println(p.getClass().getName());

//       productService.findById(2);

//        productService.updateProduct(1,p);*/
//        productService.deleteProduct(4);
//        productService.findAllProduct();
    }


}
