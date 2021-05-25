package mock;

public class Tasks {
    public static void main(String[] args) {
        int a, b;
        a=7;
        b=5;
        System.out.println("a= "+a+", b= "+b);
        b=a+b;
        a=b-a;
        b=b-a;
        System.out.println("a= "+a+", b= "+b);

        String sa, sb;
        sa="Hello";
        sb="John";
//        "HelloJohn"
        System.out.println("SA:"+sa+" SB:"+sb);
        sa=sa+sb;
        sb= sa.substring(0,sa.length()-sb.length());
        sa=sa.substring(sa.length()-sb.length()+1);
        System.out.println("SA:"+sa+" SB:"+sb);
    }


}
