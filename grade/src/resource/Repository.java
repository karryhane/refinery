package resource;

import java.util.Scanner;
import controller.GradeController;
import model.Dao;
import view.Menu;
import view.Input;
import view.Output;
import view.Rank;
import view.Modify;
import view.Search;
import view.Delete;



public interface Repository {
	String appName = "::::::¼ºÀûÇ¥:::::::";
	GradeController controller = new GradeController();
	int MAX = 100;
	Menu menu = new Menu();
	
	Input input = new Input();
	Output output = new Output();
	Search search = new Search();
	Modify modify = new Modify();
	Delete delete = new Delete();
	Rank rank = new Rank();
	
	Dao dao = Dao.getInstance();
	
	Scanner scan = new Scanner(System.in);
	
	
	Data data = new Data();
	
	

}