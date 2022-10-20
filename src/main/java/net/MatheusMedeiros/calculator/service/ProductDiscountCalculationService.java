package net.MatheusMedeiros.calculator.service;

import net.MatheusMedeiros.calculator.model.Product;

public interface ProductDiscountCalculationService {
    Product calculate (Product product, Double discountFactor);
}
