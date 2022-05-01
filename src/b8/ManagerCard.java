package b8;

import java.util.ArrayList;
import java.util.List;

public class ManagerCard {
    private List<Card> cardList;

    public ManagerCard() {
        this.cardList = new ArrayList<>();
    }

    public void add(Card card){
        this.cardList.add(card);
    }

    public Card check(String id){
        Card card;
        for (Card item : cardList) {
            if(item.getId().equals(id)){
                card = item;
                return card;
            }
        }
        return null;
    }

    public boolean deleteById(String id){
        Card card = check(id);
        if(card == null){
            return false;
        }
        this.cardList.remove(card);
        return true;
    }

    public void showList(){
        for (Card item : cardList) {
            System.out.println(item.toString());
        }
    }
}
