//https://programmers.co.kr/learn/courses/30/lessons/12899
package programmers.lever2;

public class CountryNumber {
	public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        int number = 0;

        while(n>0) {
            number = n%3;
            n = n/3;
            
            //3진법의 응용
            //3진법으로 계산된값을 4로 치환하고 해당값을 -1를 해준다
            if(number==0) {
                number = 4;
                n -= 1; //3으로 나눈값이기 때문에 추가로 -1를 해준다
            }
            
            //연산의 결과값은 뒤로 붙인다.
            answer.insert(0,number);
        }
       
        return answer.toString();
    }
}
