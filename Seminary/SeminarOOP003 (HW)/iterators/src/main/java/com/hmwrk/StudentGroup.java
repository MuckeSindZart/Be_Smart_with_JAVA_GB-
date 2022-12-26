package com.hmwrk;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentGroup {

    private List<Student> list;

    public StudentGroup(List<Student> list) {
        this.list = list;
    }

    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    public ListIterator<Student> listIterator(int position) {
        return new StudentGroupListIterator(this, position);
    }

    public Iterator<Student> reverseIterator() {
        return new ReverseIterator(this);
    }

    public int groupSize() {
        return list.size();
    }

    public Student nextStudent(int index) {
        return list.get(index);
    }
}
