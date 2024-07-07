import java.util.List;

public class Viewer {

  private   String nickname;
 private    int age;
   private int countViewingFilms;
   private List<String>films;


    public Viewer(String nickname, int age, int countViewingFilms) {
        this.nickname = nickname;
        this.age = age;
        this.countViewingFilms = countViewingFilms;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCountViewingFilms() {
        return films.size();
    }

    public void setCountViewingFilms(int countViewingFilms) {
        this.countViewingFilms = countViewingFilms;
    }

    public List<String> getFilms() {
        return films;
    }

    public void setFilms(List<String> films) {
        this.films = films;
    }
}
