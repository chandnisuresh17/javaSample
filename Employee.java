class Employee {
    int eId;
    String name;
    int salary;


}



class Array {
    public static void main(String[] args) {
        
        int nums[] = {1, 2, 3, 4, 5};

        int nums1[] =new int[10];

        for(int i=0;i< nums.length;i++) {
           // System.out.println(nums[i]);
        }



        Employee e1 = new Employee();
        e1.eId= 1;
        e1.name = "Alan";
        e1.salary = 1500000;

        
        Employee e2 = new Employee();
        e2.eId= 2;
        e2.name = "Akhila";
        e2.salary = 2000000;

        
        Employee e3 = new Employee();
        e3.eId= 3;
        e3.name = "Thomas";
        e3.salary = 30000000;

        Employee empArr[] = new Employee[3];
        empArr[0] = e1;
        empArr[1] = e2;
        empArr[2] = e3;

        for (Employee employee : empArr) {
            System.out.println(employee);
            System.out.println(employee.eId + " " + employee.name + " "+ employee.salary);
        }

    }
}