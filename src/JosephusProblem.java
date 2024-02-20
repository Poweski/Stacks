import java.util.ArrayList;

public class JosephusProblem {
    ArrayList<Integer> people;
    int k;

    public JosephusProblem (int n, int k) {
        this.people = new ArrayList<>();
        for (int pID = 0; pID < n; pID++) {
            people.add(pID + 1);
        }
        this.k = k;
    }

    public int findTheSurvivor() {
        int counter = 0;
        int personID = 0;
        while (people.size() > 1) {
            if (counter % k == k-1) {
                people.remove(personID--);
            }
            counter++;
            personID++;
            if (personID == people.size()) {
                personID = 0;
            }
        }
        return people.getFirst();
    }
}