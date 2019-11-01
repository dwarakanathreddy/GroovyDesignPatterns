import groovyjarjarantlr.collections.List

class WeatherData implements Subject{
    private def observer_list
    private String temperature
    private String humidity
    private String pressure
    WeatherData(){
        observer_list = []
    }
    public void registerObserver(Observers o){
        observer_list.add(o)
    }

    public void removeObserver(Observers o){
        observer_list.remove(o)
    }

    public void notifyObserver(){
        for(int i=0;i<observer_list.length();i++){
            observer_list[i].updates(temperature, humidity, pressure)
        }
    }

    public void measurementsChanged(){
        notifyObserver()
    }

    public void setMeasurements(String temperature, String humidity, String pressure){
        this.temperature=temperature
        this.pressure=pressure
        this.humidity=humidity
        measurementsChanged()
    }
}