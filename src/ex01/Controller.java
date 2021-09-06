package ex01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;

public class Controller implements Initializable{
	private Parent root;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public void viewProc() {
		System.out.println("확인 버튼 클릭");
		boolean gender = getGender();
		int hobby = getHobby();
		String age = getComboBox();
		System.out.println(gender);
		System.out.println(hobby);
		System.out.println(age);
	}
	
	public boolean getGender() {
		RadioButton rdoMan = (RadioButton)root.lookup("#rdoMan");
		if(rdoMan.isSelected()) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getHobby() {
		int hobby = 0;
		CheckBox music = (CheckBox)root.lookup("#chkMusic");
		CheckBox book = (CheckBox)root.lookup("#chkBook");
		CheckBox game = (CheckBox)root.lookup("#chkGame");
		if(music.isSelected()) {
			hobby+=1;
		}
		if(book.isSelected()) {
			hobby+=2;
		}
		if(game.isSelected()) {
			hobby+=4;
		}
		return hobby;
	}
	
	public String getComboBox() {
		ComboBox<String> cmbAge = (ComboBox<String>)root.lookup("#cmbAge");
		String age = null;
		if(cmbAge.getValue() == null) {
			System.out.println("콤보박스를 선택해주세요");
		} else {
			age = cmbAge.getValue().toString();
		}
		return age;
	}
	
	public void addComboBox() {
		ComboBox<String> cmbAge = (ComboBox<String>)root.lookup("#cmbAge");
		if(cmbAge != null) {
			cmbAge.getItems().addAll("20대 미만", "20대", "30대", "40대 이상");
		}
	}
	
	public void setRoot(Parent root) {
		this.root = root;
		addComboBox();
	}
}
