/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.ages.components;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author mark
 */
public class CardRow {

    private List<Card> ageA內政牌;
    private List<Card> cardRow;

    public List<Card> getCards() {
        return cardRow;
    }

    public CardRow() {

        Cards cards = new Cards();
        ageA內政牌 = cards.get時代A內政牌();
//        ageA內政牌 = cards.get某時代內政牌(1);//DEBUG 暫用時代1
//        ageA內政牌 = cards.get測試牌(4);//DEBUG 暫用時代1

        cardRow = new ArrayList<>();

        Collections.shuffle(ageA內政牌);

        // only take first 13 cards and discard others
        for (int k = 0; k < 13; k++) {
            cardRow.add(ageA內政牌.get(k));
//            old___cardRow.add(cards.get某時代內政牌(1));
        }
    }
    
      public void show() {
        System.out.println("   === Card Row ===");
        System.out.print("   Value 1: ");
        for (int k = 0; k < 5; k++) {
            System.out.print(k + cardRow.get(k).toString(3));
        }
        System.out.println();
        System.out.print("   Value 2: ");
        for (int k = 5; k < 9; k++) {
            System.out.print(k + cardRow.get(k).toString(2));
        }
        System.out.println();
        System.out.print("   Value 3: ");
        for (int k = 9; k < 13; k++) {
            System.out.print(k + cardRow.get(k).toString(2));
        }
        System.out.println();
    }

}
