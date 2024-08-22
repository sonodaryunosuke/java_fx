package application;
	
import javafx.application.Application;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.HBox;
//import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Main extends Application {
//	@Override
//	public void start(Stage primaryStage) {
//		try {
			
			
//			Image image = new Image("file:///C:/pleiades/2023-12/workspace/java_fx/src/application/image/kannnai.png");
//			ImageView iv1 = new ImageView();
//			iv1.setImage(image);
//			
//			
//			
//			
//			Group root = new Group();
//			Scene scene = new Scene(root);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			HBox box = new HBox();
//			box.getChildren().add(iv1);
//			root.getChildren().add(box);
//			primaryStage.setScene(scene);
//			primaryStage.show();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		 @Override
		    public void start(Stage primaryStage) throws Exception {
		        Parent root = FXMLLoader.load(getClass().getResource("MainFloor.fxml"));
		        Scene scene = new Scene(root,1500,800);
		        primaryStage.setScene(scene);
		        primaryStage.setTitle("1階");
		        primaryStage.show();
		    }

		    public static void main(String[] args) {
		        launch(args);
		    }
		}
