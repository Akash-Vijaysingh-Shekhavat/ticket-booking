package ticket.booking.entities;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Train {

    private String trainId;
    private String trainNo;
    private Date departTime;
    private Date arrivalTime;
    private List<List<Integer>> seats;
    private Map<String, Time> station;
    private List<String> stations;

    public Train(String trainId, String trainNo, Date departTime, Date arrivalTime, List<List<Integer>> seats, Map<String, Time> station, List<String> stations) {
        this.trainId = trainId;
        this.trainNo = trainNo;
        this.departTime = departTime;
        this.arrivalTime = arrivalTime;
        this.seats = seats;
        this.station = station;
        this.stations = stations;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public Date getDepartTime() {
        return departTime;
    }

    public void setDepartTime(Date departTime) {
        this.departTime = departTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public List<List<Integer>> getSeats() {
        return seats;
    }

    public void setSeats(List<List<Integer>> seats) {
        this.seats = seats;
    }

    public Map<String, Time> getStation() {
        return station;
    }

    public void setStation(Map<String, Time> station) {
        this.station = station;
    }

    public List<String> getStations() {
        return stations;
    }

    public void setStations(List<String> stations) {
        this.stations = stations;
    }

    public String getTrainInfo(){
        return String.format("Train ID: %s Train No: %s", trainId, trainNo);
    }





}
