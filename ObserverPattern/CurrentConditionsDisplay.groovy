
class CurrentConditionsDisplay implements Observers, Display{
    String temperature
    String humidity
    String pressure
    private Subject WeatherData

    public CurrentConditionsDisplay(Subject WeatherData){
        this.WeatherData=WeatherData
        WeatherData.registerObserver(this)
    }
    public void updates(String temperature, String humidity, String pressure){
        this.pressure=pressure
        this.humidity=humidity
        this.temperature=temperature
        display()

    }

    public void display(){
        println(temperature)
        println(humidity)
        println(pressure)
    }

}