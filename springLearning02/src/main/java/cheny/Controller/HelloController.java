package cheny.Controller;

import cheny.bean.Food;
import cheny.bean.Vegetables;
import cheny.config.FoodConfig;
import cheny.config.VegetablesConfig;
import com.sun.xml.internal.ws.api.FeatureListValidatorAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @controller
 * 控制类 业务逻辑 请求分发 组装响应
 */

/**
 * @RestController
 * 是Controller和RequestBody的组合
 */
@RestController
public class HelloController {

//    @Value("${food.rice}")
//    String rice;
//    @Value("${food.meat}")
//    String meat;
    @Autowired
    private FoodConfig foodConfig;

    @RequestMapping("/hello")
    public Food hello(){
        Food food = new Food();
        food.setMeat(foodConfig.getMeat());
        food.setRice(foodConfig.getRice());
        return food;
    }
    @Autowired
    private VegetablesConfig vegetablesConfig;
    @RequestMapping("/vegetable")
    public Vegetables vegetables(){
        Vegetables vegetables = new Vegetables();
        vegetables.setEggplant(vegetablesConfig.getEggplant());
        vegetables.setGreenpeper(vegetablesConfig.getGreenpeper());
        vegetables.setPotato(vegetablesConfig.getPotato());
        return vegetables;
    }
}
