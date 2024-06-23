package class1;

import java.util.*;
public class ClassStart1 {
    public static void main(String[] args) {
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;
        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;
        System.out.println("이름 : " + student1Name + " 나이 : " + student1Age + " 성적 : " + student1Grade);

        // 베열을 사용해보기
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};
        for(int i = 0; i < studentNames.length; i++){
            System.out.println("이름 : " + studentNames[i] + " 나이 : " + studentAges[i] + " 성적 : " + studentGrades[i]);
        }

        // 공통된 항목들끼리 배열로 만들어줌 > 한 명을 지우려면? 모든 항목을 다 따져가며 지워줘야 함.
        // 학생이라는 개념으로 하나로 묶을 수 있지 않을까 ?! > 클래스 사용.

    }
}
