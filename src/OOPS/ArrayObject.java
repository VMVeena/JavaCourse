package OOPS;
class Students
{
int id;
String name;
void display()
{
	System.out.println("Studnet information");
	}
}

public class ArrayObject {
	public static void main(String[] args) {
	//We can create arry of class also means non-prmitive data types
	Students st[]=new Students[3];
	st[0]=new Students();
	st[1]=new Students();
	st[2]=new Students();
	st[0].name="Veena";           
    st[0].id=1;
	st[0].display();
	st[1].name="Manu";
	st[1].id=2;
	st[1].display();
	st[2].name="Aaradhya";
	st[2].id=3;
	st[2].display();
	for(int i=0;i<st.length;i++)
	{
	System.out.println("Student ID "+st[i].id);
	System.out.println("Student ID "+st[i].name);
	}
	}
	
}
