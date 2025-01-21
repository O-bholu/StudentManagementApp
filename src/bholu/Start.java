package bholu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.Student.manage.Student;
import com.Student.manage.StudentDao;

public class Start {

	public static void main(String[] args)throws  IOException{
		// TODO Auto-generated method stub
     System.out.println("Welcome to Student Management App");
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     while (true) {
    	 System.out.println("PRESS 1 to ADD student");
    	 System.out.println("PRESS 2 to Delete student");
    	 System.out.println("Press 3 to display student");
    	 System.out.println("Press 4 to update student");
    	 
    	 System.out.println("Press 5 to exit aap");
    	 
         int c=Integer.parseInt(br.readLine());
         
         
         if(c==1)
         {
        	//add student.. 
        	System.out.println(" Enter the  user name :"); 
        	String name=br.readLine();
        	
        	System.out.println(" Enter the  user phone :"); 
        	String phone=br.readLine();
        	
        	System.out.println(" Enter the  user city :"); 
        	String city=br.readLine();
        	
        	// create student object to store student
        	Student st=new Student(c, name,  phone ,city); 
        	boolean answer=StudentDao.insertStudentToDB(st);
        	if(answer) 
        	{
        		System.out.println(" student is added suceessfully " );
        	}else
        	{
         		System.out.println("something went worng try again..");
        	}
        	
        	System.out.println(st);
        	
         }else if(c==2)
         {
        	// delete student..
        	 System.out.println("Enter the  student id to delete");
        	 int userId = Integer.parseInt(br.readLine());
        	boolean f = StudentDao.deleteStudent(userId);
        	
        	if(f)
        	{
        		System.out.println("Deleted ... ");
        	}else
        	{
        		System.out.println("something went worng try again..");
        		
        	}
        	 
        	 
         } else if (c==3) 
         {
        	 //  display student..
        	 StudentDao.showAllStudent();
         }else if(c==4)
         {
        	 // exit 
        	 break;
         }else
         {
        	 
         }

	}
     System.out.println("Thanku  for using my application");
     System.out.println("See you soon .. bye bye ");
     
	}
  }	

