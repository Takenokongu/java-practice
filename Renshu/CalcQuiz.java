import java.util.Random;
public class CalcQuiz {
    String question;
    String answer;

    CalcQuiz(){
        createQuestion();
    }
    void createQuestion(){
        Random rnd=new Random();
        int a=rnd.nextInt(100);
        int b=rnd.nextInt(1000);
        question=a+"x"+b+"=?";
        answer=Integer.toString(a*b);
    }
    String getQuestion(){
        return question;
    }
    String answer(){
        return answer;
    }
}
