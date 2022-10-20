package net.MatheusMedeiros.calculator.service;

import net.MatheusMedeiros.calculator.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductDiscountCalculationImplementService implements ProductDiscountCalculationService{


    @Override
    public Product calculate(Product product, Double discountFactor) {
        product.setPrice(product.getPrice() * discountFactor);
        return product;
    }
}
