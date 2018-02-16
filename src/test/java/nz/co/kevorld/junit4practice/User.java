package nz.co.kevorld.junit4practice;

import nz.co.kevorld.utils.City;
import nz.co.kevorld.utils.EnumUtil;

public class User {

    User(City city){
        System.out.println("I live in " + city + ": " + EnumUtil.EnumTypeCounter(city) + " time.");
    }
}
