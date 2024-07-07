import java.util.ArrayList;
import java.util.Scanner;

public class CinemaApplicationRun {

    public Viewer getViewer(){
        int age=0;
        int countViewingFilms=0;
        System.out.println("Введите никнейм пользователя");
        Scanner scanner=new Scanner(System.in);
        String nickname=scanner.nextLine();
        System.out.println("Введите возраст пользователя");
      try {
          age =scanner.nextInt();
      }
        catch (IllegalArgumentException e){
            System.err.println("Некоррекный возраст , повторите ввод");
           getViewer();
        }
        System.out.println("Введите количество просматриеваемых фильмов");
        try {
          countViewingFilms=scanner.nextInt();
        }
           catch (IllegalArgumentException e){
               System.err.println("Некоректное число фильмов, повторите ввод");
               getViewer();
           }

       if (age<5||age>100||countViewingFilms<0){
           System.err.println("Некоректные данные");
           getViewer();
       }
        scanner.close();

       return new Viewer(nickname,age,countViewingFilms);
    }

    public double getAverageAge(){
        int count=0;
        double averageAge=0;
        ArrayList<Viewer>viewers=new ArrayList<>();
        while (count<5){
            Viewer viewer=getViewer();
            viewers.add(viewer);
            count++;
        }
        for (Viewer viewer:viewers
             ) {
            averageAge+=viewer.getAge();
        }
        return averageAge/count;
    }




}
