import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 백준 10814 : 나이순 정렬
 * 나이 : 오름차순, 같으면 가입순서
 *
 */
public class prb_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Person[] people = new Person[N];

        // Input
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            people[i] = new Person(Integer.parseInt(st.nextToken()), st.nextToken());
        }

        // Sort
        Arrays.sort(people, Person::compareTo);

        // Output
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<N; i++){
            sb.append(people[i]);
        }

        System.out.println(sb);

    }
    public static class Person implements Comparable<Person>{
        int age;
        String name;

        Person(int age, String name){
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Person person){
            return age-person.age;
        }
        @Override
        public String toString(){
            return age + " " + name + "\n";
        }
    }

}

