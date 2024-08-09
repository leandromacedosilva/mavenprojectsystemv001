package com.mycompany.mavenprojectsystemv001.manager;

import com.mycompany.mavenprojectsystemv001.service.ProductPubService;
import com.mycompany.mavenprojectsystemv001.util.Message;
//import com.mycompany.projectprototypesystemv01.model.Product;
import com.mycompany.projectprototypesystemv01.model.ProductPub;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author leandro
 */
@Named
@ViewScoped
public class ProductPubManager implements Serializable {
    /*private Product product;
    @PostConstruct
    public void instance() {
        product = new Product();
    }
    public void readProduct() {
        
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    */
    @EJB
    ProductPubService productPubService;
    
    private ProductPub productPub;
    private List<ProductPub> productsPub;
    
    public ProductPubManager() {}
    
    @PostConstruct
    public void instance() {
        Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        String visible = params.get("visible");
        String edit = params.get("edit");
        if(visible != null) {
            productPub = (ProductPub) productPubService.find(Long.parseLong(visible));
        } else if(edit != null){
            productPub = (ProductPub) productPubService.find(Long.parseLong(edit));
        } else{
        productPub = new ProductPub();
        productsPub = new ArrayList<>();
        }
    }
    
    public void save() {
        if(productPub.getId() == null){
        productPubService.save(productPub);
        instance();
        } else {
            productPubService.update(productPub);
            instance();
        }
        Message.message("Informações pos incluídas com sucesso!");
    }
    
    public void findAll() {
        productPub =  (ProductPub) productPubService.findAlll();
    }
    
    public void search() {
        //products = productService.findAlll();
        productPub = (ProductPub) productPubService.findByAll(productPub);
    }
    
    public void dateFormat(String date) throws ParseException {
         //pointOfSales = pointOfSaleService;
         //DateUtil.StringToDate(date);
    }
    
    // metodo que traz lista de clientes
    public void searchDescription() {
        //pointOfSales = pointOfSaleService.findByDescription(pointOfSale.getNote());
    }


    public ProductPubService getProductPubService() {
        return productPubService;
    }

    public void setProductPubService(ProductPubService productPubService) {
        this.productPubService = productPubService;
    }

    public ProductPub getPproductPub() {
        return productPub;
    }

    public void setProductPub(ProductPub productPub) {
        this.productPub = productPub;
    }

    public List<ProductPub> getProductsPub() {
        return productsPub;
    }

    public void setProductsPub(List<ProductPub> productsPub) {
        this.productsPub = productsPub;
    }
}
