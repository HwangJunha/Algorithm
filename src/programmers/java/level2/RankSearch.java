//https://programmers.co.kr/learn/courses/30/lessons/72412
package programmers.java.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class RankSearch {

	public int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
        ArrayList<Person> list = new ArrayList<>();
        for(int i=0; i<info.length; i++){
            StringTokenizer st = new StringTokenizer(info[i]);
            String language=st.nextToken();
            String job = st.nextToken();
            String career = st.nextToken();
            String food = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            list.add(new Person(language,job,career,score,food)); //리스트 초기화
        }
        Collections.sort(list, (a,b)->Integer.compare(b.getScore(),a.getScore())); //1차적으로 점수별로 정렬
        
        for(int i=0; i<query.length; i++){
            int count=0;
            StringTokenizer st = new StringTokenizer(query[i]);
            String language=st.nextToken();
            st.nextToken();
            String job = st.nextToken();
            st.nextToken();
            String career = st.nextToken();
            st.nextToken();
            String food = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            for(Person person : list){
                if(score > person.getScore()){ //1차적으로 점수
                    break;
                }
                if(!"-".equals(food) && !food.equals(person.getFood())){
                    continue;
                }
                if(!"-".equals(job) && !job.equals(person.getJob())){
                    continue;
                }
                if(!"-".equals(career) && !career.equals(person.getCareer())){
                    continue;
                }
                if(!"-".equals(language) && !language.equals(person.getLanguage())){
                    continue;
                }
                count++;
            }
            answer[i]=count;
        }
        
        
        return answer;
    }
    
}
class Person{
    private String language; //언어
    private String job; // 지원 직군
    private String career; //경력
    private int score; //점수
    private String food; //소울 푸드
    
    public Person(String language, String job, String career, int score,String food){
        this.language = language;
        this.job = job;
        this.career = career;
        this.score = score;
        this.food = food;
    }
    
    public void setLanguage(String language){
        this.language=language;
    }
    public void setJob(String job){
        this.job = job;
    }
    public void setCareer(String career){
        this.career=career;
    }
    public void setScore(int score){
        this.score=score;
    }
    public void setFood(String food){
        this.food=food;
    }
    
    public String getLanguage(){
        return this.language;
    }
    public String getJob(){
        return this.job;
    }
    public String getCareer(){
        return this.career;
    }
    public int getScore(){
        return this.score;
    }
    public String getFood(){
        return this.food;
    }
    
}
