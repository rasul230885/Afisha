package ru.netology.manager;

import ru.netology.domain.Moviel;

public class AfishaManager {
    private Moviel[] items = new Moviel[0];
    int returnMovies = 10;


    public AfishaManager(int returnMovies) {
        this.returnMovies = returnMovies;
    }

    public AfishaManager() {
    }

    public void add(Moviel item) {
        int length = items.length + 1;
        Moviel[] tmp = new Moviel[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Moviel[] showLast() {
        int length = returnMovies;
        if (length > items.length) {
            length = items.length;
        }
        if (returnMovies <= 0) {
            length = items.length;
        }
        Moviel[] result = new Moviel[length];
        for (int i = 0; i < length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}
