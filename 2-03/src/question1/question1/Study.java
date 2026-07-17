package question1;

public class Study {

    // ①
    private String msg;
    // ②
    public Study() {
        this.msg = "I'm studying Java";

    }

    // ③
    protected void printConnectedString(String hello,String study){
        System.out.println(hello + study);
    }

    // ④
    protected void  introduce(){
        System.out.println(msg);
    }
}
