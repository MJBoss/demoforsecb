
package demoappforc;


public class DemoAppforC {

 
    public static void main(String[] args) {
        Grades gr = new Grades();
        gr.addGrades(1011, "Mike", 1.2, 3.2, 1.2, 2.1);
        gr.viewGrades();
        
        Grades gr1 = new Grades();
        gr1.addGrades(1011, "John", 1.2, 3.2, 1.2, 2.1);
        gr1.viewGrades();
    }
    
}
