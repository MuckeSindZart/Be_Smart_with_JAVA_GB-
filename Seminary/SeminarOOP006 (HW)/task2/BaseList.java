package task2;

import java.util.ArrayList;
import java.util.List;

public class BaseList<L> implements CustomList {
    private List<L> list;

    public BaseList(List<L> list) {
        this.list = new ArrayList<>(list);
    }

    public List<L> getList() {
        return list;
    }

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public L get(int index) {
        return list.get(index);
    }

}
