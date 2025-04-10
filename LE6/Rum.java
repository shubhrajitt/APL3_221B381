class Rum extends Decorator{
    Rum(Offering offering){
        this.offering = offering; 
    }
    
    String getName(){
        return offering.getName() + " ";
    }
    int getPrice(){
        return offering.getPrice() + 55;
    }
}
