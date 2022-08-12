package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Item item1 = new Item(new BigDecimal(10.5), 5, new BigDecimal(52.5));
        Item item2 = new Item(new BigDecimal(3.1), 10, new BigDecimal(31.0));
        Product product1 = new Product("Product");
        product1.getItem().add(item1);
        product1.getItem().add(item2);

        Invoice invoice1 = new Invoice("9235345");
        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item1.setProduct(product1);
        item2.setProduct(product1);


        //When
        invoiceDao.save(invoice1);
        int id = invoice1.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);


    }
}
