package in.yograj.service;

import in.yograj.dto.Product;
import in.yograj.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.TaskExecutionOutcome;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository=productRepository;
        System.out.println("Class name:"+productRepository.getClass().getName());
        System.out.println("Service Bean Created!");
    }

    //actual business logic///
    //saving
    public Product saveProduct(Product product){
        Product product1=productRepository.save(product);
        System.out.println("Product with Id:"+product1.getId()+" created!");
        return product1;

    }

    public void findById(int id){
       Optional<Product>opt= productRepository.findById(id);
       opt.ifPresentOrElse(n-> System.out.println(n),()-> System.out.println("No Product Found"));

       /*if(opt.isPresent()){
           Product p=opt.get();
           System.out.println("Product with Id:"+p.getId()+" Found!!");
           System.out.println(opt.get());
       }*/
//         return null;
    }

    public void updateProduct(int id,Product product){

//find---
        Optional<Product> opt=productRepository.findById(id);
        Product p;
        if(opt.isPresent()){
            p=opt.get();
            p.setPrize(product.getPrize());
            p.setName(product.getName());

            System.out.println("Product Updated"+ p);
            productRepository.save(p);
        }

        //upsert  inster update
    }

    public void updateProduct(Product p){
        productRepository.save(p);
    }

    public void deleteProduct(int id){
        /*Optional<Product> opt=productRepository.findById(id);
        Product p;
        if(opt.isPresent()){
            p=opt.get();
            System.out.println("Product found: "+p);
        }else{
            System.out.println("No product Found");
        }*/
        if(productRepository.existsById(id)){
            productRepository.deleteById(id);//6
            System.out.println("Product deleted!");
        } else{
            System.out.println("Product not found!");
        }

    }

    public void findAllProduct(){
        List<Product>productList=productRepository.findAll();
        productList.forEach(n-> System.out.println(n));

    }

}
