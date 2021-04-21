package edu.ru.lab08;

/**
 *
 * @author upall
 */
public class Camera {
        
    private String address;
    private String firstApproach;
    private String secondApproach;
    private String goLiveDate;
    private double latitude;
    private double longitude;
   

    public Camera(String address, String firstApproach, String secondApproach, String goLiveDate, double latitude, double longitude) {
        this.address = address;
        this.firstApproach = firstApproach;
        this.secondApproach = secondApproach;
        this.goLiveDate = goLiveDate;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFirstApproach() {
        return firstApproach;
    }

    public void setFirstApproach(String firstApproach) {
        this.firstApproach = firstApproach;
    }

    public String getSecondApproach() {
        return secondApproach;
    }

    public void setSecondApproach(String secondApproach) {
        this.secondApproach = secondApproach;
    }

    public String getGoLiveDate() {
        return goLiveDate;
    }

    public void setGoLiveDate(String goLiveDate) {
        this.goLiveDate = goLiveDate;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    
    public double getDistanceTo(double latitude, double longitude) {
        double distance;
        
        //distance calculation.
            double a = this.latitude - latitude; // * distPerLat(this.latitude);
            double b = this.longitude- longitude; //* distPerLng(this.longitude);
            
            distance = Math.sqrt(a*a + b*b);
            
            return distance;
        
    }

    private double distPerLng(double lng){
      return 0.0003121092*Math.pow(lng, 4)
             +0.0101182384*Math.pow(lng, 3)
                -17.2385140059*lng*lng
             +5.5485277537*lng+111301.967182595;
    }

    private double distPerLat(double lat){
        return -0.000000487305676*Math.pow(lat, 4)
            -0.0033668574*Math.pow(lat, 3)
            +0.4601181791*lat*lat
            -1.4558127346*lat+110579.25662316;
    }

}
