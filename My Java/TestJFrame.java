import javax.swing.JFrame;
public class TestJFrame {
    public static void main(String[] args) {
        //สร้าง JFrame โดยมี Title เป็น "My Frist Windows";
        JFrame frame = new JFrame("My First Windows");
        //ตั้งค่าจุดเริ่มต้นและขนาดของ Windows ที่แสดง
        frame.setBounds(50,100,400,200);
        //เมื่อผู้ใช้งานปิด Windows ลง
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // ตั้งค่าให้แสดง Windows โดยให้ Visible เป็นค่า true
        frame.setVisible(true);
    }
}