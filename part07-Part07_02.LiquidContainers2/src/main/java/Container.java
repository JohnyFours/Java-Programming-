/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aleks
 */
public class Container {

    private int amount;

    public Container() {
        this.amount = 0;
    }

    public int contains() {
        return amount;
    }

    public void add(int amountAdd) {
        if (amountAdd < 0) {
            return;
        } else if (this.contains() + amountAdd <= 100) {
            amount += amountAdd;
        } else {
            amount = 100;
        }
    }

    public void remove(int amountRemove) {
        if (amountRemove < 0) {
            return;
        }
        if (this.contains() - amountRemove < 0) {
            amount = 0;
        } else {
            amount += -amountRemove;
        }
    }

    public String toString() {
        return this.contains() + "/100";
    }

}
