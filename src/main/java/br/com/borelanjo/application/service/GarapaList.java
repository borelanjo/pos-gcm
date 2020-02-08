package br.com.borelanjo.application.service;

import java.util.ArrayList;
import java.util.List;

import br.com.borelanjo.domain.service.ValoresItf;

public class GarapaList implements ValoresItf {
    private int maxSize = 10;
    private List<Integer> valores = new ArrayList<>(maxSize);

    @Override
    public boolean inserir(int valor) {
        if (size() == maxSize) {
            return false;
        }

        valores.add(valor);
        return true;
    }

    @Override
    public int deletaPorIndex(int index) {
        if (size() == 0) {
            return -1;
        }

        int valorRemovido = valores.get(index);
        valores.remove(index);

        return valorRemovido;
    }

    @Override
    public int size() {
        return valores.size();
    }

}
