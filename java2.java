import java.util.*;


class Person {
	public String name;
	public String address;
	public int ph_no;


	Person(){
		name = "";
		address = "";
		ph_no = 0;
	}
 	
	Person(String nm, String add, int ph){
		name = nm;
		address = add;
		ph_no = ph;
	}

	public void show(){
		System.out.println("Name of person:" + name);
		System.out.println("Address of person:" + address);
		System.out.println("Phone no. of person:" + ph_no);
	}
	
	public void show(String  person_type){
	    System.out.println("Name of" +person_type+" - "+name);
		System.out.println("Address of "+person_type+" - " + address);
		System.out.println("Phone no. of "+person_type+" - " + ph_no);
	    
	}

	public Person get(){
		Person obj = new Person(name,address,ph_no);
		return obj;	
	}
	
}

class Faculty {
	public int code;
	public String name;
 	public String designation;
	

	Faculty(){
		code = 0;
		name = "";
		designation = "";
	}
	
	
	Faculty(int cd,String nm,String desg){
		code = cd;
		name = nm;
		designation = desg;
	}

	public void show(){
		System.out.println("Code of faculty:" + code);
		System.out.println("Name of faculty:" + name);
		System.out.println("Designation of faculty:" + designation);
	}
	

	public Faculty get(){
				
        Faculty obj = new Faculty(code,name,designation);
        return obj;

	}
	
}


class Student {

	public String name;
	public String reg_no;
	public String address;
	public String email;
	public int ph_no;
	public  int course_code1;
	public String slot1;
	public String title1;
	public Faculty faculty1;
	public  int course_code2;
	public String slot2;
	public String title2;
	public Faculty faculty2;
	public  int course_code3;
	public String slot3;
	public String title3;
	public Faculty faculty3;
	public  int course_code4;
	public String slot4;
	public String title4;
	public Faculty faculty4;
	public  int course_code5;
	public String slot5;
	public String title5;
	public Faculty faculty5;

	public void show(){
		Person p = new Person(name,address,ph_no);
		p.show();
		System.out.println("Email of student: " + email);
	    System.out.println("Registration number of student: " + reg_no);
	    System.out.println("Course code: " + course_code1);
	    System.out.println("Slot: " + slot1);
	    System.out.println("Title: " + title1);
	    faculty1.show();
	    System.out.println("Course code: " + course_code2);
	    System.out.println("Slot: " + slot2);
	    System.out.println("Title: " + title2);
	    faculty2.show();
	    System.out.println("Course code: " + course_code3);
	    System.out.println("Slot: " + slot3);
	    System.out.println("Title: " + title3);
	    faculty3.show();
	    System.out.println("Course code: " + course_code4);
	    System.out.println("Slot: " + slot4);
	    System.out.println("Title: " + title4);
	    faculty4.show();
	    System.out.println("Course code: " + course_code5);
	    System.out.println("Slot: " + slot5);
	    System.out.println("Title: " + title5);
	    faculty5.show();
	}

}

class StudentInfo{

	public static void main(String args[]){
		Scanner s1 = new Scanner(System.in);
		Student[] arr;
		arr = new Student[1];
		for(int i=0;i<1;i++){
			arr[i] = new Student();
			Person p = new Person();
			System.out.println("Enter the name of Student:");
			p.name = s1.next();
			arr[i].name = p.name;
			System.out.println("Enter the address of Student:");
			p.address = s1.next();
			arr[i].address = p.address;
			System.out.println("Enter the phone number of Student:");
			p.ph_no = s1.nextInt();
			arr[i].ph_no = p.ph_no;
			System.out.println("Enter the email of Student :");
			arr[i].email = s1.next();
			System.out.println("Enter the registration number of Student :");
			arr[i].reg_no = s1.next();
			System.out.println("Enter the details of course 1 in the order course_code , course_slot , course_title , faculty_name , faculty_code , faculty_designation :");
			arr[i].course_code1 = s1.nextInt();
			arr[i].slot1 = s1.next();
			arr[i].title1 = s1.next();
			Faculty f1 = new Faculty();
			f1.name = s1.next();
			f1.code =s1.nextInt();
			f1.designation = s1.next();
			arr[i].faculty1 = f1;
			System.out.println("Enter the details of course 2 in the order course_code , course_slot , course_title , faculty_name , faculty_code , faculty_designation :");
			arr[i].course_code2 = s1.nextInt();
			arr[i].slot2 = s1.next();
			arr[i].title2 = s1.next();
			Faculty f2 = new Faculty();
			f2.name = s1.next();
			f2.code = s1.nextInt();
			f2.designation = s1.next();
			arr[i].faculty2 = f2;
			System.out.println("Enter the details of course 3 in the order course_code , course_slot , course_title , faculty_name , faculty_code , faculty_designation :");
			arr[i].course_code3 = s1.nextInt();
			arr[i].slot3 = s1.next();
			arr[i].title3 = s1.next();
			Faculty f3 = new Faculty();
			f3.name = s1.next();
			f3.code = s1.nextInt();
			f3.designation = s1.next();
			arr[i].faculty3 = f3;
			System.out.println("Enter the details of course 4 in the order course_code , course_slot , course_title , faculty_name , faculty_code , faculty_designation :");
			arr[i].course_code4 = s1.nextInt();
			arr[i].slot4 = s1.next();
			arr[i].title4 = s1.next();
			Faculty f4 = new Faculty();
			f4.name = s1.next();
			f4.code = s1.nextInt();
			f4.designation = s1.next();
			arr[i].faculty4 = f4;
			System.out.println("Enter the details of course 5 in the order course_code , course_slot , course_title , faculty_name , faculty_code , faculty_designation :");
			arr[i].course_code5 = s1.nextInt();
			arr[i].slot5 = s1.next();
			arr[i].title5 = s1.next();
			Faculty f5 = new Faculty();
			f5.name = s1.next();
			f5.code = s1.nextInt();
			f5.designation = s1.next();
			arr[i].faculty5 = f5;
		}
		
		for(int i=0;i<1;i++){
		    arr[i].show();
		}
	}

}