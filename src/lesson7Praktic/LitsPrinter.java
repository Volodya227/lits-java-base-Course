package lesson7Praktic;

public abstract class LitsPrinter<T> implements  Printer{
    private T printer;
    public LitsPrinter(T printer){
        this.printer=printer;
    }
    public T getPrinter(){
        return printer;
    }

}
