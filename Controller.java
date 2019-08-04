import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class Controller {
      
       private Review_Form theView;
       private Model theModel;
      
       public Controller(Review_Form theView, Model theModel) {
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addTesterListener(new addTesterListener());
        this.theView.addSubmitListener(new addSubmitListener());
        this.theView.addRunListener(new addRunButton());
       }
      
       class addTesterListener implements ActionListener{
              public void actionPerformed(ActionEvent e) {
                     theView.setTypeOfReview(theModel.getReviewDecision());
                     theView.setAccuracy(theModel.getAccuracy());
                     theView.setPolarity(theModel.getPolarity());
              }
       }
      
       class addSubmitListener implements ActionListener{
              public void actionPerformed(ActionEvent e) {
                     String uR = theView.getUserReview();
                     theModel.printReview(uR);
              }
       }
       
       class addRunButton implements ActionListener{
    	   public void actionPerformed(ActionEvent e) {
    		   String path = theView.getUploadPath();
    		   theModel.printPath(path);
    	   }
       }
 
}

