package Neibulei;

public class OuterClass {//外部类
    public void display(){
        System.out.println("外部类对象的方法OuterClass...");
    }
    
    private class InnerClass{//内部类
        public OuterClass getOuterClass(){//返回一个外部类对象
            return OuterClass.this;
        }
    }
    
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.new InnerClass();
        innerClass.getOuterClass().display();
    }
}
