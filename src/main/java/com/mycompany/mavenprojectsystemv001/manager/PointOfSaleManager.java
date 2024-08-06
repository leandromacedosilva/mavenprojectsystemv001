
package com.mycompany.mavenprojectsystemv001.manager;

import com.mycompany.mavenprojectsystemv001.util.Message;
import com.mycompany.mavenprojectsystemv001.model.PointOfSale;
import com.mycompany.mavenprojectsystemv001.service.PointOfSaleService;
//import com.mycompany.projectprototypesystemv01.service.PointOfSaleService;
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
public class PointOfSaleManager implements Serializable {
    
    @EJB
    PointOfSaleService pointOfSaleService;
    
    private PointOfSale pointOfSale;
    private List<PointOfSale> pointOfSales;
    
    public PointOfSaleManager() {}
    
    @PostConstruct
    public void instance() {
        Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        String visible = params.get("visible");
        String edit = params.get("edit");
        if(visible != null) {
            pointOfSale = (PointOfSale) pointOfSaleService.find(Long.parseLong(visible));
        } else if(edit != null){
            pointOfSale = (PointOfSale) pointOfSaleService.find(Long.parseLong(edit));
        } else{
        pointOfSale = new PointOfSale();
        pointOfSales = new ArrayList<>();
        }
    }
    
    public void save() {
        if(pointOfSale.getId() == null){
        pointOfSaleService.save(pointOfSale);
        instance();
        } else {
            pointOfSaleService.update(pointOfSale);
            instance();
        }
        Message.message("Informações pos incluídas com sucesso!");
    }
    
    public void findAll() {
        pointOfSales =  pointOfSaleService.findAlll();
    }
    
    public void search() {
        //products = productService.findAlll();
        pointOfSales = pointOfSaleService.findByAll(pointOfSale);
    }
    
    public void dateFormat(String date) throws ParseException {
         //pointOfSales = pointOfSaleService;
         //DateUtil.StringToDate(date);
    }
    
    // metodo que traz lista de clientes
    public void searchDescription() {
        //pointOfSales = pointOfSaleService.findByDescription(pointOfSale.getNote());
    }


    public PointOfSaleService getPointOfSaleService() {
        return pointOfSaleService;
    }

    public void setPointOfSaleService(PointOfSaleService pointOfSaleService) {
        this.pointOfSaleService = pointOfSaleService;
    }

    public PointOfSale getPointOfSale() {
        return pointOfSale;
    }

    public void setPointOfSale(PointOfSale pointOfSale) {
        this.pointOfSale = pointOfSale;
    }

    public List<PointOfSale> getPointOfSales() {
        return pointOfSales;
    }

    public void setPointOfSales(List<PointOfSale> pointOfSales) {
        this.pointOfSales = pointOfSales;
    }
    
    
}
