package com.hmwrk;

public class ReverseIterator extends StudentGroupIterator {

    public ReverseIterator(StudentGroup studentGroup) {
        super(studentGroup);
        index = studentGroup.groupSize() - 1;
    }

    public boolean hasNext() {
        return index > -1;
    }

    public Student next() {
        return studentGroup.nextStudent(index--);
    }

}