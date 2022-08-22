import java.util.Scanner;
class STG
{
    public static void main(String[] args)
    {
        //-----------------------input preprocess------------------------------
        String student_code="",student_name="",subject_code="",subject_name="",subject_grade="" ,check_exit="";
        int subject_credit=0, subject_grade_num=0, credittotal=0,total_taken_credit=0, count_subject=0 ,level_grade=0; 
        //---------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);

        //รับรหัส
        System.out.println("Please input your student code :");
        student_code = sc.next();

        //รับชื่อ
        System.out.println("Please input your student name :");
        student_name = sc.next();

        while(true)
        {
            System.out.println("Please input your subject code :");
        subject_code = sc.next();
            System.out.println("Please input your subject name :");
        subject_name = sc.next();
            System.out.println("Please input your subject grade :");
        subject_grade = sc.next();
            System.out.println("Please input your subject credit :");
        subject_credit = sc.nextInt();
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
        level_grade = credittotal / total_taken_credit;
        if(level_grade == 4){System.out.print("Your average grade is = A");}
        if(level_grade == 3){System.out.print("Your average grade is = B");}
        if(level_grade == 2){System.out.print("Your average grade is = C");}
        if(level_grade == 1){System.out.print("Your average grade is = D");}
//-----------------------------------------------------------------------------
    }//end main
}