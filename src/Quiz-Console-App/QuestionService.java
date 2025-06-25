import java.util.*;

public class QuestionService {
    Question[] qn=new Question[5];
    String[] selection=new String[5];
    public QuestionService(){
        qn[0] = new Question(1, "What is your name?", "Pushkar","Anuj", "Alka", "Kanchan", "Pushkar");
        qn[1] = new Question(2, "What is your age?", "12","34", "22", "20", "22");
        qn[2] = new Question(3, "What is your address?", "France","Hingna", "Nagpur", "Konkan", "Nagpur");
        qn[3] = new Question(4, "What is not your hobby?", "Swimming","Chess", "Cricket", "Reading", "Cricket");
        qn[4] = new Question(5, "What is your favorite food?", "Paneer","Chole Bhature", "Daal", "Rice cake", "Chole Bhature");
    }
    public void playQuiz(){
        Scanner sc=new Scanner(System.in);
        int i=0;
        for(Question q: qn){
            System.out.println("Question no: "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            System.out.println("Ans: ");
            selection[i]=sc.nextLine();
            i++;
        }
        String givenAns="Your answer: ";
        String correctAns="Correct answer: ";
        int j=0;
        for(String s:selection){
            System.out.println(givenAns+s+". "+correctAns+qn[j].getAnswer());
            j++;
        }
        sc.close();
    }
    public void printScore(){
        int score=0;
        for(int i=0;i<5;i++){
            if(qn[i].getAnswer().equals(selection[i])){
                score++;
            }
        }
        System.out.println("Your score is: "+score);
    }
    
}
