package br.com.gebotech.factory;

import br.com.gebotech.prototype.Item;

public class Shop extends Website{

    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
