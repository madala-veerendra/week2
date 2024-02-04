
public class ExcHan {
    //this keyword
    int arg = 5;
    void myTest(int arg){
        this.arg = arg;
    }
    public static void main(String[] args){
        int arg=10;
        ExcHan obj = new ExcHan();
        obj.myTest(arg);
        System.out.println(obj.arg);
    }
}
