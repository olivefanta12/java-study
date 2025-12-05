package ex05;

import java.util.Scanner;

class Movie {
    String title, director;
    static int count;
    public Movie(String title, String director){
        this.title = title;
        this.director = director;
        count++;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}

public class MovieArrayTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("영화 제목을 입력 : ");
        System.out.println();
        System.out.println("감독을 입력 : ");

        Movie [] list = new Movie[4];
        list[0] = new Movie("백투더 퓨처", "로버트 저메키스");
        list[1] = new Movie("티파니에서 아침을", "에드워드 블레이크");

        for (int i = 2; i < list.length; i++) {
            list[i] = new Movie(scanner.nextLine(), scanner.nextLine());
            System.out.println("==================================");
        }


        for (int i = 0; i < Movie.count; i++) {
            System.out.println("===============================");
            System.out.println("제목 : "+list[i].title);
            System.out.println("감독 : "+list[i].director);
            System.out.println("===============================");
            System.out.println();
        }

    }
}
