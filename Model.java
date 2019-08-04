import javax.swing.JTextArea;

public class Model {
      
       private String reviewDecision = "Positive";
       private double accuracy = 0.85;
       private String polarity = "Strong";

       // dummy data to make sure it is getting sent from Model to the View, via Controller
       public String getReviewDecision() {
              return reviewDecision;
       }
       // dummy data to make sure it is getting sent from Model to the View, via Controller      
       public double getAccuracy() {
              return accuracy;
       }
       // dummy data to make sure it is getting sent from Model to the View, via Controller
       public String getPolarity() {
              return polarity;
       }
      
       // function just to make sure that the user's review is making it to the Model...
       public void printReview(String uReview) {
              System.out.println("This is your Review: " + uReview);
       }
       
       public void printPath(String p) {
    	   System.out.println("This is the path for the file selected: " + p);
       }
 
}
