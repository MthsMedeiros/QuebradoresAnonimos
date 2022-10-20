package net.MatheusMedeiros.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class DiscountFactorCalculationImplementationService implements DiscountFactorCalculatorService{
    @Override
    public Double calculate(String clientType, Integer quantity) {
        if(clientType.equals("A") && (quantity >=1 && quantity <100)){
            return 0.90;
        }
        if(clientType.equals("A") && (quantity >=100 && quantity < 1000)){
            return 0.95;
        }
        if(clientType.equals("A") && (quantity >= 1000)){
            return 1.0;
        }

        if(clientType.equals("B") && (quantity >=1 && quantity <100)){
            return 0.85;
        }
        if(clientType.equals("B") && (quantity >=100 && quantity < 1000)){
            return 0.9;
        }
        if(clientType.equals("B") && (quantity >= 1000)){
            return 0.95;
        }

        if(clientType.equals("C") && (quantity >=1 && quantity <100)){
            return 0.8;
        }
        if(clientType.equals("C") && (quantity >=100 && quantity < 1000)){
            return 0.85;
        }
        if(clientType.equals("C") && (quantity >= 1000)){
            return 0.9;
        }

        return null;
    }
}
