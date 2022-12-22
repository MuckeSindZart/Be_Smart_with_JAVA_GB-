package com.hmwrk;

import java.io.FileWriter;
import java.util.Iterator;
import java.util.List;

public class WriteToJson extends WriterTo {


    private List<Student> studentList;

    public WriteToJson(List<Student> studentList) {
        this.studentList = studentList;    
    }

    @Override
    public void saveFile() {
        System.out.println("Saved as studentList.json");
        try (FileWriter fw = new FileWriter("studentList.json", false)) {
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

        sb.append("{\n");
        while (itrtr.hasNext()) {
            Student st = itrtr.next();
            sb.append(String.format('"'+st.getName()+"\":"+  st.getGrade()));
            if (itrtr.hasNext()) { 
                sb.append(",\n");
            }
        }
        sb.append("\n}");
        return sb.toString();
    }

}
