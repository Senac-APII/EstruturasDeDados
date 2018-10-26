package br.com.senacrs.lista;

import br.com.senacrs.exception.EmptyListException;

public class Lista <T> implements ListaSimplesmenteEncadeada<T> {
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

    @Override
    public void insereNoFim(T item){
        //TODO: Desenvolver comportamento
    }

    @Override
    public void insereNoInicio(T item){
        //TODO: Desenvolver comportamento
    }

    @Override
    public void visualizaLista(){
        //TODO: Desenvolver comportamento
    }
    @Override
    public T removeDoInicio() throws EmptyListException {
        //TODO: Desenvolver comportamento
        throw new UnsupportedOperationException("Implementar");
    }
    @Override
    public T removeDoFim() throws EmptyListException {
        //TODO: Desenvolver comportamento
        throw new UnsupportedOperationException("Implementar");
    }

    @Override
    public boolean isVazio(){
        //TODO: Desenvolver comportamento
        throw new UnsupportedOperationException("Implementar");
    }
}
