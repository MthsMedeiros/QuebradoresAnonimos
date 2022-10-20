package net.MatheusMedeiros.calculator.repository;

import net.MatheusMedeiros.calculator.model.Product;

public interface ProductRepostory {

    Product findById(long id);
}
