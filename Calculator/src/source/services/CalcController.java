package source.services;


public class CalcController {
	Model model;
	View view;
	
	public CalcController(){
		model = new Model();
		view = new View(model);
	}
	
}
