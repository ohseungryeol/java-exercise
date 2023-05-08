import java.util.*;

class Solution {
    Set<Integer> set;// numbers로 조합 가능한 모든 수를 저장해야하는데 해당 수의 size를 모르고, 중복을 제거해야하므로 set으로 선언

    //numbers에 있는 문자들을 조합해서 set에 저장하는 comb함수. 재귀로 구현
    public void comb(char[] numbers, StringBuilder sb, boolean[] visited){
        if(sb.length() > 0){ // 조합한 문자열이 있으면 set에 넣어줌
            set.add(Integer.parseInt(sb.toString()));// 문자를 정수로 변환하면서 011 같은 문자열은 11로 처리됨
        }

        for(int i=0; i<numbers.length; i++){// numbers에 있는 문자를 하나씩 접근하기 위한 for문
            if(!visited[i]){// 해당 문자가 선택되지 않았으면
                visited[i] = true;// 해당 문자를 선택하여 StringBuilder에 추가해주기
                sb.append(numbers[i]);
                comb(numbers, sb, visited);// 선택하지 않은 다른 문자를 선택하기 위해 comb메소드를 재귀로 호출
                sb.deleteCharAt(sb.length() - 1);// 재귀 호출이 완료되면 선택했던 문자를 제거하고
                visited[i] = false;// 체크한 선택 유무를 다시 원래대로 돌려놓음
            }
        }
    }

    //n이 소수인지 확인하는 메소드
    public boolean isPrime(int n){
        if(n < 2) return false; //1과 0은 소수가 아니므로 바로 false로 반환

        // 2부터 n의 제곱근(Math.sqrt(n)) or n/2까지 나눴을 때 나누어 떨어지는 숫자가 있으면 소수가 아님
        for(int i=2; i<=n/2; i++){
            if(n % i == 0)
                return false;
        }
        return true; // 위의 경우가 아니면 소수이므로 true 반환
    }

    public int solution(String numbers) {
        int cnt = 0;// 문제가 원하는 return 값인 소수의 개수를 저장할 변수
        set= new HashSet<>();// 소수를 저장할 list의 공간을 할당

        // comb함수를 호출하여
        comb(numbers.toCharArray(), new StringBuilder(), new boolean[numbers.length()]);
        // 조합해야할 문자들이 있는 배열, 문자들을 조합할 StringBuilder, StringBuilder에 해당 문자를 append했는지 체크할 boolean배열

        for(int n : set){ //set은 Iterator로 접근가능
            if(isPrime(n))// 해당 숫자가 소수일 경우 cnt 증가
                cnt++;
        }
        return cnt;
    }
}
