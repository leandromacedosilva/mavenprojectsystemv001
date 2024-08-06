
package com.mycompany.projectprototypesystemv01.service;

import com.mycompany.projectprototypesystemv01.generic.GenericService;
import com.mycompany.projectprototypesystemv01.model.ProductPub;
//import jakarta.ejb.Stateless;
import jakarta.ejb.Stateless;

/**
 *
 * @author leandro
 */
@Stateless
public class ProductPubService extends GenericService<ProductPub> {
    public ProductPubService() {
        super(ProductPub.class);
    }
}
