import java.util.ArrayList;

public class ViewerStatistics extends Viewer {

    ArrayList<Viewer>viewers;

    public ViewerStatistics(String nickname, int age, int countViewingFilms) {
        super(nickname, age, countViewingFilms);
    }

    public double averageAge(ArrayList<Viewer>viewers) {
        if (viewers.size() == 0) return 0;
        else {
            int countAge = 0;
            int countUser=0;
            for (Viewer viever : viewers
            ) {
                countAge+=viever.getAge();
                countUser++;
            }
             return countAge/countUser;
        }

    }




}
