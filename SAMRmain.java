
public class SAMRmain {
      
       public static void main(String[] args) {
              Review_Form theView = new Review_Form();
              Model theModel = new Model();
             
              Controller theController = new Controller(theView, theModel);
             
              theView.setVisible(true);
       }
 
}
