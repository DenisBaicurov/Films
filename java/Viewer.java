public class Viewer {

  private   String nickname;
 private    int age;
   private int countViewingFilms;

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
        return countViewingFilms;
    }

    public void setCountViewingFilms(int countViewingFilms) {
        this.countViewingFilms = countViewingFilms;
    }
}
