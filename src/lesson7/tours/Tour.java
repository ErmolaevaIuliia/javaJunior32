package lesson7.tours;

public class Tour {
    private int id;
    private String [] countries = new String[15];
    private int days;
    private String typesOfTransport;
    private int stars;
    private int price;
    private String service;

    public Tour (){

    }

    public Tour(int id, int days, String typesOfTransport, int stars, int price, String service){
        this.id = id;
        this.days = days;
        this.typesOfTransport = typesOfTransport;
        this.stars = stars;
        this.price = price;
        this.service = service;
    }

    public void addCountry(String country){
        // цель - добавить в массив со странами в ПЕРВУЮ СВОБОДНУЮ ЯЧЕЙКУ данную страну
        // {"Италия", null, null, ...}
        for(int i = 0; i < countries.length; i++){
            if(countries[i] == null){
                countries[i] = country;
                break; // or return
            }
        }
    }
    /**
     * на все поля сделать методы set
     * на все поля сделать методы get (вернуть значения поля)
     */
}
