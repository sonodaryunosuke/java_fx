package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class SecondFloorController implements Initializable{
	
	@FXML
	private ImageView imageView;
	
	@FXML
	private Rectangle Area1;
	@FXML
	private Rectangle Area2;
	@FXML
	private Rectangle Area3;
	@FXML
	private Rectangle Area4;
	@FXML
	private Rectangle Area5;
	@FXML
	private Rectangle Area6;
	
    @FXML
    private Label messageLabel;
    
    private String message;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        imageView.setOnMouseMoved(this::handleMouseMoved);
    }
	@FXML
	private void handleMouseMoved(MouseEvent event) {
		double x = event.getX();
		double y = event.getY();
		

		if(isMouseInsideObjectArea(x,y,Area1)) {
			message="トイレ\n教務員専用のトイレです。\n学生は二階以降のトイレを使ってください";
		}
		else if(isMouseInsideObjectArea(x,y,Area2)) {
			message="トイレ\n教務員専用のトイレです。\n学生は二階以降のトイレを使ってください";
		}
		else if(isMouseInsideObjectArea(x,y,Area3)) {
			message="エレベーター\nお客様優先でお使いください。";
		}
		else if(isMouseInsideObjectArea(x,y,Area4)) {
			message="教務部\n教員にご用がある場合は受付をご利用ください。";
		}
		else if(isMouseInsideObjectArea(x,y,Area5)) {
			message="受付\n9時半から19時まで受け付けております。";
		}
		else if(isMouseInsideObjectArea(x,y,Area6)) {
			message="階段\n二階につながっております";
		}
		
		messageLabel.setText(message);
	}
	private boolean isMouseInsideObjectArea(double mouseX, double mouseY,Rectangle area) {
		double areaX = area.getX();
		double areaY = area.getY();
		double areaWidth = area.getWidth();
		double areaHeight = area.getHeight();
        System.out.println(String.format("Area: (X: %.2f, Y: %.2f, Width: %.2f, Height: %.2f)",
                areaX, areaY, areaWidth, areaHeight));
        System.out.println(String.format("Mouse Position: (X: %.2f, Y: %.2f)", mouseX, mouseY));
		
		return mouseX >= areaX && mouseX <= (areaX + areaWidth) &&
				mouseY >= areaY && mouseY <=(areaY + areaHeight);
	}
	@FXML
	private Button button2;

	
	@FXML
	private void goToFirstFloor() throws IOException{
		
	//FXMLのload
		FXMLLoader loader = new FXMLLoader(getClass().getResource("MainFloor.fxml"));
		Parent Mainroot = loader.load();
		
	//scene make 
		Scene Mainscene = new Scene(Mainroot,1500,800);
		
	//現在のシーンを取得
		Stage stage = (Stage) button2.getScene().getWindow();
		stage.setScene(Mainscene);
    	stage.setTitle("1階");
		stage.show();
		
		
		
	}
	@FXML
	private Button button3;//連結するボタンはメソッドの前に置く
	@FXML
	private void goToSardFloor() throws IOException{
		
	//FXMLのload
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Sard.fxml"));
		Parent Sardroot = loader.load();
		
	//scene make 
		Scene Sardscene = new Scene(Sardroot,1500,800);
		
	//現在のシーンを取得
		Stage stage = (Stage) button3.getScene().getWindow();
		stage.setScene(Sardscene);
    	stage.setTitle("3階");
		stage.show();
		
		
		
	}
	
	
	
	
	
	
}