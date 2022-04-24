package Exception;

public class ExceptionTest08 {
    public static void main(String[] args) {
        /*
            try和finally 没有catch可以吗? 可以
                try不能单独使用
                try finally可以联合使用
            以下代码的执行顺序:
                先执行try,
                后执行finally
                最后执行return(return语句只要执行方法必然结束
         */
        try {
            System.out.println("try");
//            System.exit(0);//这里是直接退出JVM
            return;
        } finally {
            System.out.println("finally");
        }
//        System.out.println("e hello");//这句是无法执行的语句
    }
}
