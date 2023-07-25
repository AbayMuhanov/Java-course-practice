package Interface;

import Interface.Student2;

public class StudentImpl implements Student2 {

    private String name;

    public StudentImpl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
