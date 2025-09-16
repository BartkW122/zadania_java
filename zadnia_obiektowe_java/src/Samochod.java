public class Samochod {

    public String maraka;
    public String model;
    public int rokProdukcji;
    private int przebieg;

    public void jedz(int km){
        if(km>0){
            this.przebieg+km;
        }
    }

    public void setPrzebieg(int przebieg){
        if(przebieg< 0){
            throw new IllegalAccessException("przebieg nie moze byc ujemny!!")''
        }
    }

    public void przedstaw(){
        System.out.println("przebieg:"+ this.przebieg);
    }
}
