//Zeynep Tatar 220101087
//This class



public class LibraryItem {
    private String title;
    private int itemID;
    private boolean isAvailable;
    static int lastItemID = -1;
    
    
   
    // Constructor
    public LibraryItem(String title) {
        this.title=title;
        this.itemID = lastItemID + 1;
        this.isAvailable = true;
        lastItemID += 1;
    }
    
    //Method that returns title
    public String getTitle(){
      return title;
    }
    
    //Method that returns itemID
    public int getItemID(){
      return itemID;
    }
    
    //Method that returns if it is available
    public boolean getIsAvailable(){
      return isAvailable;
    }
    
    //Method that sets available value false if it is true for borrowing
    public void borrowItem(){
      if(isAvailable == true){
       isAvailable = false;
      }
      else{
       System.out.println("not available");
      }
    } 
    
    //Method that sets available value true if it false for retruning
    public void returnItem(){
      if(isAvailable == false){
       isAvailable = true;
      }
      else{
       System.out.println("allready returned");
      }
    }
    
    //Method that print out informatin 
    public String toString()
    {
        //System.out.println( "title : " + this.getTitle() +  " name : " + this.getItemID() +  " salary : " + this.getIsAvailable() + "\n");
        return "title : " + this.getTitle() +  "name : " + this.getItemID() +  "salary : " + this.getIsAvailable() + "\n";
    }
   
}
