package com.example.databinding2;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class dataViewModel extends ViewModel {
    public MutableLiveData<String> texto = new MutableLiveData<>();

    public dataViewModel() {
        this.texto.setValue("Funciona?");
    }

    public MutableLiveData<String> getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto.setValue(texto);
    }
}
