package client;
import Database.Repo;
import entity.Student;
public class App 
{
    public static void main( String[] args )
    
    {
    	Student st = new Student("Ajay",2800,21);
    	Repo.persist(st);
        
    }
}
