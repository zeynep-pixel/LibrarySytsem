public class Person{

   private String firstName;
   private String lastName;
   private Date dateOfBirth;
   
   public Person(String firstName, String lastName, Date dateOfBirth){
    this.firstName = firstName;
    this.lastName= lastName;
    this.dateOfBirth = dateOfBirth;
  
   }
   
   public Person(String firstName, String lastName, int day, int mounth, int year){
    this.firstName = firstName;
    this.lastName= lastName;
    this.dateOfBirth = new Date(day,mounth,year);
   }
   
   public String getFirstName() {
        return firstName;
    }

    
    public String getLastName() {
        return lastName;
    }

    
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    
    public String toString() {
       
        return "Person{" +
                "firstName='" + this.getFirstName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", dateOfBirth=" + this.getDateOfBirth() +
                '}';
    }



}