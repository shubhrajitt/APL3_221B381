abstract class Beverage{
    private void pour(int qty){
        System.out.println("add 30ml of your drink");
    }
    protected abstract void addCondiment();
    protected void stir()
    {
        //hook
    }
    private void serve(){
        System.out.println("served by waiter");
    }
    public void templateMethod(int qty){
        pour(qty);
        addCondiment();
        stir();
        serve();
    }
}
