package com.yousufibrahim28.helloworldgamingprogramapp.BusinessCalculationService.DataService;

import com.yousufibrahim28.helloworldgamingprogramapp.BusinessCalculationService.Interface.DataService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Primary
public class MongoDBDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[] {11,22,33,44,55};
    }
}
