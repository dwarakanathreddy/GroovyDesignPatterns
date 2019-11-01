class WeatherStation{
    public static void main(String[] args){
        WeatherData weatherdata = new WeatherData()
        CurrentConditionsDisplay conditiondisplay = new CurrentConditionsDisplay(weatherdata)
        weatherdata.setMeasurements("30","40","50")

    }
}