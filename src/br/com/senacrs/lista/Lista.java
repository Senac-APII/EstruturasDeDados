package br.com.senacrs.lista;

import br.com.senacrs.exception.EmptyListException;

public class Lista <T> {
    private NodoSimples<T> primeiro;
    private NodoSimples<T> ultimo;
    private String nome;

    public Lista(){
        this("lista");
    }
    public Lista(String nome){
        this.nome = nome;
        primeiro = ultimo = null;
    }

    public void insereNoFim(T item){
        //TODO: Desenvolver comportamento
    }

    public void insereNoInicio(T item){
        //TODO: Desenvolver comportamento
    }

    public void visualizaLista(T item){
        //TODO: Desenvolver comportamento
    }
    public T removeDoInicio() throws EmptyListException {
        //TODO: Desenvolver comportamento
        throw new UnsupportedOperationException("Implementar");
    }
    public T removeDoFim() throws EmptyListException {
        //TODO: Desenvolver comportamento
        throw new UnsupportedOperationException("Implementar");
    }

    public boolean isVazio(){
        //TODO: Desenvolver comportamento
        throw new UnsupportedOperationException("Implementar");
    }
}
