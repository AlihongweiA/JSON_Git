package com.qf;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.List;

public class Json {
    @Test
    public void functiob(){

        String test="{\"name\":\"xiaoli\",\"age\":23}";
        Student student = JSON.parseObject(test, Student.class);
        System.out.println(student);

    }
    @Test
    public void function1(){
        String json = "{name:'张三',age:23,gender:'男',score:{englishScore:88,mathScore:66}}";
        Student student = JSON.parseObject(json, Student.class);
        System.out.println(student);
    }

    @Test
    public void function2(){
        String json = "[{englishScore:23,mathScore:34},{englishScore:45,mathScore:66}]";
        List<Scone> scones = JSON.parseArray(json, Scone.class);
        for (Scone scone : scones) {
            System.out.println(scone);
        }

    }


}
