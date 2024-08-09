
package com.mycompany.mavenprojectsystemv001.manager;

import com.mycompany.mavenprojectsystemv001.util.Message;
import com.mycompany.projectprototypesystemv01.model.Product;
import com.mycompany.projectprototypesystemv01.service.ProductService;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
//import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author leandro
 */
@Named
@ViewScoped
//@RequestScoped
public class ProductManager implements Serializable {
    
    @EJB
    ProductService productService;
    
    private Product product;
    private List<Product> products;
    
    public ProductManager() {}
    
    @PostConstruct
    public void instance() {
        Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        String visible = params.get("visible");
        String edit = params.get("edit");
        if(visible != null) {
            product = productService.find(Long.parseLong(visible));
        } else if(edit != null){
            product = productService.find(Long.parseLong(edit));
        } else{
        product = new Product();
        products = new ArrayList<>();
        }
    }
    
    public void save() {
        if(product.getId() == null){
        productService.save(product);
        instance();
        } else {
            productService.update(product);
            instance();
        }
        Message.message("Produto incluído com sucesso!");
    }
    
    public void findAll() {
        products = productService.findAlll();
    }
    
    public void search() {
        //products = productService.findAlll();
        products = productService.findByAll(product);
    }
    
    public void searchBarcode() {
        
    }
    
    // metodo que traz lista de clientes
    public void searchDescription() {
        products = productService.findByDescription(product.getDescription());
    }

    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    
    
}
