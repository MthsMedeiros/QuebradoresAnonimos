package net.MatheusMedeiros.calculator.repository.stub;

import net.MatheusMedeiros.calculator.model.Product;
import net.MatheusMedeiros.calculator.repository.ProductRepostory;

public class ProductRepositoryStub {

    public Product findById(long id) {
        return new Product(1l, 100.00);
    }
}
