package yichang;

public class TestException {
    public static void main(String[] args)  {
       try{ ageTest(110);
       }
       catch (AgeException e){
           System.out.println(e.getMessage());
        };

    }

    public static String ageTest(int age)  {
        if(age<0||age>100){
            throw new AgeException(age+"年龄异常");
        }
        else{
            return "年龄正常";
        }

    }
}
