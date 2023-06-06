/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aleks
 */
import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> holdList;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.holdList = new ArrayList<Suitcase>();

    }

    public void addSuitcase(Suitcase suitcase) {
        if (weightOfSuitcases() + suitcase.totalWeight() <= maxWeight) {
            holdList.add(suitcase);
        } else {
            return;
        }
    }

    public int weightOfSuitcases() {
        int weight = 0;

        for (Suitcase e : holdList) {
            weight += e.totalWeight();
        }
        return weight;
    }

    public void printItems() {

        for (Suitcase e : holdList) {

            e.printItems();

        }

    }

    public String toString() {

        String weightOutput = " (" + weightOfSuitcases() + "kg)";
        String suitcaseOutput = "";

        if (holdList.isEmpty()) {
            suitcaseOutput = "no suitcases";
        } else if (holdList.size() == 1) {
            suitcaseOutput = "1 suitcase";
        } else {
            suitcaseOutput = holdList.size() + " suitcases";
        }

        return suitcaseOutput + weightOutput;
    }

}
