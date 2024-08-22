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

public class SardController implements Initializable{
	
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
	private Rectangle Area7;
	@FXML
	private Rectangle Area8;
	
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
			message="301\nこの部屋にPCはありません。\\nノーパソの貸し出しを二階にて受け付けております。";
		}
		else if(isMouseInsideObjectArea(x,y,Area5)) {
			message="301\nこの部屋にPCはありません。\\nノーパソの貸し出しを二階にて受け付けております。";
		}
		else if(isMouseInsideObjectArea(x,y,Area6)) {
			message="302\nこの部屋にPCはありません。\nノーパソの貸し出しを二階にて受け付けております。";
		}
		else if(isMouseInsideObjectArea(x,y,Area7)) {
			message="303\nこの部屋にPCはありません。\nノーパソの貸し出しを二階にて受け付けております。";
		}
		else if(isMouseInsideObjectArea(x,y,Area8)) {
			message="304\nこの部屋にPCはありません。\nノーパソの貸し出しを二階にて受け付けております。";
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
	private Button button4;

	
	@FXML
	private void goToSecondFloor() throws IOException{
		
	//FXMLのload
		FXMLLoader loader = new FXMLLoader(getClass().getResource("SecondFloor.fxml"));
		Parent Mainroot = loader.load();
		
	//scene make 
		Scene Mainscene = new Scene(Mainroot,1500,800);
		
	//現在のシーンを取得
		Stage stage = (Stage) button4.getScene().getWindow();
		stage.setScene(Mainscene);
		stage.setTitle("2階");
		stage.show();
		
		
		
	}
	@FXML
	private Button button5;//連結するボタンはメソッドの前に置く
	@FXML
	private void goToFourFloor() throws IOException{
		
	//FXMLのload
		FXMLLoader loader = new FXMLLoader(getClass().getResource("fourFloor.fxml"));
		Parent Sardroot = loader.load();
		
	//scene make 
		Scene Sardscene = new Scene(Sardroot,1500,800);
		
	//現在のシーンを取得
		Stage stage = (Stage) button5.getScene().getWindow();
		stage.setScene(Sardscene);
		stage.setTitle("4階");
		stage.show();
		
		
		
	}
	
	
	
	
	
	
}