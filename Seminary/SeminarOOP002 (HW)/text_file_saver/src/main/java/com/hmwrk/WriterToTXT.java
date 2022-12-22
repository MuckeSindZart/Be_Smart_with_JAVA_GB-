package com.hmwrk;

import java.io.FileWriter;
import java.util.Iterator;
import java.util.List;

public class WriterToTXT extends WriterTo {

    private List<Student> studentList;

    public WriterToTXT(List<Student> studentList) {
        this.studentList = studentList; 
    }


    @Override
    public void saveFile() {
        System.out.println("Saved as studentList.txt");
        try (FileWriter fw = new FileWriter("studentList.txt", false)) {
            String text = bildText();
            fw.write(text);
            fw.append("\n");
            fw.flush();
            System.out.println(text);
        } catch (Exception e) {
            // TODO: handle exception
        }        
    }

    @Override
    public String bildText() {
        StringBuilder sb = new StringBuilder();

        Iterator<Student> itrtr = studentList.iterator();

        while (itrtr.hasNext()) {
            Student st = itrtr.next();
            sb.append(st.getName() + "=" + st.getGrade() + "\n");
        }
        return sb.toString();
    }
    
}
