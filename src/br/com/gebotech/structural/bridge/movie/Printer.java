package br.com.gebotech.structural.bridge.movie;

import java.util.List;

public abstract class Printer {

    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    protected abstract String getHeader();
    protected abstract List<Detail> getDetails();

}
