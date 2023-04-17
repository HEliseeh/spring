package com.highfive.tuto;

import com.highfive.tuto.Service.BrandService;
import com.highfive.tuto.Service.ModelService;
import com.highfive.tuto.Service.SaleService;
import com.highfive.tuto.Service.CarService;
import com.highfive.tuto.Service.CustomerService;
import com.highfive.tuto.Service.EngineService;
import com.highfive.tuto.Service.FeatureService;
import com.highfive.tuto.config.ApplicationProperties;
import com.highfive.tuto.domain.Car;
import com.highfive.tuto.domain.Engine;
import com.highfive.tuto.domain.Model;
import com.highfive.tuto.domain.enums.EngineType;
import jakarta.transaction.Transactional;
import java.math.BigDecimal;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    private final BrandService brandService;
    private final ModelService modelService;
    private final CarService carService;
    private final EngineService engineService;
    private final FeatureService featureService;
    private final CustomerService customerService;
    private final SaleService saleService;
    


    public HelloWorldService(
        ApplicationProperties applicationProperties,
        BrandService brandService,
        ModelService modelService,
        CarService carService,
        EngineService engineService,
        FeatureService featureService,
        CustomerService customerService,
        SaleService saleService
        ) {
            this.brandService = brandService;
            this.modelService = modelService;
            this.carService = carService;
            this.engineService = engineService;
            this.featureService = featureService;
            this.customerService = customerService;
            this.saleService = saleService;
        System.out.println(applicationProperties.getHello());
    }

    
    @Transactional
    public void test() {
        // insert Model
        Model bmwModel = new Model();
        bmwModel.setName("IX");
        // brandService.get("Tib").ifPresent(bmwModel::setBrand);

        bmwModel = modelService.create(bmwModel);

        // insert Engine
        Engine bmwEngine = new Engine();
        bmwEngine.setName("iXI xDrive30");
        bmwEngine.setType(EngineType.ELECTRIC);
        bmwEngine = engineService.create(bmwEngine);

        // insert Car
        Car bmwCar = new Car();
        bmwCar.setModel(bmwModel);
        bmwCar.setPrice(BigDecimal.valueOf(55000));
        bmwCar.getEngines().add(bmwEngine);
        carService.create(bmwCar);

        printCars();
    }
}
