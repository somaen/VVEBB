package model.ntnu.tdt4165;

import java.util.Date;

import model.Assessment;
import model.User;
import model.UserGroup;
import model.files.FileGroup;
import model.ntnu.Semester;
import model.files.*;

public class Course extends model.ntnu.Course {

	public Course(UserGroup owner, String name, String code, Semester semester,
			int year) {
		super(owner, name, code, semester, year);
		name = "progspråk";
		code = "tdt4165";
		
		test();
	}
	
	private void test(){
		// create some users
		User andreao = new User("andreao");
		User somaen = new User("somaen");
		students.add(andreao);
		studasses.add(somaen);
		
		// create assignment
		Date now = new Date();
		PublishedFileGroup oving1Files = new PublishedFileGroup(now,now);
		oving1Files.add(new File("ov1.pdf","ov1.pdf", "Introduksjon til Oz"));
		PublishedFileGroup oving1SolutionFiles = new PublishedFileGroup(now,now);
		oving1SolutionFiles.add(new File("ov1_lf.pdf","ov1_lf.pdf", "Løsningsforslag"));
		oving1SolutionFiles.add(new File("List.oz","List.oz", ""));
		Assignment assignment = new Assignment("Øving 1", "Introduksjon til Oz", now,now, oving1Files, oving1SolutionFiles); 
		assignments.add(assignment);
		
		// create a delivery
		UserGroup gruppe1 = new UserGroup();
		gruppe1.add(andreao);
		File fil = new File("oving1.oz","","mitt svar på øving 1");
		FileGroup filer = new FileGroup();
		filer.add(fil);
		Delivery levering1 = new Delivery(gruppe1,filer);
		assignment.deliveries.add(levering1);
		
		// create an assessment
		Assessment vurdering1 = new Assessment(studasses, "Bra!", now);
		levering1.assessment = vurdering1;
	}
}
