package Neibulei;

public class OuterClass {//�ⲿ��
    public void display(){
        System.out.println("�ⲿ�����ķ���OuterClass...");
    }
    
    private class InnerClass{//�ڲ���
        public OuterClass getOuterClass(){//����һ���ⲿ�����
            return OuterClass.this;
        }
    }
    
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.new InnerClass();
        innerClass.getOuterClass().display();
    }
}
