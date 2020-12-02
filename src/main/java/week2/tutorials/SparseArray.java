package week2.tutorials;

import java.util.*;

class CookieList {

    Street street;

    public CookieList(Street street) {
        this.street = street;
    }

    /**
     * Prunes the street, to remove all mean people.
     * @param meanPeople - the list of mean people that will need to be removed from the array of street
     */
    public void pruneStreet(List<String> meanPeople) {
        for (int i = 0; i < street.size(); i++) {
            for (int j = 0; j < meanPeople.size(); j++) {
                if (street.getNeighbour(i).equals(meanPeople.get(j))) {
                    street.removeNeighbour(i);
                    break;
                }
            }
        }
    }

    /**
     * Turns the sparse array containing all nice people in the street into a list,
     * where each element is a House object that stores the house number and name of the inhabitant.
     * @return a list of houses with all the nice people
     */
    public List<House> listAllFriendlyHouses() {
        List<House> answer = new ArrayList<House>();
        int answerIndex = 0;
        for (int i = 0; i < street.size(); i++) {
            if (street.getNeighbour(i) != null) {
                House friendlyHouse = new House(i, street.getNeighbour(i));
                answer.add(answerIndex, friendlyHouse);
                answerIndex++;
            }
        }
        return answer;
    }
}
