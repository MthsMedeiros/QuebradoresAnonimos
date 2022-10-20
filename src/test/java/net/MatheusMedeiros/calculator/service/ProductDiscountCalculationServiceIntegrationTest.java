package net.MatheusMedeiros.calculator.service;

import net.MatheusMedeiros.calculator.model.Product;
import net.MatheusMedeiros.calculator.repository.stub.ProductRepositoryStub;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest
public class ProductDiscountCalculationServiceIntegrationTest {
    @Autowired
    ProductDiscountCalculationService driver;


    static ProductRepositoryStub productRepository;

    @BeforeAll
    public static void setupAll(){
        productRepository = new ProductRepositoryStub();
    }
    @Test
    public void whenDiscountIs10PercentThenProductPrincesLower10Percent(){
        Double discountFactor = 0.9;
        Product product = productRepository.findById(1l);

        Product result = driver.calculate(product,discountFactor);

        assertThat(result.getPrice(), is(90.00));




    }
}
