package temporary;

import fooddetails.LeArabia;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class EmployeeTemp {
    private String name;
    private String id;

    public EmployeeTemp(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
class LeArabiaTemp {
    private String fid;
    private String fname;
    private double price;

    public LeArabiaTemp(String fid, String fname, double price) {
        this.fid = fid;
        this.fname = fname;
        this.price = price;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
public class Disposible {
    public static void main(String[] ar) {

        LeArabiaTemp vegMeals = new LeArabiaTemp("1001", "Veg Meals", 80);
        LeArabiaTemp fishCurryMeals  = new LeArabiaTemp("1002", "Meals with Fish Curry", 120);
        LeArabiaTemp chappatiVegCurry = new LeArabiaTemp("1003", "Chappati with Veg Curry", 40);
        LeArabiaTemp chappatiChickenCurry = new LeArabiaTemp("1004", "Chappati with Chicken Curry", 120);

        List<LeArabiaTemp> myLeArabia = new ArrayList<>();
        myLeArabia.add(vegMeals);
        myLeArabia.add(fishCurryMeals);
        myLeArabia.add(chappatiChickenCurry);
        myLeArabia.add(chappatiVegCurry);

        List<EmployeeTemp> myEmployee = new ArrayList<>();
        EmployeeTemp employeeOne = new EmployeeTemp("Tony", "1235");
        EmployeeTemp employeeTwo = new EmployeeTemp("Tony", "1275");
        myEmployee.add(employeeOne);
        myEmployee.add(employeeTwo);

        Map<String, List<String>> orderListForEmployees = new HashMap<>();
        List<String> myFood = new ArrayList<>();
        myFood.add(vegMeals.getFid());
        myFood.add(fishCurryMeals.getFid());

        String uid = "1235";

        orderListForEmployees.put(employeeOne.getId(), myFood);

        String employeeName = myEmployee.stream()
                .filter(val -> val.getId().equals(uid))
                .map(EmployeeTemp::getName).toList().get(0);

//       System.out.println(employeeName);

       orderListForEmployees.forEach((key, value) -> {
           if (key.equals(uid)) {
               value.forEach(t -> {
                   myLeArabia.forEach(val -> {
                       if (val.getFid().equals(t))
                           System.out.println("Food Item: " + val.getFname() + " | Price: " +val.getPrice());
                   });
               });
           }
       });



//       Optional<List<String>> st = orderListForEmployees.entrySet().stream()
//                .filter(e -> e.getKey() == uid).map(Map.Entry::getValue).findFirst();
//        System.out.println(st);
//
//        st.stream().forEach(t-> {
//            t.stream().forEach(y-> {
//                System.out.println(y);
//            });
//        });

    }
}
