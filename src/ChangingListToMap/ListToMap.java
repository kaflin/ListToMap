package ChangingListToMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


//Changing list to map using stream Api
public class ListToMap {
    public static void main(String[] args) {
        List<Employee>list=new ArrayList<>();
        list.add(new Employee(1,"Shruti","Nepal Eye Hospital"));
        list.add(new Employee(2,"Suraj","Mandala System Pvt.ltd"));
//        System.out.println(list.get(1));

        Map<Long, String> map = list.stream().collect(Collectors.toMap(Employee::getEmpId, Employee::getEmpName));//toMap(key,value)
        System.out.println(map.get(1L));

        System.out.println("\n");

        Map<Long, Employee> map1 = list.stream().collect(Collectors.toMap(Employee::getEmpId, employee->employee));
        System.out.println(map1.get(1L).getCmpName());
    }
}
