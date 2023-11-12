public class Employee{
    // extends Object will be added automatically
    
    // name of the empl.
    private String name;

    // salary
    private double salary;

    // id
    private int id;
    
    // static field to keep track of the employee ids
    private static int lastEmployeeId = 0;

    // constructors
    // first constructor with a single argument
    public Employee(String name)
    {
  // the below is optional since the Object class we are extending
  // has already an empty constructor
        //super();
  // set the name field
        this.setName(name);
  // set the salary with default value of 0
        this.setSalary(0);
  // some bookkeping to track the ids
        this.id = lastEmployeeId + 1;
        lastEmployeeId += 1;
    }
    // this is an example method overloading via the constructor
 // remember that a constructor is a method that is executed
 // when an instance is being created
    public Employee(String name, double salary)
    {
        // we have already implemented the below 
        // in the previous constructor
        /*this.setName(name);
        this.id = lastEmployeeId + 1;
        lastEmployeeId += 1;
        */
  // therefore, use it instead through this
        this(name);
  // set the salary
        this.setSalary(salary);
    }
    
    // get empl. name
    public String getName()
    {
        return name;
    }
    // set emply. 
    public void setName(String name)
    {
        // here, whenever you refer name
        // you are actually refering name
        // parameter not the name field of the instance
        // use this.name to refer the name field of the instance
        this.name = name;
    }
    // get salary
    public double getSalary()
    {
        return this.salary;
    }
    // set salary if it is gthan 0
    public void setSalary(double salary)
    {
  // set methods are handy to have a full control of our instance fields
        if(salary > 0)
            this.salary = salary;
    }
 
    // get id field
    // i am not implementing setId
    // because i want id field to be read-only....
    public int getId()
    {
        return this.id;
    }

    // method overriding
    // change the behavior of the inhereted method 
 // we are dealing with toString method of the Object class
 // in this specific example
    public String toString()
    {
        return "id : " + this.getId() + "\n" + 
               "name : " + this.getName() + "\n" + 
               "salary : " + this.getSalary() + "\n";
    }
    // more about overriding:
 // you can also use @override annonation
    // with this method. i want to make sure that incoming
    // instance of Object has the same id, name  with my current instance
    // if so, i return true otherwise return false
    @Override
    public boolean equals(Object o)
    {
        // check if it is an Employee instance
        if( o instanceof Employee)
        {
   // typecast to an Employee
            Employee e = (Employee)o;
            return (
                    this.getId() == e.getId() 
                    && 
                    this.getName().equals(e.getName())
                   );
        }
        return false;
    }

}