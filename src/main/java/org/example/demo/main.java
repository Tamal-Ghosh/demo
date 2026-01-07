package org.example.demo;


import org.json.JSONObject;

public class main {

    public static   void main(String args[]) throws Exception {

        String json = "{\"name\":\"Alice\",\"age\":20}";

//        ObjectMapper mapper = new ObjectMapper();
//        person p=mapper.readValue(json, person.class);
//        System.out.println("Name: " + p.name);
//        System.out.println("Age: " + p.age);
        JSONObject jsonObject = new JSONObject(json);
        String name= jsonObject.getString("name");
        int age= jsonObject.getInt("age");
        System.out.println("Name: " + name);


    }

}
