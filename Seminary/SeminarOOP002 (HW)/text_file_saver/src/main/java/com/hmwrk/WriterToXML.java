package com.hmwrk;

import java.io.FileWriter;
import java.util.Iterator;
import java.util.List;

public class WriterToXML extends WriterTo {

    private List<Student> studentList;

    public WriterToXML(List<Student> studentList) {
        this.studentList = studentList; 
    }

    @Override
    public void saveFile() {
        System.out.println("Saved as studentList.xml");
        try (FileWriter fw = new FileWriter("studentList.xml", false)) {
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
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n");
        sb.append("<students>\n");

        Iterator<Student> itrtr = studentList.iterator();

        while (itrtr.hasNext()) {
            Student st = itrtr.next();
            sb.append("\t<student>\n" + "\t\t<name>" + st.getName() + "</name>\n" + "\t\t<grade>"
                        + st.getGrade() + "</grade>\n" + "\t</student>\n");
            if (itrtr.hasNext()) { 
            }
        }
        sb.append("</students>");
        return sb.toString();
    }
 


    
}
