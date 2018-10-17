package javaee;

public class SinhVien {
    private String name;
    private transient  String lop;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
