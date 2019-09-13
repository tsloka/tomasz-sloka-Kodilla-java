package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import com.kodilla.hibernate.invoice.invoice.dao.InvoiceDao;
import com.kodilla.hibernate.invoice.item.dao.ItemDao;
import com.kodilla.hibernate.invoice.product.dao.ProductDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    ProductDao productDao;
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product potato = new Product("Potato");
        Product tomato = new Product("Tomato");
        Product carrot = new Product("Carrot");

        Item potatos = new Item(potato, BigDecimal.valueOf(2.34), 5);
        Item tomatos = new Item(tomato, BigDecimal.valueOf(1.54), 7);
        Item carrots = new Item(carrot, BigDecimal.valueOf(0.54), 3);

        Invoice invoice = new Invoice("00/21/2019");

        //When
        invoice.setItems(Arrays.asList(potatos, tomatos, carrots));
        potatos.setInvoice(invoice);
        tomatos.setInvoice(invoice);
        carrots.setInvoice(invoice);
        productDao.save(potato);
        productDao.save(tomato);
        productDao.save(carrot);

        invoiceDao.save(invoice);

        //Then
        Optional<Invoice> byId = invoiceDao.findById(invoice.getId());
        Assert.assertTrue(byId.isPresent());
        Invoice result = byId.get();
        Assert.assertEquals(3, result.getItems().size());
        Assert.assertEquals("00/21/2019", result.getNumber());

        //Cleanup
        invoiceDao.deleteById(invoice.getId());
        productDao.deleteById(tomato.getId());
        productDao.deleteById(potato.getId());
        productDao.deleteById(carrot.getId());

    }
}
