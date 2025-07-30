class Parent {
    private String name;
    private Children children;

    public Parent(String name) {
        this.name = name;
    }

    public void setChildren(Children children) {
        this.children = children;
        if (children.getParent() != this) {
            children.setParent(this);
        }
    }

    public Children getChildren() {
        return children;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Parent name : " + getName());
        System.out.println("Children name : " + children.getName());
     }
}

class Children {
    private String name;
    private Parent parent;

    public Children(String name) {
        this.name = name;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
        if (parent.getChildren() != this) {
            parent.setChildren(this);
        }
    }

    public Parent getParent() {
        return parent;
    }

    public String getName() {
        return name;
    }
     public void display() {
        System.out.println("children name : " + getName());
        System.out.println("parent name : " + parent.getName());
     }
}
public class Biparent {
    public static void main(String[] args) {
        Parent p1 = new Parent("aki");
        Children c1 = new Children("animiya");
        c1.setParent(p1);
        p1.display();
        c1.display();
    }
}
