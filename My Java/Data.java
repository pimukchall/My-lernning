import java.util.Scanner;
class STG
{
    public static void main(String[] args) 
{     
}
    {
        //-----------------------input preprocess------------------------------
        String students_code="",student_name="",subject_code="",subject_name="",subject_grade="";
        int subject_credit=0, subject_grade_num=0, credittotal=0,total_taken_credit=0, count_subject=0 ,level_grade=0;
        //---------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);

        //รับรหัส
        System.out.println("Please input your student code :");
        students_code = sc.next();

        //รับชื่อ
        System.out.println("Please input your student name :");
        students_name = sc.next();

        while(true)
        {
            System.out.println("Please input your student code :");
        subject_code = sc.next();
            System.out.println("Please input your student name :");
        subject_name = sc.next();
            System.out.println("Please input your student grade :");
        subject_grade = sc.next();
            System.out.println("Please input your student credit :");
        subject_credit = sc.next();
        if(subject_grade.equals("A")) {subject_grade_num = 4;}
        if(subject_grade.equals("B")) {subject_grade_num = 3;}
        if(subject_grade.equals("C")) {subject_grade_num = 2;}
        if(subject_grade.equals("D")) {subject_grade_num = 1;}
        credittotal = credittotal + (subject_grade_num*subject_credit);
        total_taken_credit = total_taken_credit + subject_credit;
        count_subject++;

            //check exit (y/n)
        System.out.print("EXIT (y/n) :");
        check_exit = sc.next();    
        if(check_exit.equalsIgnoreCase("y"))
        {
            break;
        }
//-----------------------------------------------------------------------------
        }//end while
        //calculate average grade of the student-------------------------------
        if(level_grade == 4){System.out.print("Your average grade is = A");}
        if(level_grade == 3){System.out.print("Your average grade is = B");}
        if(level_grade == 2){System.out.print("Your average grade is = C");}
        if(level_grade == 1){System.out.print("Your average grade is = D");}
//-----------------------------------------------------------------------------
    }//end main
}